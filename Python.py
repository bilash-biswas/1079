n=int(input())
for i in range(0,n):
    a,b,c=input().split()
    a=float(a)
    b=float(b)
    c=float(c)
    v=(a*2 + b*3 + c*5)/10
    print("{0:.1f}".format(v))
