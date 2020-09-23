package datastructure

/**
 * @Description TODO
 * @Author marshal
 * @Date 20/9/20 10:01 PM
 *
 *      Set is mutable or immutable
 */
object SetTest extends App {

  var country = Set("China", "France", "Germany", "Russia")
  country += "America"
  println(country.contains("America")) // true
  println(country) // true

}
