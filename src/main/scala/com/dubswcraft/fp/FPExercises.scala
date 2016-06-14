package com.dubswcraft.fp

object Exercise1_Scala_BuildingAList_Map {
  def processList(items: List[String]) = items.map(item => item + " processed")
}

object Exercise2_Scala_BuildingAList_Recursion {

  def processList(items: List[String]): List[String] = {
    def process(i: List[String], output: List[String]): List[String] = i match {
      case Nil => output
      case h::t => process(t, (h + " processed") :: output)
    }
    process(items, Nil)
  }
}

object Exercise3_Scala_MoreAggregating_NoState {
  case class Person(name: String, height: Int)

  def averageHeight(people: List[Person]) = {
    val heightTotal = people.map(_.height).sum
    if (heightTotal <= 0) 0 else heightTotal / people.size
  }
}

object Exercise4_Scala_MoreRecursion {
  def isPalindrome[A](l: List[A]):Boolean = l match {
    case Nil => true
    case List(a) => true
    case list => list.head == list.last && isPalindrome(list.tail.init)
  }
}


