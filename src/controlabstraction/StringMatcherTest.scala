package controlabstraction

/**
 * @Description TODO
 * @Author marshal
 * @Date 22/9/20 9:03 PM
 */
object StringMatcherTest extends App {

  val s = new StringMatcher(List("index.jsp", "login.jsp", "hey", "hello"))
  // 1. 根据后缀匹配,并输出匹配到的字符
  s.stringEnding(".jsp") foreach println //  index.jsp login.jsp
  // 2. 根据正则表达式匹配,并输出匹配到的字符
  s.stringRegex("h.*") foreach println  // hey hello


}
