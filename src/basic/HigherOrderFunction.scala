package basic

/**
 * @Description TODO
 * @Author marshal
 * @Date 19/9/20 4:08 PM
 */
object HigherOrderFunction extends App {
  var nums = Array.range(0, 10);
  val isEven = (x: Int) => (x % 2 == 0)
  nums filter isEven foreach println
}
