package experiment
import org.specs2.mutable.Specification

class longestCommonPrefixSpec extends Specification {

  "Function" should {
    val findCommonPrefix = LongestCommonPrefix()

    "Normal Function should return fl as a String " >> {
     val input : Array[String] = Array("flower","flow","flight")
     findCommonPrefix.getCommonPrefix(input) shouldEqual "fl"

    }

    "Normal Function should return an empty String " >> {
      val input: Array[String] = Array("dog","racecar","car")
      findCommonPrefix.getCommonPrefix(input) shouldEqual ""
    }

    "Recursion Function should return fl as a String " >> {
      val input: Array[String] = Array("flower", "flow", "flight")
      findCommonPrefix.findPrefix(input) shouldEqual "fl"

    }

    "Recursion Function should return an empty String " >> {
      val input: Array[String] = Array("dog", "racecar", "car")
      findCommonPrefix.findPrefix(input) shouldEqual ""
    }

    "Both function should pass this test">> {
      val input = Array("a")
      findCommonPrefix.findPrefix(input) shouldEqual "a"
      findCommonPrefix.getCommonPrefix(input) shouldEqual "a"
    }

   println("***************************************************")
   "Level n°2 Normal Function should return an empty String " >> {
      val input: Array[String] = Array("reflower","flow","flight")
      findCommonPrefix.getCommonPrefix(input) shouldEqual ""
    }

    "Level n°2 Recursion Function should return an empty String " >> {
      val input: Array[String] = Array("reflower", "flow", "flight")
      findCommonPrefix.findPrefix(input) shouldEqual ""
    }

  }

}
