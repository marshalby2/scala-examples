package implicits.parameters

/**
 * @Description TODO
 * @Author marshal
 * @Date 19/11/20 10:20 PM
 */
abstract class Monoid[A] {
  def add(x: A, y: A): A
  def unit: A
}
