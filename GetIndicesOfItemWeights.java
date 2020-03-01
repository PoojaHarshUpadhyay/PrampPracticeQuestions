import java.io.*;
import java.util.*;

class Solution {

  static int[] getIndicesOfItemWeights(int[] arr, int limit) {
    // your code goes here
    if(arr.length < 0) {
      int[] res = {};
      return res;
    }
    if(arr.length == 1){
      int[] res = {};
      return res;
    }
    HashMap<Integer, Integer> map = new HashMap<>();
    int[] result = new int[2];
    
    for(int i = 0; i < arr.length; i++) {
      int dif = limit - arr[i];
      if(map.containsKey(dif)) {
        int val = map.get(dif);
        result[0] = i;
        result[1] = val;
      }
      map.put(arr[i], i);
    }
    return result;
  }

  public static void main(String[] args) {
     int[] aa = {4, 6, 10, 15, 16};
    int[] res = getIndicesOfItemWeights(aa, 21);
    for(int i = 0; i < res.length; i++) {
      System.out.println(res[i]);
    }
  }

}
