import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int N = input.nextInt();
    double i,a,b,c;
    for(i=0;i<N;i++){
        a=input.nextDouble();
        b=input.nextDouble();
        c=input.nextDouble();
        
        System.out.printf("%.1f\n",(a*2 + b*3 + c*5)/10);
    }
}
}
