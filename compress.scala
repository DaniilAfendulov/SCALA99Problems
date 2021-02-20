def compress(list:List[Any]): List[Any] = compressr(list, List(), Nil)
def compressr(list:List[Any], listr:List[Any], last:Any): List[Any] = {
    list match {
      case head :: tail if head==last  => compressr(tail, listr, head)
      case head :: tail if head!=last  => compressr(tail, head::listr, head)
      case Nil                         => listr.reverse
      case head                        => compressr(Nil, head::listr, head)
  }
}
compress(List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"))
