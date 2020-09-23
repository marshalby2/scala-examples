package logging

/**
 * @Description TODO
 * @Author marshal
 * @Date 19/9/20 4:16 PM
 *
 *      object 本质上是一个单例类,它是懒加载的,只有当被引用的时候才会被创建
 */
object Logger {

  def info(message: String) = println(s"INFO $message")

}
