package functions

/**
 * @Description TODO
 * @Author marshal
 * @Date 22/9/20 7:31 PM
 */
object ClosureTest extends App {

  var more = 1
  val addMore = (x: Int) => x + more
  println(addMore(10)) // 11
  println(addMore(100)) // 101

  def makeIncrease(more: Int) = (x: Int) => x + more
  val inc1 = makeIncrease(1)
  val inc999 = makeIncrease(999)

  println(inc1(10)) // 11
  println(inc999(10)) // 1009
}
