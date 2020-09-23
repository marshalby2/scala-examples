package functional

/**
 * @Description TODO
 * @Author marshal
 * @Date 22/9/20 11:37 AM
 */
object RationalTest extends App {

  val r1 = new Rational(1, 3) // 1/3
  println(r1 * 2) // 2/3

  //  println(2 * r1)  // 2 * r1 is error
  // to resolve above problem, this is called implicit conversion
  implicit def intToRational(x: Int): Rational = new Rational(x)
  println(2 * r1)

  println(1.getClass)

}
