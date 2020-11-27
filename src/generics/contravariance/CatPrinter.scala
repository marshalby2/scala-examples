package generics.contravariance

import generics.bean.Cat

/**
 * @Description TODO
 * @Author marshal
 * @Date 19/11/20 10:31 AM
 */
class CatPrinter extends Printer[Cat] {
  override def print(value: Cat): Unit =
    println("The cat's name is " + value.name)
}
