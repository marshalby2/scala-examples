package basic

/**
 * @Description TODO
 * @Author marshal
 * @Date 19/9/20 3:52 PM
 *
 * reference : https://docs.scala-lang.org/tour/unified-types.html
 */
object DataType extends App {

  var any: Any = "123"
  println(any.getClass) // class java.lang.String
  println(AnyRef.getClass) // class scala.package$$anon$1

  var i: Int = 10
  var d: Double = 10.4

}
