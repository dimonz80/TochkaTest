/**
 * 1. Есть строка, нужно используя методы коллекций скалы,
 * сгруппировать буквы по символу,
 * отсортировать группы по количеству символов и
 * сджойнить группы в одну строку.
 *
 * Пример: “abcaba” -> “aaabbc” или “aacbc” -> “aaccb”
 * Шаблон
 * object TestApp extends App {
 * val t = "asdasdaaaweqbbbbasdasd”.???
 * assert(t == “aaaaaaassssddddbbbbwqe”) // группы с одинаковым кол-вом символов могут быть в произвольном порядке, например “qwe” или “eqw”
 * }
 */
object Part1 {

  /**
   *
   * Sort string by char quantity
   *
   * @param str source string
   * @return sorted string
   */
  def sortStrByCharQuantity(str: String): String =
    str
      .toSeq
      .groupBy(x => x)
      .map { case (_, str) =>
        (str, str.size)
      }
      .toList
      .sortWith { case ((_, s1), (_, s2)) => s1 > s2 }
      .map(_._1)
      .mkString
}
