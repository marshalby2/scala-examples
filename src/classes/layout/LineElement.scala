package classes.layout

/**
 * @Description TODO
 * @Author marshal
 * @Date 24/9/20 3:07 PM
 */
class LineElement(s: String) extends ArrayElement(Array(s)) {
  // invoke superclass's constructor

  override def height: Int = s.length
  override def width: Int = 1

}
