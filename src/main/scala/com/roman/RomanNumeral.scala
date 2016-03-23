package com.roman

import scala.collection.immutable.ListMap


class RomanNumeral {

  val values = ListMap(50 -> "L", 40 -> "XL", 10 -> "X", 9 -> "IX", 5 -> "V", 4 -> "IV", 1 -> "I")

  def from(n: Int): String = n match {
      case 0 => ""
      case _ => {
        val arabic = values.keys.find(key => n >= key).get
        values(arabic) + from(n - arabic)
      }
    }
}


