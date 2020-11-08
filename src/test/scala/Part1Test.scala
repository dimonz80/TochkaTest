import org.scalatest.wordspec.AnyWordSpec
import Part1._

class Part1Test extends AnyWordSpec {
  "Sorting string by char amount" should {

    "empty string equals empty string" in {
      sortStrByCharQuantity("") equals ""
    }

    "string  equals itself if contains same char" in {
      sortStrByCharQuantity("aaa") equals "aaa"
    }

    "abc equals to abc or bca or cba" in {
      List("abc", "cba", "bac").contains(sortStrByCharQuantity("abc")) equals true
    }

    "abbccc equals cccbba" in {
      sortStrByCharQuantity("abbccc") equals "cccbba"
    }

    "asdasdaaaweqbbbbasdasd equals one of " +
      "aaaaaaassssddddbbbbewq, " +
      "aaaaaaassssddddbbbbeqw, " +
      "aaaaaaassssddddbbbbqew, " +
      "aaaaaaassssddddbbbbweq" in {

      List(
        "aaaaaaassssddddbbbbewq",
        "aaaaaaassssddddbbbbeqw",
        "aaaaaaassssddddbbbbqew",
        "aaaaaaassssddddbbbbweq"
      ).contains(sortStrByCharQuantity("asdasdaaaweqbbbbasdasd")) equals true
    }

  }

}
