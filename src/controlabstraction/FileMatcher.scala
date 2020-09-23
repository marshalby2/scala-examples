package controlabstraction

import java.io.File

/**
 * @Description TODO
 * @Author marshal
 * @Date 22/9/20 8:50 PM
 */
object FileMatcher {

  private def fileHere = new File(".").listFiles

  /**
   * 文件匹配
   *
   * @param query 匹配规则
   * @param matcher 匹配规则函数
   * @return
   */
  def filedMatching(query: String, matcher: (String, String) => Boolean) = {
    for (file <- fileHere if matcher(file.getName, query)) yield file
  }

  /**
   *  根据后缀匹配文件
   *
   *   filedMatching(query, _.contains(_)) corresponding to fileName.endWith(query)
   *
   * @param query 文件后缀
   * @return
   */
  def filesEnding(query: String) = filedMatching(query, _.endsWith(_))

}
