package solutions;

public class CanPlaceFlowers {


  /*
  You have a long flowerbed in which some of the plots are planted, and some are not.
  However, flowers cannot be planted in adjacent plots.
  Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty,
  and an integer n,
  return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule
  and false otherwise.

  Example 1:
  ------------------------------
  ------------------------------
  Input: flowerbed = [1,0,0,0,1], n = 1
  Output: true
  ------------------------------

  Example 2:
  ------------------------------
  ------------------------------
  Input: flowerbed = [1,0,0,0,1], n = 2
  Output: false
  ------------------------------

  Constraints:
  ------------------------------
  ------------------------------
  1 <= flowerbed.length <= 2 * 104
  flowerbed[i] is 0 or 1.
  There are no two adjacent flowers in flowerbed.
  0 <= n <= flowerbed.length

  */

  /*
   * Runtime : 1ms, Memory : 44.10MB
   */
  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    int count = 0;
    for (int i = 0; i < flowerbed.length; i++){

      if(flowerbed[i] == 0 && flowerbed.length == 1){
        count ++;
        break;
      }

      // checking for 1st index is zero
      if(i == 0 && flowerbed[i] == 0){
        if(flowerbed[i + 1] == 0){
          flowerbed[i] = 1;
          count++;
        }
      } else if (flowerbed[i] == 0
          && i + 1 < flowerbed.length
          && flowerbed[i + 1] == 0 && flowerbed[i - 1] != 1) {

        flowerbed[i] = 1;
        count++;

      } else if( i == flowerbed.length-1
          && flowerbed[i] == 0
          && flowerbed[i -1] == 0){

        flowerbed[i] = 1;
        count++;

      }

    }

    return count >= n;


  }
}
