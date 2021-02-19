import scala.annotation.tailrec
def replace(list: List[String], replacing: String, replacement: String): List[String] = 
replace(list, replacing, replacement, List())
@tailrec
def replace(list: List[String], replacing: String, replacement: String, rlist: List[String]): List[String] = {
  list match{
      case head :: tail if head == replacing  => replace(tail, replacing, replacement, replacement :: rlist)
      case head :: tail                       => replace(tail, replacing, replacement, head :: rlist)   
      case Nil                                => rlist.reverse
  }
}

val ex = "1"::"2"::"2"::"3"::"4"::"3"::"6"::"4"::Nil
println(replace(ex,"3","rplc"))

println(ex)

def mapreplace(list: List[String], replacing: String, replacement: String): List[String] = {
  list.map {
    case el if el==replacing  => replacement
    case other          => other
}
}
println(mapreplace(ex,"3","rplc"))


  
