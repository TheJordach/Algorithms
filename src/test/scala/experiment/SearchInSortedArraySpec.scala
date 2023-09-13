package experiment
import org.specs2.mutable.Specification
class SearchInSortedArraySpec extends Specification {

  val theFunction = SearchInRotatedSortedArray()

  "My implementation Function" should {


    "Returns output 4 " >> {
      val nums: Array[Int] = Array(4, 5, 6, 7, 0, 1, 2)
      val target = 0
      theFunction.search(nums, target) should_== 4
    }

    "Returns output -1 " >> {
      val nums: Array[Int] = Array(4, 5, 6, 7, 0, 1, 2)
      val target = 3
      theFunction.search(nums, target) should_== -1
    }

    "Returns output -1 " >> {
      val nums: Array[Int] = Array(1)
      val target = 0
      theFunction.search(nums, target) should_== -1
    }


  }

}
