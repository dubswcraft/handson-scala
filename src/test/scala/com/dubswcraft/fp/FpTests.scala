package com.dubswcraft.fp

import com.dubswcraft.fp.Exercise3_Scala_MoreAggregating_NoState.Person
import org.scalatest.{Matchers, WordSpec}

class FpTests extends WordSpec with Matchers {

  "Exercise1" should {
    "add processed to each item" in {
      Exercise1_Scala_BuildingAList_Map.processList(List("item 1", "item 2")) shouldBe List("item 1 processed", "item 2 processed")
    }
  }

  "Exercise2" should {
    "add processed to each item and do recursively" in {
      Exercise2_Scala_BuildingAList_Recursion.processList(List("item 1", "item 2")) shouldBe List("item 1 processed", "item 2 processed")
    }
  }

  "Exercise3" should {
    "calculate average height using no state and using fold" in {
      Exercise3_Scala_MoreAggregating_NoState.averageHeight(List(Person("John", 180), Person("Mary", 160))) shouldBe 170
    }

  }
}
