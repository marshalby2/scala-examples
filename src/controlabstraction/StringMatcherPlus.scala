package controlabstraction

/**
 * @Description TODO
 * @Author marshal
 * @Date 22/9/20 8:59 PM
 */
class StringMatcherPlus(strings: List[String]) {

  /**
   *  匹配字符
   *
   * @param matcher 匹配规则函数
   * @return
   */
  def stringMatching(matcher: String => Boolean) = for (s <- strings if matcher(s)) yield s

  /**
   *  根据后缀来匹配
   *
   * @param query 后缀
   * @return
   */
  def stringEnding(query: String) = stringMatching(_.endsWith(query))


  /**
   * 根据正则表达式来匹配
   *
   * @param query
   * @return
   */
  def stringRegex(query: String) = stringMatching(_.matches(query))



}
