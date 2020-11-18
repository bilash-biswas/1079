using System.IO;
using System;

class Program
{
    static void Main()
    {
    double a,b,c,v;
    int n,i;
    n=Convert.ToInt32(Console.ReadLine());
    for(i=0;i<n;i++)
    {
        var p = Console.ReadLine().Split();
        a = Double.Parse(p[0]);
        b = Double.Parse(p[1]);
        c = Double.Parse(p[2]);
        v=(a*2+b*3+c*5)/10.0;
     Console.WriteLine(string.Format("{0:0.0}", v));
    }
    }
}
