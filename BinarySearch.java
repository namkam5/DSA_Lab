import java.util.*;
import java.io.*;

public class BinarySearch{
  
  public static void main(String args[]){
    
      int[] arr = {2,3,4,5,6,12,24,48,72,83};
      
      // Binary Search is only for sorted arrays.
      
      int y = binarySearch(arr,4);  // say we have to search for 4
      System.out.println(y);  // this will output 2 which is the index of 4 in the given array
    }
  
  // The Iterative Solution
  
  static int binarySearch(int[] arr , int x){

        int low = 0;
        int high = arr.length - 1;
        
        while(low <= high){
            
            int mid = (low+high)/2 ;
            
            if(arr[mid] == x) return mid;
            
            else if(arr[mid] > x){
                high = mid;
            }
            
            else if(arr[mid] < x){
                low = mid+ 1;
            }
            
        }

        return 0;  
  }
  
}