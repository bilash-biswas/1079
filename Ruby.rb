a=gets().chomp().to_i
b=Array.new()
c=Array.new()
d=Array.new()
v=Array.new()
for i in 1..a
    b[i],c[i],d[i]=gets().chomp().split(' ');
    b[i]=b[i].to_f
    c[i]=c[i].to_f
    d[i]=d[i].to_f
end
for i in 1..a
  v[i]=(b[i]*2+c[i]*3+d[i]*5)/10.0
  printf("%.1f\n",v[i]);
end
