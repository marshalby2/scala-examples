package generics.invariance

/**
 * @Description TODO
 * @Author marshal
 * @Date 19/11/20 10:22 AM
 */
class Container[A](value: A) {
  private var _value: A = value
  def getValue: A = _value
  def setValue(value: A) = {
    _value = value
  }
}
