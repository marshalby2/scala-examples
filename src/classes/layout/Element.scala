package classes.layout

/**
 * @Description TODO
 * @Author marshal
 * @Date 23/9/20 11:33 AM
 */
abstract class Element {
  def contents: Array[String]
  def height: Int = contents.length
  def width: Int = if (height == 0) 0 else contents(0).length
}
