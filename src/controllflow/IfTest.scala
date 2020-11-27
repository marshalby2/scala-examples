package controllflow

/**
 * @Description TODO
 * @Author marshal
 * @Date 18/11/20 11:33 PM
 */
object IfTest extends App {

  def max(x: Int, y: Int) = {
    if (x > y) x else y
  }

  print("The max is : " + max(10, 20))
}
