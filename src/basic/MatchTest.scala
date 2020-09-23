package basic

/**
 * @Description TODO
 * @Author marshal
 * @Date 22/9/20 2:36 PM
 */
object MatchTest extends App {


  for {
    i <- Seq(1, "hello", 20.5f)
  } {
    val ret = i match {
      case 1 => "Int 1"
      case "hello" => "hello"
      case _ => "other"
    }
    println(ret)
  }

}
