a={}
b={}
c={}
v={}
n=io.read("*n")
for i=1,n do
    a[i]=io.read("*n")
    b[i]=io.read("*n")
    c[i]=io.read("*n")
end
for i=1,n do
    v[i]=(a[i]*2+b[i]*3+c[i]*5)/10.0
    print(string.format( "%.1f",v[i] ))
end
