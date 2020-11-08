import javax.mail.internet.InternetAddress

import scala.util.{Failure, Success, Try}

/**
 * 3. Написать программу, которая принимает строку в консоли и говорит это валидный email или нет
 */
object Part3 {

  /**
   *
   * @param str - email string
   * @return Success(email) if valid or Failure(exception) otherwise
   */
  def validate(str: String): Try[String] = {
    Try {
      new InternetAddress(str).validate()
      str
    }
  }

  /**
   * Читает строку из STDIN и выводит результат валидации
   */
  def readAndValidate(): Unit = {
    val str = scala.io.StdIn.readLine("email:")
    validate(str) match {
      case Success(value) => println(s"$value is ok")
      case Failure(exception) => println(s"$str is invalid: ${exception.getMessage}")
    }
  }
}
