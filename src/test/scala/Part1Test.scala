import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers
import Part1._

class Part1Test extends AnyWordSpec with Matchers {


  val complexTestCases = List(
    "aaaaaaaddddbbbbssssqew",
    "aaaaaaaddddbbbbssssqwe",
    "aaaaaaaddddbbbbssssweq",
    "aaaaaaaddddbbbbsssswqe",
    "aaaaaaaddddbbbbssssewq",
    "aaaaaaaddddbbbbsssseqw",

    "aaaaaaaddddssssbbbbqew",
    "aaaaaaaddddssssbbbbqwe",
    "aaaaaaaddddssssbbbbweq",
    "aaaaaaaddddssssbbbbwqe",
    "aaaaaaaddddssssbbbbewq",
    "aaaaaaaddddssssbbbbeqw",

    "aaaaaaabbbbddddssssqew",
    "aaaaaaabbbbddddssssqwe",
    "aaaaaaabbbbddddssssweq",
    "aaaaaaabbbbddddsssswqe",
    "aaaaaaabbbbddddssssewq",
    "aaaaaaabbbbddddsssseqw",

    "aaaaaaabbbbssssddddqew",
    "aaaaaaabbbbssssddddqwe",
    "aaaaaaabbbbssssddddweq",
    "aaaaaaabbbbssssddddwqe",
    "aaaaaaabbbbssssddddewq",
    "aaaaaaabbbbssssddddeqw",

    "aaaaaaassssbbbbddddqew",
    "aaaaaaassssbbbbddddqwe",
    "aaaaaaassssbbbbddddweq",
    "aaaaaaassssbbbbddddwqe",
    "aaaaaaassssbbbbddddewq",
    "aaaaaaassssbbbbddddeqw",

    "aaaaaaassssddddbbbbqew",
    "aaaaaaassssddddbbbbqwe",
    "aaaaaaassssddddbbbbweq",
    "aaaaaaassssddddbbbbwqe",
    "aaaaaaassssddddbbbbewq",
    "aaaaaaassssddddbbbbeqw",

  )


  "Sorting string by char amount" should {

    "empty string equals empty string" in {
      sortStrByCharQuantity("") equals ""
    }

    "string  equals itself if contains same char" in {
      sortStrByCharQuantity("aaa") shouldEqual "aaa"
    }

    "abc equals to abc or bca or cba" in {
      List("abc", "cba", "bac").contains(sortStrByCharQuantity("abc")) shouldEqual true
    }

    "abbccc equals cccbba" in {
      sortStrByCharQuantity("abbccc") shouldEqual "cccbba"

    }

    s"asdasdaaaweqbbbbasdasd equals one of ${complexTestCases.mkString(",")} " in {
      complexTestCases.contains(sortStrByCharQuantity("asdasdaaaweqbbbbasdasd")) shouldEqual true
    }
  }


}
