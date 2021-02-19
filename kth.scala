import scala.annotation.tailrec
@tailrec
def kth(list:List[Int], k:Int): Int = {
  list match {
    case head :: _  if k == 0   => head
    case _ :: tail if k > 0     => kth(tail,k-1)
    case Nil                    => throw new NoSuchElementException
  }
}
println(kth(List(1, 1, 2, 3, 5, 8), 2))
