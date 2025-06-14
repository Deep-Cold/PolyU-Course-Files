estimate_pi = function(seed=28,iterations=10000000)
{
  set.seed(seed)
  x=runif(n=iterations,min=0,max=1)
  y=runif(n=iterations,min=0,max=1)
  sum_sq_xy=sqrt(x^2+y^2)
  index_within_circle=which(sum_sq_xy<=1)
  points_within_circle=length(index_within_circle)
  pi_est=4*points_within_circle/iterations
  return(pi_est)
}

estimate_demand=function(seed=10,days=100)
{
  set.seed(seed)
  x=c(10000,20000,40000,60000)
  probability=c(0.1,0.35,0.3,0.25)
  demand=sample(x,days,replace=TRUE,prob=probability)
  return(sum(demand))
}

trail=function(n)
{
  sum(sample(c(0,1),n,replace=TRUE))
}

estimate_coin=function(seed=10,iteration=10000)
{
  set.seed(seed)
  n=10
  k=3
  result=replicate(iteration,trail(n))
  library(ggplot2)
  data=data.frame(factor(result))
  ggplot(data)+geom_bar(mapping=aes(x=result))+labs(title="Coin Flipping Simulation",x="No. of heads-up in 10 runs",y="Count")
  t=sum(result<=3)
  return(t/iteration)
}

dbinom(3,size=10,prob=0.5)
pbinom(3,size=10,prob=0.5,lower.tail=TRUE)
pbinom(3,size=10,prob=0.5,lower.tail=FALSE)
estimate_coin()

estimate_stock=function(seed=20,days=365)
{
  set.seed(seed)
  changes=rnorm(days,mean=1.001,sd=0.005)
  price=cumprod(c(30,changes))
  return(price)
}

day_idx=c(1:366)
price=estimate_stock()
data=data.frame(day_idx,price)
library(ggplot2)
ggplot(data,mapping=aes(x=day_idx,y=price))+geom_line()+geom_smooth()+labs(title="Stock Price Prediction over 365 days",x="Day",y="Price")

set.seed(10)
rate=5
trail=10000
hits=rpois(trail,rate)
library(ggplot2)
data=data.frame(hits)
ggplot(data)+geom_bar(mapping=aes(x=hits,y=after_stat(prop)))+labs(title="Numver of hit on website within one minute",x="Number of hits",y="Count")

dpois(17,15)
ppois(17,15,lower.tail=TRUE)
waitingTime=rexp(50,5)
mean(waitingTime)
waitingTime

hist(waitingTime,breaks=20)

serviceTime=rnorm(100,0.9,0.25)
firstArrival=1.0
interArrivalTime=rexp(99,1)
arrivalTime=cumsum(c(firstArrival,interArrivalTime))
leaveTime=0.0
waitTime=0.0
waitTimeAll=array(0,100)
for(i in 1:100)
{
  waitTime=max(0,leaveTime-arrivalTime[i])
  leaveTime=arrivalTime[i]+waitTime+serviceTime[i]
  waitTimeAll[i]=leaveTime-arrivalTime[i]
}
library(ggplot2)
customer_id=c(1:100)
data=data.frame(customer_id,waitTimeAll)
ggplot(data,aes(x=customer_id,y=waitTimeAll))+geom_point(col="blue")+labs(title="ATM Customer Waiting Time Analysis",x="Customer ID",y="Wait Time")
