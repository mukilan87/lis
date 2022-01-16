package com.mukilan.practiceprograms;
public class lis {

  static int max_ref; 

  static int _LongestIncreasingSubsequence(int my_arr[], int arr_len)
  {

   if (arr_len == 1)
    return 1;

   int res, max_ending_here = 1;
   
   for (int i = 1; i < arr_len; i++) {
    res = _LongestIncreasingSubsequence(my_arr, i);
    if (my_arr[i - 1] < my_arr[arr_len - 1]
     && res + 1 > max_ending_here)
     max_ending_here = res + 1;
   }

   
   if (max_ref < max_ending_here)
    max_ref = max_ending_here;

   
   return max_ending_here;
  }

  
  static int LongestIncreasingSubsequence(int arr[], int n)
  {
   
   max_ref = 1;

   
   _LongestIncreasingSubsequence(arr, n);

   
   return max_ref;
  }

  
  public static void main(String args[])
  {
   int my_arr[] = { 1,8,5,6,2,7,9,0,4,3 };
   int n = my_arr.length;
   System.out.println("Length of Longest Increasing Subsequence is " + LongestIncreasingSubsequence(my_arr, n)
       + "\n");
  }
 }