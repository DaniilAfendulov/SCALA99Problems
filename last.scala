import scala.annotation.tailrec
def last(list : List[Any]):Any = {
  list match {
    case head :: Nil  => head
    case head :: tail => last(tail)
    case Nil          => Nil
  }
}

println(last(List(1, 1, 2, 3, 5, 8)))
