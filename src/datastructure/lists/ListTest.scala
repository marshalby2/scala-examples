package datastructure.lists

/**
 * @Description TODO
 * @Author marshal
 * @Date 20/9/20 7:35 PM
 *
 *      List is immutable
 */
object ListTest extends App {

  // List is immutable
  val one = List(1, 2)
  val two = List(3, 4)
  val three = one ::: two
//  println(one + " and " + two + " were not mutated ")
//  println("Thus, " + three + " is a new list")

  // this is corresponding to three.::(1)
  val three2 = 1 :: three
//  println(three2)

  // The reason you need Nil at the end is that :: is defined on class List. If you try to just
  //say 1 :: 2 :: 3, it won’t compile because 3 is an Int, which doesn’t have a :: method
  val nums = 1 :: 2 :: 3 :: Nil
  println(nums) // List(1, 2, 3)
}
