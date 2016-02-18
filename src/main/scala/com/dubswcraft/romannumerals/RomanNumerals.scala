package com.dubswcraft.romannumerals

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.{BeforeAndAfterEach, FlatSpec}

object Roman {

  case class Symbol(latin:Int, roman:String)

  var symbols = List(Symbol(5,"V"), Symbol(4, "IV"), Symbol(1,"I"))

  def toRoman(number:Int): String = {
    var result = ""
    var remaining = number
    symbols.foreach(symbol => {
      1 to (remaining / symbol.latin) foreach { _ =>
        result = result + symbol.roman
        remaining = remaining - symbol.latin
      }
    })
    result
  }
}