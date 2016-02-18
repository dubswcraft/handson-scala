package com.dubswcraft.romannumerals

object RomanNumerals extends App {
  def toRoman(number: Int) = {
    def toRomanAcc(number: Int, acc: String, dict: List[(Int, String)]): String = dict match {
      case Nil => acc
      case (( numberKey, romanEquiv) :: t) if numberKey <= number => toRomanAcc(number - numberKey, acc + romanEquiv, (numberKey, romanEquiv) :: t)
      case (h :: t) => toRomanAcc(number, acc, t)
    }
    toRomanAcc(number, "", List(1000 -> "M", 900 -> "CM", 500 -> "D", 400 -> "CD", 100 -> "C", 90 -> "XC", 50 -> "L", 40 -> "XL", 10 -> "X", 9 -> "IX", 5 -> "V", 4 -> "IV", 1 -> "I"))
  }
}