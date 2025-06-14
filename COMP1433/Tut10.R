set.seed(123)
start_wager=10000
toss=sample(c(-100,100),replace=TRUE,size=100)
result=cumsum(c(start_wager,toss))-c(0:100)
library(ggplot2)
times=c(0:100)
data=data.frame(times,result)
ggplot(data,aes(x=times,y=result))+geom_line()+labs(title="Wager Change",x="Time",y="Wager")

get_result=function()
{
  toss=sample(c(-100,100),replace=TRUE,size=100)
  result=sum(c(10000,toss))
  return(result)
}
set.seed(123)
start_wager=10000
result=replicate(100,get_result())
id=c(1:100)
data=data.frame(id,result)
ggplot(data,aes(x=id,y=result))+geom_point()+labs(title="Final Wager",x="ID",y="Wager")

plot.new()
for(i in 1:100)
{
  start_wager=10000
  x=c(0:100)
  toss=sample(c(-100,100),replace=TRUE,size=100)
  y=cumsum(c(start_wager,toss))-c(0:100)
  if(i==1)
  {
    plot(x,y,type='l')
  }
  else
  {
    lines(x,y,type='l')
  }
}

set.seed(123)
num_infected=30
num_normal=970
num_recover=0
num=c()
x=c(1:30)
for(i in 1:30)
{
  number_infect=sum(rbinom(num_normal,1,0.3))
  num_recover=num_recover+floor(num_infected*0.05)
  num_infected=num_infected+number_infect-floor(num_infected*0.05)
  num_normal=num_normal-number_infect
  num[i]=num_infected
}
library(ggplot2)
data=data.frame(x,num)
ggplot(data,aes(x=x,y=num))+geom_line()
