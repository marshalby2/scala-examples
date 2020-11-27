package classes

/**
 * @Description TODO
 * @Author marshal
 * @Date 19/11/20 12:57 AM
 */
object RationalTest extends App {
  val x = new Rational(1, 3)
  println(x)
  val y = new Rational(5, 10)
  println(y)

  println(x.+(y)) // 5/6
  println(x * y)  // 1/6
}
