package functional

/**
 * @Description TODO
 * @Author marshal
 * @Date 21/9/20 9:59 PM
 */
class Rational(n: Int, d: Int) {
  // implementation  from java.lang.Object
  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val number = n / g;
  val denom = d / g;

  override def toString: String = s"$n/$d"

  // get greater common divisor
  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }

  def this(n: Int) = this(n, 1) // auxiliary constructor

  def + (that: Rational) = {
    new Rational(
      number * that.denom + that.number * denom,
      denom * that.denom
    )
  }

  // method overloading
  def + (i: Int) = new Rational(number + i * denom, denom)

  def * (that: Rational) = new Rational(this.number * that.number, this.denom * that.denom)

  def * (i: Int) = new Rational(number * i, denom)

  def lessThan(that: Rational) = {
    this.number * that.denom < that.number * this.denom
  }

  def max(that: Rational): Unit = {
    if (lessThan(that)) that else this
  }
}
