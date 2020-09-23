package basic

/**
 * @Description TODO
 * @Author marshal
 * @Date 21/9/20 8:46 AM
 */
object Functions extends App {

  val add = (x: Int, y: Int) => x + y
  println(add(10, 20)) // 30

  val greeting = () => println("Hello Scala")
  greeting // Hello Scala

}
