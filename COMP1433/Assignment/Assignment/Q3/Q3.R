# Read the data from the file
dat=read.csv("./house_prices_dataset.csv")

# Question 3(a)

## Create the linear regression models
model1=lm(House_Price~House_Area,data=dat)
model2=lm(House_Price~Distance_to_Center,data=dat)
model3=lm(House_Price~House_Age,data=dat)
model4=lm(House_Price~House_Condition,data=dat)

## Visualize the linear regression models
layout(matrix(1:4,nrow=2,ncol=2,byrow=TRUE))
layout.show(4)
attach(dat,warn.conflicts=FALSE)
plot(House_Area,House_Price,type='p',main='House_Price~House_Area')
abline(model1$coefficients)
text(x=150,y=600000,paste("House_Price =",as.character(model1$coefficients[2]),"* House_Area +",as.character(model1$coefficients[1])))
plot(Distance_to_Center,House_Price,type='p',main='House_Price~Distance_to_Center')
abline(model2$coefficients)
text(x=11,y=600000,paste("House_Price =",as.character(model2$coefficients[2]),"* Distance_to_Center +",as.character(model2$coefficients[1])))
plot(House_Age,House_Price,type='p',main='House_Price~House_Age')
abline(model3$coefficients)
text(x=25,y=600000,paste("House_Price =",as.character(model3$coefficients[2]),"* House_Age +",as.character(model3$coefficients[1])))
plot(House_Condition,House_Price,type='p',main='House_Price~House_Condition')
abline(model4$coefficients)
text(x=6,y=600000,paste("House_Price =",as.character(model4$coefficients[2]),"* House_Condition +",as.character(model4$coefficients[1])))
detach(dat)

# Question 3(b)
## The answer to this question is stored in the variable ans
model=lm(House_Price~House_Area+Distance_to_Center,data=dat)
ans=predict(model,data.frame(House_Area=250,Distance_to_Center=5))
print(ans)

# Question 3(c)
ave=mean(dat$House_Price)
## The function to Count R^2
Count=function(model)
{
  SST=sum(dat$ST)
  dat$Predict_Price=predict(model,dat)
  dat$SR=(dat$Predict_Price-ave)**2
  SSR=sum(dat$SR)
  return(SSR/SST)
}

model1=lm(House_Price~House_Area+Distance_to_Center,data=dat)
model2=lm(House_Price~House_Area+House_Age,data=dat)
model3=lm(House_Price~House_Area+House_Condition,data=dat)
model4=lm(House_Price~Distance_to_Center+House_Age,data=dat)
model5=lm(House_Price~Distance_to_Center+House_Condition,data=dat)
model6=lm(House_Price~House_Age+House_Condition,data=dat)
dat$ST=(dat$House_Price-ave)**2
R1=Count(model1)
R2=Count(model2)
R3=Count(model3)
R4=Count(model4)
R5=Count(model5)
R6=Count(model6)
print(paste(sep='',"The R-squared values for all the models are ",as.character(R1),", ",as.character(R2),", ",as.character(R3),", ",as.character(R4),", ",as.character(R5),", ",as.character(R6),". So the best model is Model 2"))
