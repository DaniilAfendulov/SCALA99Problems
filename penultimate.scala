import scala.annotation.tailrec
@tailrec
def penultimate(list:List[Int]): Int = {
  list match {
    case head :: tail :: Nil => tail
    case head :: tail        => penultimate(tail)       
  }
}
println(penultimate(List(1, 1, 2, 3, 5, 8)))
