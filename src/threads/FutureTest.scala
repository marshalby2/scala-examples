package threads

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

/**
 * @Description TODO
 * @Author marshal
 * @Date 21/11/20 2:06 PM
 */
object FutureTest extends App {

  val fut = Future {
    Thread.sleep(10000)
    21 + 21
  }

}
