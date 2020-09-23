package datastructure

/**
 * @Description TODO
 * @Author marshal
 * @Date 20/9/20 9:55 PM
 *
 *      tuple is immutable
 */
object TupleTest extends App {

  // the max length is 22, Tuple22
  val pair = (100, "abc") // => Tuple2[Int, String]
  println(pair._1) // 100
  println(pair._2) // abc

}
