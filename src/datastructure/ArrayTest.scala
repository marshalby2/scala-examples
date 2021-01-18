package datastructure

/**
 * @Description TODO
 * @Author marshal
 * @Date 20/9/20 7:23 PM
 *
 *      Array is mutable
 */
object ArrayTest extends App {

  val names = new Array[String](3)

  names(0) = "Tom"
  names(1) = "Jack"
  names(2) = "Rose"

  // iterate
//  for (i <- 0 to 2) println(names(i))

//  println(names.apply(0)) // tom

//  val array = Array.apply("Java", 22, names, 78.5f)
//  array foreach println

  var nums = Array(1, 2, 3)
//  nums.foreach(e => {
//    println(e)
//  })

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    var r: Array[Int] = null
    nums.foreach( e => {
      for (i <- 1 until  nums.length) {
        if ( e + nums(i) == target) {
          r = Array(i - 1, i)
          return r
        }
      }
    })
    r
  }
  var r = twoSum(Array(3, 2, 3), 6)
  println(r(0))
  println(r(1))


}
