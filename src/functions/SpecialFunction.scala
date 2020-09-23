package functions

/**
 * @Description TODO
 * @Author marshal
 * @Date 22/9/20 7:58 PM
 */
object SpecialFunction extends App {

  println("=========== repeated parameter ============")
  // 1. repeated parameter
  def echo(args: String*) = for (s <- args) print(s)
  echo("Hello", " Scala") // Hello Scala
  var arr = Array("Hello", " Java")
  echo(arr: _*) // Hello Java

  println("=========== named arguments ============")
  // 2. named arguments
  def speed(distance: Float, time: Float) = distance / time
  // normal call
  speed(100, 10)
  // indicate parameters
  speed(distance = 100, time = 10)
  // arguments can be reverse
  speed(time = 10, distance = 100)

  println("=========== default parameter value ============")
  // 3. default parameter value
  def printTime(out: java.io.PrintStream = Console.out) = out.println("Time : " + System.currentTimeMillis())
  printTime() //  Time : 1600776722887
  printTime(out = Console.err) // Time : 1600776754940(red)

}
