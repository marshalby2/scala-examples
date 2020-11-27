package generics

/**
 * @Description TODO
 * @Author marshal
 * @Date 19/11/20 10:30 AM
 */
abstract class Printer[-A] {
  def print(value: A)
}
