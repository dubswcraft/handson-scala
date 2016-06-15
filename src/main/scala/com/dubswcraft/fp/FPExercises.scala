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

object Exercise3_Scala_MoreAggregating_NoState_Fold {
  case class Person(name: String, height: Int)

  def averageHeight(people: List[Person]) = {
    val heightTotal = people.foldLeft(0)((acc, p) => acc + p.height)
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

object Exercise5_Scala_FlatMapping {
  def duplicate(l:List[Integer]):List[Integer] = {
    l flatMap { e => List(e, e) }
  }
}

object Exercise6_Scala_HigherOrderFunctions {
  type CommissionCalculator = (Int) => BigDecimal

  val citi:CommissionCalculator = _ * 0.15
  val jp:CommissionCalculator = _ * 0.2
  val ubs:CommissionCalculator = _ * 0.25

  class CommissionProcessor(calc: CommissionCalculator, amount: Int) {
    def process() = calc(amount)
  }

  List(
    new CommissionProcessor(citi, 1000),
    new CommissionProcessor(jp, 300),
    new CommissionProcessor(ubs, 4000)
  ).map(_.process()).mkString(",")
}




