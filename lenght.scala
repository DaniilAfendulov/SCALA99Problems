def length(list: List[Int]): Int = clenght(list, 0)
def clenght(list: List[Int], count:Int): Int = {
    list match {
      case _ :: tail  => clenght(tail, count+1)
      case Nil        => count
    }
  }
print(length(List(1, 1, 2, 3, 5, 8)))
