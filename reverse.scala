import scala.annotation.tailrec
def reverse(list: List[Int]): List[Int] = crreverse(list, List())

@tailrec
def crreverse(list: List[Int], rev: List[Int]): List[Int] = {
    list match {
      case head :: tail => crreverse(tail, head :: rev)
      case Nil          => rev
    }
  }
print(reverse(List(1, 1, 2, 3, 5, 8)))
