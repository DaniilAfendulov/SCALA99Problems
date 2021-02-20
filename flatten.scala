def flatten(list:List[Any]): List[Any] = {
  list.flatMap {
    case l:List[Any]  => flatten(l)
    case l            => List(l)
  }  
}
flatten(List(List(1, 1), 2, List(3, List(5, 8))))
