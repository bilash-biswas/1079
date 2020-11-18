import java.util.Scanner;
object Main {
  def main(args:Array[String]){ 
    val input = new Scanner(System.in)
    var N = input.nextInt()
    for(i <- 1 to N){
        var a=input.nextDouble()
        var b=input.nextDouble()
        var c=input.nextDouble()

        println("%.1f".format((a*2 + b*3 + c*5)/10))
    }
}
}
 
