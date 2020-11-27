package classes

/**
 * @Description TODO
 * @Author marshal
 * @Date 19/11/20 12:50 AM
 */
class Rational(n: Int, d: Int) {

  require(d != 0)

  // 最大公约数
  private val g = gcd(n.abs, d.abs)

  // 约分
  val number: Int = n / g
  val denom: Int = d / g

  /**
   * 辅助构造器
   *
   * @param n
   */
  def this(n: Int) = this(n, 1)

  /**
   * 分数加法
   *
   * @param that
   * @return
   */
  def +(that: Rational): Rational = {
    new Rational(
      number * that.denom + that.number * denom,
      denom * that.denom
    )
  }

  /**
   * 分数乘法
   *
   * @param that
   * @return
   */
  def *(that: Rational): Rational = new Rational(number * that.number, denom * that.denom)


  /**
   * 获取最大公约数
   *
   * @param a
   * @param b
   * @return
   */
  def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  /**
   * 重写toString方法
   *
   * @return
   */
  override def toString = number + "/" + denom

}
