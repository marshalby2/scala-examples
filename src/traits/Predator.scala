package traits

/**
 * @Description TODO
 * @Author marshal
 * @Date 19/11/20 1:34 AM
 */
trait Predator extends Animal {
  override def eat: Unit = println("Predator eat meat.")
}
