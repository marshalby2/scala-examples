package datastructure.sets

/**
 * @Description TODO
 * @Author marshal
 * @Date 19/11/20 12:18 AM
 */
object SetTest extends App {
  var set = Set(1, 2, 3, 4, 5, 5)
  set foreach println

  var newSet = set.+(10)
  newSet foreach println
}
