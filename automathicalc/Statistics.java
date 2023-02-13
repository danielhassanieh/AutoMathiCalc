package automathicalc;

/**The class Statistics contains methods for measuring the values in sets of data.
 * @version 0.001
 * @author Daniel Hassanieh
 */
public class Statistics
{

  /**Returns the mean of numbers in an array.
   * @param nums : The array of doubles to find the mean of.
   * @return the mean of nums.
   */
  public static double getMean(double[] nums)
  {
    double total = 0.0;
    // adds all of the doubles together
    for(double num : nums) total += num;
    // divides the sum by the length of the array and returns the mean
    return total / nums.length;
  }

  /**Returns the median of numbers in an array.
   * @param nums : an array of doubles to find the median of.
   * @param isSorted : sorts nums if false.
   * @return the median of nums.
   */
  public static double getMedian(double[] nums, boolean isSorted)
  {
    // sorts nums from least to greatest if isSorted is false
    if(!isSorted) nums = sortNums(nums);
    double median;
    // if the length of nums is even, the median is the average of the two middle numbers 
    if(nums.length % 2 == 0) median = (nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2;
    // else, the median is the middle number
    else median = nums[nums.length / 2];
    // returns the median of nums
    return median;    
  }

  /**Returns the value that appears the most often in an array of doubles.
   * @param nums : an array of doubles to find the mode of.
   * @return the mode of nums.
   */
  /* public static double getMode(double[] nums)
  {
    double[] uniqueNums = getUniqueNums(nums);
    for(double num : uniqueNums);
    return 0;
  } */
  
  /**Returns unique numbers in an array.
   * @param nums array of numbers
   * @return the unique numbers in the array.
   */
  public static double[] getUniqueNums(double[] nums)
  {
    double[] uniqueNums = new double[]{nums[0]};
    for(double num : nums)
    {
      boolean isUnique = true;
      for(double uniNum : uniqueNums)
      {
        if(uniNum == num) isUnique = false;
      }
      // checks if the double in the array is unique
      if(isUnique) {
        double[] temp = new double[uniqueNums.length + 1];
        // rebuilds the array with the new unique double at the last index
        for(int i = 0; i < temp.length; i++)
        {
          // adds the unique double to the last index of the array
          if(i == uniqueNums.length)
          {
            temp[i] = num;
            break;
          }
          // re-adds previous unique doubles to the array
          temp[i] = uniqueNums[i];
        }
        uniqueNums = temp;
      }
    }
    return uniqueNums;
  }

  /**Returns the largest value in an array of doubles.
   * @param nums : The array of doubles to find the largest value in.
   * @return the largest value in the array.
   */
  public static double getMin(double[] nums)
  {
    double min = nums[0];
    for(double num : nums) if(num < min) min = num;
    return min;
  }

  /**Returns the smallest value in an array of doubles.
   * @param nums : The array of doubles to find the smallest value in.
   * @return the smallest value in the array.
   */
  public static double getMax(double[] nums)
  {
    double max = nums[0];
    for(double num : nums) if(num > max) max = num;
    return max;
  }

  /**Returns numbers in an array sorted least to greatest.
   * @param nums : The array of numbers to be sorted.
   * @return a sorted array from least to greatest.
   */
  public static double[] sortNums(double[] nums)
  {
    double[] sortedNums = nums.clone();
    for(int i = 1; i < sortedNums.length; i++)
    {
      boolean skipSort = true;
      for(int j = 0; j < sortedNums.length - i; j++)
      {
        double first = sortedNums[j];
        double second = sortedNums[j + 1];
        if(first > second)
        {
          skipSort = false;
          sortedNums[j] = second;
          sortedNums[j + 1] = first;
        }
      }
      if(skipSort) break;
    }
    return sortedNums;
  }
  
  /**Returns the number of times a value is found in array of doubles.
   * @param nums : An array of doubles for a value to be counted in.
   * @param find : The value to be counted.
   * @return the number of times that a specific value is counted.
   */
  public static int getNumFrequency(double[] nums, double find)
  {
    int count = 0;
    for(double num : nums) if(num == find) count++;
    return count;
  }
  
  /**Returns the number of times each value is found in an array of doubles with a two-dimensional array.
   * @param nums: An array of doubles for each value to be counted.
   * @return the number of times each value is counted, with the second index in each array being the count of the value in the first index.
   */
  public static double[][] getNumFrequencies(double[] nums)
  {
    double[] uniqueNums = getUniqueNums(nums);
    double[][] numFrequencies = new double[uniqueNums.length][2];
    for(int i = 0; i < numFrequencies.length; i++)
    {
      numFrequencies[i][0] = uniqueNums[i];
      numFrequencies[i][1] = getNumFrequency(nums, uniqueNums[i]);
    }
    // returns the frequencies of each value in a two-dimensional array.
    return numFrequencies;
  }
}