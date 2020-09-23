package controllflow

import classes.User

/**
 * @Description TODO
 * @Author marshal
 * @Date 20/9/20 8:25 AM
 */
object ForTest extends App {
  val nums = Array.range(0, 10)
  // basic
  //  for (n <- nums) println(n)

  // generator expression
  //  for(i <- 1 to 10) println(i)
//  for (i <- 0 until 5) println(i)


  //Guards: filter values
  val pl = List("Java", "Php", "Python", "Scala", "Go")
//  for (i <- pl if i.contains("h")) println(i)

  // Yielding
  val x = for {
    l <- pl
    u = l.toUpperCase()
   } yield u
  println(x) // List(JAVA, PHP, PYTHON, SCALA, GO)

}
