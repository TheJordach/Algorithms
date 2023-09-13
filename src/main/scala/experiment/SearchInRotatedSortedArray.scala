package experiment

import scala.annotation.tailrec

class SearchInRotatedSortedArray {

  /*****
   * Given the array nums after the possible rotation and an integer target, return the index of target
   * if it is in nums, or -1 if it is not in nums.
   * You must write an algorithm with O(log n) runtime complexity.
   * Time complexity : 0log(n)
   *
   * @param nums : Array[Int]
   * @param target: Int
   * @return : Int (index of target)
   */

  def search(nums: Array[Int], target: Int): Int = {

    def binarySearch(arr: Array[(Int,Int)], target: Int): Int = {
      @tailrec
      def helper(left: Int, right: Int, value: Int): Int = {
        if (left > right) {
          return -1
        } else {
          val mid = left + (right - left) / 2
          if (arr(mid)._1 == target) {
            return arr(mid)._2 // Found the target
          } else if (arr(mid)._1 < target) helper(left = mid + 1, right, value) // Adjust the left boundary
          else helper(left, right = mid - 1, value) // Adjust the right boundary
        }

      }

      helper(left = 0, right = arr.length - 1, value = target)
    }


    nums match {
      case _ if nums.isEmpty => -1
      case Array(a)  => {
        if (a == target) return a else return -1
      }
      case _ => {
        val sortedArray = nums.zipWithIndex.sorted // 0(n*Log(n)) Time complexity
        if (sortedArray.last._1 < target) return -1 else {
          binarySearch(sortedArray,target)
        }
      }
    }

  }

  def searchOnRotatedInput(nums: Array[Int], target: Int): Int = {
    @tailrec
    def binarySearch(leftPointer: Int, rightPointer: Int): Int = {
      if (leftPointer > rightPointer) {
        -1
      } else {
        val mid = leftPointer + (rightPointer - leftPointer) / 2
        if (nums(mid) == target) {
          mid
        } else if (nums(leftPointer) <= nums(mid)) {
          if (nums(leftPointer) <= target && target < nums(mid)) {
            binarySearch(leftPointer, mid - 1)
          } else {
            binarySearch(mid + 1, rightPointer)
          }
        } else {
          if (nums(mid) < target && target <= nums(rightPointer)) {
            binarySearch(mid + 1, rightPointer)
          } else {
            binarySearch(leftPointer, mid - 1)
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

}

object SearchInRotatedSortedArray{
  def apply():SearchInRotatedSortedArray = new SearchInRotatedSortedArray()
}
