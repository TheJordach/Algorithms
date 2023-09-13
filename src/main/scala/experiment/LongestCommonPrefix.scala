package experiment

import scala.annotation.tailrec

class LongestCommonPrefix {

   // ["flower","flow","flight"]

  def findPrefix(strs:Array[String]): String = {


    def findCommonPrefix(arr: Array[String]): String = {
      val input = arr
      val prefix = input(0)

      @tailrec
      def helper(arrayLevelPointer: Int, itemLevelPointer: Int): String = {

        if (arrayLevelPointer >= input.length) {
          return prefix.substring(0, itemLevelPointer)

        } else {
          val currentWord = input(arrayLevelPointer)

          if (
            itemLevelPointer < currentWord.length &&
            itemLevelPointer < prefix.length &&
            prefix(itemLevelPointer) == currentWord(itemLevelPointer)
          ){
            helper(arrayLevelPointer , itemLevelPointer+1)
          } else helper(arrayLevelPointer+1, itemLevelPointer )
        }
      }

      helper(arrayLevelPointer = 1, itemLevelPointer = 0)
    }

    strs match {
      case _ if strs.isEmpty => return ""
      case Array(a)  => a
      case _ if strs.length > 1=> findCommonPrefix(strs)

    }


  }


  def getCommonPrefix(input:Array[String]): String = {


    def processTheInput(inputArray: Array[String]) : String = {
      val sortedArray = inputArray.sorted
      var prefix = sortedArray(0)

      for (i<- 1 until sortedArray.length) {
        val currentWord :String = sortedArray(i)
        var j =0
        while (j < currentWord.length && j < prefix.length && prefix(j) == currentWord(j)) {
          j +=1
        }
         prefix = prefix.substring(0,j)
      }
      prefix
    }

    input match {
      case anArray if anArray.isEmpty => return ""
      case Array(a)  => a
      case _ => processTheInput(input)

      }



  }

}

object LongestCommonPrefix{
  def apply():LongestCommonPrefix = new LongestCommonPrefix()
}
