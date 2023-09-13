package experiment

import scala.annotation.tailrec
import scala.jdk.Accumulator
import scala.util.matching.Regex

object Experimenting {

  import scala.annotation.tailrec

  def searchOnRotatedInput(nums: Array[Int], target: Int): Int = {
    @tailrec
    def binarySearch(left: Int, right: Int): Int = {
      if (left > right) {
        -1
      } else {
        val mid = left + (right - left) / 2
        if (nums(mid) == target) {
          mid
        } else if (nums(left) <= nums(mid)) {
          if (nums(left) <= target && target < nums(mid)) {
            binarySearch(left, mid - 1)
          } else {
            binarySearch(mid + 1, right)
          }
        } else {
          if (nums(mid) < target && target <= nums(right)) {
            binarySearch(mid + 1, right)
          } else {
            binarySearch(left, mid - 1)
          }
        }
      }
    }

    if (nums.isEmpty) {
      -1
    } else {
      binarySearch(0, nums.length - 1)
    }
  }













  def main(arg:Array[String]):Unit={
    val stringIn: List[String] = List("flower", "flow", "flight")
    val str1: List[String] = List("dog", "racecar", "car")
    println()
  }


}
