package functional

/**
 * @Description TODO
 * @Author marshal
 * @Date 20/9/20 10:15 PM
 */
object FunctionalStyle extends App {

  val nums = List.range(0, 5)

  // the non-functional style
  var i = 0
  while (i < nums.length) {
    println(nums(i))
    i += 1
  }

  println("=========functional style=========")
  // functional style
  nums foreach println

}
