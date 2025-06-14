circumference=function(r)
{
  2*pi*r
}
print(circumference(2))

f=function(r)
set.seed(1)
seq=c()
for(i in 1:100000)
{
  cnt=0
  tot=0
  while(cnt<2)
  {
    tot=tot+1
    if(rbinom(1,1,0.5)==1) {
      cnt=cnt+1
    }
    else {
      cnt=0
    }
  }
  seq=append(seq,tot)
}
print(mean(seq))

