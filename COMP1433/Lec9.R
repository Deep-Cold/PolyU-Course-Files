set.seed(1)
x=rnorm(10)

set.seed(20)
x=rnorm(100)
e=rnorm(100,0,2)
y=0.5+2*x+e
summary(y)
plot(x,y)

set.seed(10)
x=rbinom(100,1,0.5)
str(x)
e=rnorm(100,0,2)
y=0.5+2*x+e
plot(x,y)

set.seed(1)
sample(1:10,4)
sample(1:10,4)
sample(letters,5)
sample(1:10,replace=TRUE)
sample(1:10)
sample(1:10)

library(datasets)
data("airquality")
head(airquality)

set.seed(20)
idx=seq_len(nrow(airquality))
samp=sample(idx,6)
airquality[samp,]

pm0=read.table("D:/Homework/COMP1433/PM25/RD_501_88101_1999-0.txt",comment.char='#',header=FALSE,sep="|",na.string="")
dim(pm0)
head(pm0[,1:13])
cnames=readLines("D:/Homework/COMP1433/PM25/RD_501_88101_1999-0.txt",1)
cnames=strsplit(cnames,"|",fixed=TRUE)
names(pm0)=make.names(cnames[[1]])
head(pm0[,1:13])

x0=pm0$Sample.Value
summary(x0)
mean(is.na(x0))

pm1=read.table("D:/Homework/COMP1433/PM25/RD_501_88101_2012-0.txt",comment.char='#',header=FALSE,sep='|',na.string="",nrow=1304290)
names(pm1)=make.names(cnames[[1]])
x1=pm1$Sample.Value
boxplot(log2(x0),log2(x1))
summary(x0)
summary(x1)

negative=x1<0
mean(negative,na.rm=TRUE)
dates=pm1$Date
dates=as.Date(as.character(dates),"%Y%m%d")

hist(dates,"month")
hist(dates[negative],"month")
site0=unique(subset(pm0,State.Code==36,c(County.Code,Site.ID)))
site1=unique(subset(pm1,State.Code==36,c(County.Code,Site.ID)))
site0=paste(site0[,1],site0[,2],sep='.')
site1=paste(site1[,1],site1[,2],sep='.')
str(site0)
str(site1)
both=intersect(site0,site1)
print(both)
pm0$county.site=with(pm0,paste(County.Code,Site.ID,sep="."))
pm1$county.site=with(pm1,paste(County.Code,Site.ID,sep="."))
cnt0=subset(pm0,State.Code==36&county.site %in% both)
cnt1=subset(pm1,State.Code==36&county.site %in% both)
sapply(split(cnt0,cnt0$county.site),nrow)
sapply(split(cnt1,cnt1$county.site),nrow)
both.county=63
both.id=2008
pm0sub=subset(pm0,State.Code==36&County.Code==both.county&Site.ID==both.id)
pm1sub=subset(pm1,State.Code==36&County.Code==both.county&Site.ID==both.id)
dates0=as.Date(as.character(pm0sub$Date),"%Y%m%d")
dates1=as.Date(as.character(pm1sub$Date),"%Y%m%d")
x0sub=pm0sub$Sample.Value
x1sub=pm1sub$Sample.Value
rng=range(x0sub,x1sub,na.rm=TRUE)
plot(dates0,x0sub,pch=20,ylim=rng,xlab="",ylab=expression(PM[2.5]*"("*mu*g/m^3*")"))


mn0=with(pm0,tapply(Sample.Value,State.Code,mean,na.rm=TRUE))
mn1=with(pm1,tapply(Sample.Value,State.Code,mean,na.rm=TRUE))
d0=data.frame(state=names(mn0),mean=mn0)
d1=data.frame(state=names(mn1),mean=mn1)
mrg=merge(d0,d1,by="state")
head(mrg)
rng=range(mrg[,2],mrg[,3])
with(mrg,plot(rep(1,52),mrg[,2],xlim=c(.5,2.5),ylim=rng,xaxt="n",xlab="",ylab="State-wide Mean PM"))
with(mrg,points(rep(2,52),mrg[,3]))
segments(rep(1,52),mrg[,2],rep(2,52),mrg[,3])
axis(1,c(1,2),c("1999","2012"))
