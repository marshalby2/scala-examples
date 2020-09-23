package controlabstraction

/**
 * @Description TODO
 * @Author marshal
 * @Date 23/9/20 11:07 AM
 */
object ByNameParameters extends App {

  val assertionsEnable = false
  def byNameAssert(predicate: => Boolean) = if (assertionsEnable && !predicate) throw new AssertionError

  def boolAssert(predicate: Boolean) = if (assertionsEnable && !predicate) throw new AssertionError

  byNameAssert(5 / 0 == 0 )

  boolAssert(5 / 0 == 0 )


}
