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

  val array = Array.apply("Java", 22, names, 78.5f)
  array foreach println


}
