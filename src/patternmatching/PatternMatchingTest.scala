package patternmatching

import scala.util.Random

/**
 * @Description TODO
 * @Author marshal
 * @Date 19/11/20 9:08 AM
 */
object PatternMatchingTest extends App {

//  val num = 5
  val x = Random.nextInt(10)
  val result = x match {
    case 0 => "zero"
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
//    case num => "five"
    case _ => "many"
  }

  println(x)

  //  def simplifyTop(expr: Expr): Expr = expr match {
  //    case UnOp("-", UnOp("-", e)) => e
  //    case _ => expr
  //  }

}
