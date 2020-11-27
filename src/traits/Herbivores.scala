package traits

/**
 * @Description TODO
 * @Author marshal
 * @Date 19/11/20 1:33 AM
 */
trait Herbivores extends Animal {
  override def eat: Unit = println("Herbivores eat grass.")
}
