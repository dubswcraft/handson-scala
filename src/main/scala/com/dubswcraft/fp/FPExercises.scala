package com.dubswcraft.fp

/*

//Evaluates a function over each element in the list, returning a list with the same number of elements.

def byTwo(numbers: List[Int]) = numbers.map(_ * 2)

byTwo(List(1,2,3))
 */
object Exercise1_Scala_BuildingAList_Map {
  def processList(items: List[String]) = ???
}

/*
def sum(xs: List[Int]): Int = {
  if (xs.isEmpty) 0
  else xs.head + sum(xs.tail)
}

def sumTail(xs: List[Int]): Int = {
  def go(xs: List[Int], count: Int): Int = xs match {
    case Nil => count
    case h :: t => go(t, h + count)
  }
  go(xs, 0)
}
 */
object Exercise2_Scala_BuildingAList_Recursion {
  def processList(items: List[String]): List[String] = ???
}

/*
// write our own contains method

def contains(items: List[Int], searchItem: Int) =
  items.foldLeft(false){(prev, cur) => prev || cur == searchItem }

contains(List(1,2,3), 4)
 */
object Exercise3_Scala_MoreAggregating_NoState_Fold {
  case class Person(name: String, height: Int)

  def averageHeight(people: List[Person]) = ???
}


object Exercise4_Scala_MoreRecursion {
  def isPalindrome[A](l: List[A]):Boolean = ???
}

/*
// like a combination of map with flatten
val nestedNumbers = List(List(1, 2), List(3, 4))
nestedNumbers.flatMap(x => x.map(_ * 3))

// what would it look like if i just mapped?
nestedNumbers.map(x => x.map(_ * 3))

// now I add a flatten on the end
nestedNumbers.map(x => x.map(_ * 3)).flatten
*/

object Exercise5_Scala_FlatMapping {
  def duplicate(l:List[Integer]):List[Integer] = ?
}

/*

val asXml : String => String = field => "<xml-field>" + field + "</xml-field>"
val asJson : String => String = field => s"'json-field':'$field'"

type OutputFormat = String => String

def generateReport(formatter: OutputFormat, fieldContents: String) =
  formatter(fieldContents)

generateReport(asJson, "sample content")
generateReport(asXml, "sample content")

 */
object Exercise6_Scala_HigherOrderFunctions {
}




