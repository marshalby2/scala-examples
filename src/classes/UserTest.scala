package classes

import logging.Logger

/**
 * @Description TODO
 * @Author marshal
 * @Date 21/9/20 9:55 PM
 */
object UserTest {

  def main(args: Array[String]): Unit = {
    val tom = new User("Tom", 12)
    // Logger is an object class, like static method in java
    Logger.info("Create User")
    println(tom.toString)
  }

}
