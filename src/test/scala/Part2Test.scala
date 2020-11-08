import org.scalatest.wordspec.AnyWordSpec
import Part2._
import Part2.TreeNode._


class Part2Test extends AnyWordSpec {

  /*
  *           1
  *         /   \
  *        2     3
  *       / \   / \
  *      4   5 6   7
  *
  */

  val tree1 = TreeNode[Int](1,
    Some(TreeNode(2,
      Some(TreeNode(4)),
      Some(TreeNode(5)))),
    Some(TreeNode(3,
      Some(TreeNode(6)),
      Some(TreeNode(7))))
  )


  /*
  *
  *
  *           2
  *         /   \
  *        2     3
  *       / \   / \
  *      4   5 6   7
  *
  *
  * */
  val tree2 = TreeNode[Int](2,
    Some(TreeNode(2,
      Some(TreeNode(4)),
      Some(TreeNode(5)))),
    Some(TreeNode(3,
      Some(TreeNode(6)),
      Some(TreeNode(7))))
  )


  /*
  *
  *
  *           1
  *         /   \
  *        2     3
  *       / \   / \
  *      4   5 6  17
  *
  *
  * */

  val tree3 = TreeNode[Int](1,
    Some(TreeNode(2,
      Some(TreeNode(4)),
      Some(TreeNode(5)))),
    Some(TreeNode(3,
      Some(TreeNode(6)),
      Some(TreeNode(17))))
  )

  "Tree equality" should {

    "tree equals itself" in {
      isSameTree(tree1, tree1) equals true
    }

    "trees with different roots are not equal" in {
      isSameTree(tree1, tree2) equals false
    }

    "trees with different leaves are not equal" in {
      isSameTree(tree1, tree3) equals false
    }


  }
}
