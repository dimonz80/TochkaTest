
import org.scalatest.wordspec.AnyWordSpec
import Part3.validate

import scala.util.{Failure, Success}

class Part3Test extends AnyWordSpec {

  val validSimpleEmail = "test@domain.com"

  val validEmailWithPersonal = "test user<test@domain.com>"

  val someString = "test"

  val emailWithoutDomain = "test@"


  "Email validation" should {

    "validate simple email" in {
      validate(validSimpleEmail) equals Success(validSimpleEmail)
    }

    "validate email with personal" in {
      validate(validEmailWithPersonal) equals Success(validEmailWithPersonal)
    }

    "not validate invalid email" in {
      validate(someString) match {
        case Failure(_) => succeed
        case Success(_) => fail
      }
    }

    "not validate email without domain" in {
      validate(emailWithoutDomain) match {
        case Failure(_) => succeed
        case Success(_) => fail
      }
    }

  }
}
