/**
 * 2. Написать функцию, которая будет проверять являются ли два дерева одинаковыми.
 * Желателен рекурсивный подход без переменных.
 * Шаблон
 * case class TreeNode[X](value: X, left: Option[TreeNode[X]], right: Option[TreeNode[X]])
 * def isSameTree[X](p: Option[TreeNode[X]], q: Option[TreeNode[X]]): Boolean = {
 * ???
 * }
 *
 *
 *
 * val simpleP = TreeNode(1, None, None)
 * val simpleQ = TreeNode(1, None, None)
 * assert(isSameTree(Some(simpleP), Some(simpleQ)))
 * val p = TreeNode(1, Some(TreeNode(2, None, None)), None)
 * val q = TreeNode(1, None, Some(TreeNode(2, None, None)))
 * assert(!isSameTree(Some(p), Some(q)))
 */
object Part2 {

  case class TreeNode[T](value: T,
                         left: Option[TreeNode[T]] = None,
                         right: Option[TreeNode[T]] = None)

  object TreeNode {
    /**
     * Сравнение деревьев с обходом в ширину
     *
     * @param p
     * @param q
     * @tparam X
     * @return
     */
    def isSameTree[X](p: Option[TreeNode[X]], q: Option[TreeNode[X]]): Boolean = {
      (p, q) match {
        case (None, None) => true
        case (Some(_), None) => false
        case (None, Some(_)) => false
        case (Some(p), Some(q)) =>
          p.value == q.value &&
            isSameTree(p.left, q.left) &&
            isSameTree(p.right, q.right)
      }
    }

    def isSameTree[X](p: TreeNode[X], q: TreeNode[X]): Boolean = isSameTree[X](Option(p), Option(q))

    /**
     *
     * Тривиальное сравнение без явного обхода дерева тоже работает,
     * т.к.  equal однозначно определена для case class и Option
     *
     */
    def isSameTreeTrivial[T](p: TreeNode[T], q: TreeNode[T]): Boolean = p == q

  }

}
