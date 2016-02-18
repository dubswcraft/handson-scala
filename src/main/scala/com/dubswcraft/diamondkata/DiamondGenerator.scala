package com.dubswcraft.diamondkata

object Diamond {
  def apply(diamondChar: Char) = new DiamondGenerator(diamondChar).generate
}

class DiamondGenerator(diamondChar: Char) {

  private val alphabet = Vector('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z')

  def generate: String = {
    val upperHalfCharacters = alphabet.slice(0, alphabet.indexOf(diamondChar))

    val upperLines = for (lineChar <- upperHalfCharacters) yield generateLine(lineChar)
    val middleLine = generateLine(diamondChar)
    val allLines = (upperLines :+ middleLine) ++ upperLines.reverse

    allLines.mkString(System.lineSeparator())
  }

  def generateLine(lineChar: Char): String = {
    val innerSpacing = alphabet.indexOf(lineChar) * 2 - 1
    val outerSpacing = alphabet.indexOf(diamondChar) - alphabet.indexOf(lineChar)

    if (innerSpacing > 0)
      outerSpacing.spaces + lineChar + innerSpacing.spaces + lineChar + outerSpacing.spaces
    else
      outerSpacing.spaces + lineChar + outerSpacing.spaces
  }

  private implicit class TimesSpaces(i: Int) {
    def spaces: String = " " * i
  }
}
