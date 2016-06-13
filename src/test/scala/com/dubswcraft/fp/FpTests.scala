package com.dubswcraft.fp

import org.scalatest.{Matchers, WordSpec}

class FpTests extends WordSpec with Matchers {

  "Build a new list" should {
    "append ' processed' for each item entered" in {
//      Exercises1_Scala_BuildingAList_New.processList(List("item 1", "item 2")) shouldBe List("item 1 processed", "item 2 processed")
      Exercise1_Scala_BuildingAList_Recursion.processList(List("item 1", "item 2")) shouldBe List("item 1 processed", "item 2 processed")
    }
  }
}
