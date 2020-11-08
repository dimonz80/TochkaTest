
import org.scalatest.wordspec.AnyWordSpec
import Part3.validate
import org.scalatest.matchers.should.Matchers

import scala.util.{Failure, Success}

class Part3Test extends AnyWordSpec with Matchers {

  val validSimpleEmail = "test@domain.com"

  val validEmailWithPersonal = "test user<test@domain.com>"

  val someString = "test"

  val emailWithoutDomain = "test@"


  "Email validation" should {

    "validate simple email" in {
      validate(validSimpleEmail) shouldEqual Success(validSimpleEmail)
    }

    "validate email with personal" in {
      validate(validEmailWithPersonal) shouldEqual Success(validEmailWithPersonal)
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
