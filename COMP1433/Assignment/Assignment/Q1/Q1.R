numofclusters=5
numofiterations=100
# Read the data from the file
dat=read.csv("./Customers.csv")
# Generate the original centers
ct=data.frame(c(5,20,100,70,120),c(5,90,10,50,100))
names(ct)=c("Annual_Income","Spending_Score")
Jcluster=c() # Contain the record of J_cluster
dat$ClusterID=dat$CustomerID

Get_New_Cluster=function(x)
{
    ct$Currentdis=sqrt((as.numeric(x['Annual_Income'])-ct$Annual_Income)**2+(as.numeric(x['Spending_Score'])-ct$Spending_Score)**2)
  newJcluster<<-newJcluster+min(ct$Currentdis)**2
  return(min(which(ct$Currentdis==min(ct$Currentdis),arr.ind=TRUE)))
}
# The main body of iteration
for(t in 1:numofiterations)
{
  # Calculate the closest center point
  newJcluster=0
  dat$ClusterID=apply(dat,1,Get_New_Cluster)
  ct$Currentdis=NULL
  # Calculate the new center points
  newct=ct
  for(i in 1:numofclusters)
  {
    newct$Annual_Income[i]=sum(dat$Annual_Income[dat$ClusterID==i])/sum(dat$ClusterID==i)
    newct$Spending_Score[i]=sum(dat$Spending_Score[dat$ClusterID==i])/sum(dat$ClusterID==i)
  }
  # Jump out of the iteration if the center points do not change
  if(sum(newct==ct)==2*numofclusters)
  {
    break
  }
  
  # Change the center points
  ct=newct
  
  # Record the change of Jcluster
  Jcluster=append(Jcluster,newJcluster/nrow(dat))
}

# Visualize the data
library(ggplot2)
# Visualize the clustered points
colors=c("red","green","blue","purple","brown")
ggplot(dat)+geom_point(mapping=aes(x=Annual_Income,y=Spending_Score,color=colors[ClusterID]))+labs(color="Clusters")
# Visualize the change of Jcluster
result=data.frame(Jcluster,c(1:length(Jcluster)))
names(result)=c("Jcluster","IterationTime")
ggplot(result)+geom_line(mapping=aes(x=IterationTime,y=Jcluster))