package generics.contravariance

import generics.bean.Animal

/**
 * @Description TODO
 * @Author marshal
 * @Date 19/11/20 10:30 AM
 */
class AnimalPrinter extends Printer[Animal] {
  override def print(value: Animal): Unit =
    println("The animal's name is : " + value.name)
}
