package exceptiions

import java.io.{FileNotFoundException, FileReader, IOException}

/**
 * @Description TODO
 * @Author marshal
 * @Date 22/9/20 2:28 PM
 */
object ExceptionTest extends {

  def divide(a: Int, b: Int) = {
    if (b == 0) {
      throw new IllegalArgumentException
    }
    a / b
  }

  def read(filename: String) = {
    try {
      val reader = new FileReader(filename)
    } catch {
      case ex: FileNotFoundException => println(s"$filename not found")
      case ex: IOException => println("IOException")
    } finally {
      println("This is finally cause")
    }
  }

}
