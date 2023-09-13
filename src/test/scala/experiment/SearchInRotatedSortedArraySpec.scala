package experiment
import org.specs2.mutable.Specification

/*
   There is an integer array nums sorted in ascending order (with distinct values).
    Prior to being passed to your function, nums is possibly rotated at
    an unknown pivot index k (1 <= k < nums.length) such that the resulting array is
    [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
    For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
    Given the array nums after the possible rotation and an integer target, return the index of target
    if it is in nums, or -1 if it is not in nums.
    You must write an algorithm with O(log n) runtime complexity.
 * */
class SearchInRotatedSortedArraySpec extends Specification {

  val theFunction = SearchInRotatedSortedArray()


  "Search on Rotated Array's Function" should {


    "Returns output 4 " >> {
      val nums: Array[Int] = Array(4, 5, 6, 7, 0, 1, 2)
      val target = 0
      theFunction.searchOnRotatedInput(nums, target) should_== 4
    }

    "Returns output -1 " >> {
      val nums: Array[Int] = Array(4, 5, 6, 7, 0, 1, 2)
      val target = 3
      theFunction.searchOnRotatedInput(nums, target) should_== -1
    }

    "Returns output -1 " >> {
      val nums: Array[Int] = Array(1)
      val target = 0
      theFunction.searchOnRotatedInput(nums, target) should_== -1
    }


  }


}
