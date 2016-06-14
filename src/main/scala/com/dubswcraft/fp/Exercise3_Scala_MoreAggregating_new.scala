package com.dubswcraft.fp

object Exercise3_Scala_MoreAggregating_New extends App {

  case class Person(name: String, height: Int)
  val people = List(Person("Mary", 160), Person("Isla", 80), Person("Sam", 150))

  var heightTotal = 0
  var heightCount = 0
  var averageHeight = 0

  for (person <- people) {
    heightTotal += person.height
    heightCount += 1
  }
  if (heightTotal > 0)
    averageHeight = heightTotal / heightCount

  println(averageHeight)

  // Exercise

}
