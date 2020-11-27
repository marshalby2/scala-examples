package generics

import generics.bean.{Animal, Cat, Dog}

/**
 * @Description TODO
 * @Author marshal
 * @Date 19/11/20 10:26 AM
 */
object CovarianceTest extends App {

  def printAnimalName(animals: List[Animal]) = {
    animals.foreach(animal => println(animal.name))
  }

  val cats = List(Cat("Whiskers"), Cat("Tom"))
  val dogs = List(Dog("Fido"), Dog("Rex"))

  printAnimalName(cats)
  printAnimalName(dogs)
}
