package classes

/**
 * @Description TODO
 * @Author marshal
 * @Date 21/9/20 9:06 AM
 */
object Summer{

  def main(args: Array[String]): Unit = {
    // like a static method in java
    val x = ChecksumAccumulator.calculate("Every value is an object")
    println(x)
  }

}
