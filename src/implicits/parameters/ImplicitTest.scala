package implicits.parameters

/**
 * @Description TODO
 * @Author marshal
 * @Date 19/11/20 10:21 PM
 */
object ImplicitTest {

  // 隐式变量
  implicit val stringMonoid: Monoid[String] = new Monoid[String] { // 匿名类
    override def add(x: String, y: String): String = x concat y

    override def unit: String = ""
  }

  implicit val intMonoid: Monoid[Int] = new Monoid[Int] {
    override def add(x: Int, y: Int): Int = x + y

    override def unit: Int = 0
  }

  def sum[A](xs: List[A])(implicit m: Monoid[A]): A =
    if (xs.isEmpty) m.unit else m.add(xs.head, sum(xs.tail))


  def main(args: Array[String]): Unit = {
    // 调用隐式参数intMonoid
    println(sum(List.range(0, 5)))
    // 调用隐式参数stringMonoid
    println(sum(List("a", "b", "c")))
  }

}
