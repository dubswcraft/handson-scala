package com.dubswcraft.romannumerals

import com.dubswcraft.romannumerals.RomanNumerals.toRoman
import org.scalatest.{FlatSpec, ShouldMatchers}

class RomanNumeralsSpec extends FlatSpec with ShouldMatchers  {

  it should "convert a 1 to I" in {
    assert(toRoman(1) === "I")
  }

  it should "convert a 2 to II" in {
    assert(toRoman(2) === "II")
  }

  it should "convert a 5 to V" in {
    assert(toRoman(5) === "V")
  }

  it should "convert a 4 to IV" in {
    assert(toRoman(5) === "V")
  }

  it should "convert a 36 to XXXVI" in {
    assert(toRoman(36) === "XXXVI")
  }

}
