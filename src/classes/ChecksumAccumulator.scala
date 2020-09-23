package classes

import scala.collection.mutable

/**
 * @Description TODO
 * @Author marshal
 * @Date 21/9/20 8:41 AM
 */

// companion class
class ChecksumAccumulator {

  private var sum = 0

  // method parameter in scala are vals, not vars
  def add(b: Int): Unit = {
    //    b = 1 // so, this is can't compile , because b is val
    sum += b
  }

  def checkSum(): Int = {
    ~(sum & 0xFF) + 1
  }
}

// companion object
object ChecksumAccumulator {

  private val cache = mutable.Map.empty[String, Int]

  def calculate(s: String) = {
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccumulator
      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checkSum()
      cache += (s -> cs)
      cs
    }
  }

}
