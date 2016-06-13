package com.dubswcraft.fp

object Exercise1_Scala_BuildingAList_Recursion extends App {

  def processList(items: List[String]): List[String] = {
    def process(i: List[String], output: List[String]): List[String] = i match {
      case Nil => output
      case h::t => process(t, (h + " processed") :: output)
    }
    process(items, Nil)
  }

  processList(List("item 1", "item 2", "item 3")) foreach println
}
