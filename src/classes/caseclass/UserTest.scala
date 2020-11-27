package classes.caseclass

/**
 * @Description TODO
 * @Author marshal
 * @Date 19/11/20 5:11 AM
 */
object UserTest extends App {

  var u1 = User(12, "tom")
//  u1.name = "tom2"  // error
  println(u1.name)
  println(u1)

  val u2 = u1.copy(name = "Jack")
  println(u2)

}
