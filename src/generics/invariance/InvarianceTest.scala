package generics.invariance

import generics.bean.{Animal, Cat, Dog}

/**
 * @Description TODO
 * @Author marshal
 * @Date 19/11/20 10:41 AM
 */
object InvarianceTest extends App {
  val catContainer: Container[Cat] = new Container(Cat("Felix"))
//  val animalContainer: Container[Animal] = catContainer
//  animalContainer.setValue(Dog("Spot"))
  val cat: Cat = catContainer.getValue // Oops, we'd end up with a Dog assigned to a Cat
}
