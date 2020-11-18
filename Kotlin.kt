import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`);
    var N = input.nextInt();
    var i:Double
    var a:Double
    var b:Double
    var c:Double
    for(i in 1..N){
        a=input.nextDouble();
        b=input.nextDouble();
        c=input.nextDouble();

        System.out.printf("%.1f\n",(a*2 + b*3 + c*5)/10);
    }
}


