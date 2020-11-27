package generics.contravariance

import generics.bean.{Animal, Cat}

/**
 * @Description TODO
 * @Author marshal
 * @Date 19/11/20 10:30 AM
 */
object ContravarianceTest extends App {

  def printCat(printer: Printer[Cat], cat: Cat): Unit = {
    printer.print(cat)
  }

  // the Cat is a subtype of Animal
  // But the Printer[Cat] is the supertype of Printer[Animal]
  // this is called contravariance 'Printer[-A]'
  val catPrinter: Printer[Cat] = new CatPrinter
  val animalPrinter: Printer[Animal] = new AnimalPrinter

  printCat(catPrinter, Cat("Boots"))
  printCat(animalPrinter, Cat("Boots"))
}
