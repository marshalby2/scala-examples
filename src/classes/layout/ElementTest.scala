package classes.layout

/**
 * @Description TODO
 * @Author marshal
 * @Date 23/9/20 9:21 PM
 */
object ElementTest extends App {

  val ae = new ArrayElement(Array("Hello", "Scala"))
  println(ae.height)
  println("================ LineElement ===================")
  val le = new LineElement("Java")
  println(le.height)

}
