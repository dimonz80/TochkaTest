# Тестовое задание

1\. Есть строка, нужно используя методы коллекций скалы, сгруппировать буквы по символу, отсортировать группы по количеству символов и сджойнить группы в одну строку. Пример: “abcaba” -> “aaabbc” или “aacbc” -> “aaccb”

Шаблон
```scala
object TestApp extends App {
 val t = "asdasdaaaweqbbbbasdasd”.???
 assert(t == "aaaaaaassssddddbbbbwqe") // группы с одинаковым кол-вом символов могут быть в произвольном порядке, например “qwe” или “eqw”
}
```

 
2\. Написать функцию, которая будет проверять являются ли два дерева одинаковыми. Желателен рекурсивный подход без переменных.
Шаблон
```scala
case class TreeNode[X](value: X, left: Option[TreeNode[X]], right: Option[TreeNode[X]])
 def isSameTree[X](p: Option[TreeNode[X]], q: Option[TreeNode[X]]): Boolean = {
   ???
 }

 
 val simpleP = TreeNode(1, None, None)
 val simpleQ = TreeNode(1, None, None)
 assert(isSameTree(Some(simpleP), Some(simpleQ)))
 val p = TreeNode(1, Some(TreeNode(2, None, None)), None)
 val q = TreeNode(1, None, Some(TreeNode(2, None, None)))
 assert(!isSameTree(Some(p), Some(q)))
```
 
3\. Написать программу, которая принимает строку в консоли и говорит это валидный email или нет


## Часть 1

Реализовано в  [```Part1.sortStrByCharQuantity```](https://github.com/dimonz80/TochkaTest/blob/main/src/main/scala/Part1.scala)  

Тесты в [```src/test/scala/Part1Test.scala```](https://github.com/dimonz80/TochkaTest/blob/main/src/test/scala/Part1Test.scala)

## Часть 2 
    
Реализовано в [```Part2.isSameTree```](https://github.com/dimonz80/TochkaTest/blob/main/src/main/scala/Part2.scala)
    
Тесты в [```src/test/scala/Part2Test.scala```](https://github.com/dimonz80/TochkaTest/blob/main/src/test/scala/Part2Test.scala)

Реализация с явным обходом дерева необязательна, т.к. сравнивать case class можно просто через ```equals```.
        
## Часть 3

Реализовано в [```Part3.readAndValidate()```](https://github.com/dimonz80/TochkaTest/blob/main/src/main/scala/Part3.scala)

Тесты в [```src/test/scala/Part3Test.scala```](https://github.com/dimonz80/TochkaTest/blob/main/src/test/scala/Part3Test.scala)


Т.к. использование регулярных выражений для полноценной валидации Email не очень хорошая идея, 
то использовалась внешняя зависимость 
```javax.mail``` (```javax.mail.internet.InternetAddress.validate()```),
реализующая проверку адреса согласно RFC 822  
