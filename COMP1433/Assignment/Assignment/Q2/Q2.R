# Question 2(a)
set.seed(1234)
y=rnorm(10000,0.02,0.05)
x=exp(y)
hist(x,probability=TRUE)

# Question 2(b)
xx=pretty(c(0.8,1.3),10000)
xx=xx[1:length(xx)-1]
yy=dlnorm(xx,0.02,0.05)
lines(xx,yy)

# Question 2(d)
## The ans of this question is stored in the variable ans
set.seed(1234)
seq=rnorm(10000,0.02,0.05)
seq=exp(seq)
ans=sum(seq>=1.05)/length(seq)
print(ans)

# Question 2(e)
## The ans of this question is stored in the variable true_ans
true_ans=plnorm(1.05,0.02,0.05,lower.tail=FALSE)
print(true_ans)
