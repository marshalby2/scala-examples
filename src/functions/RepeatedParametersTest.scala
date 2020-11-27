package functions

/**
 * @Description TODO
 * @Author marshal
 * @Date 21/11/20 9:33 AM
 */
object RepeatedParametersTest extends App{

  def echo(args: String*) = for (arg <- args) println(arg)

  def echoInt(ints: Int*) = for (i <- ints) println(i)

  echo("one", "two", "three")
  echoInt(1, 2, 3)


  // 将数组当做可变参数传进去
  var arr = Array.range(0, 5)
  echoInt(arr: _*)



  def multiple(a: Int, b: Int = 10) = a * b

  multiple(10) // 100
  multiple(10, 20) // 200

}
