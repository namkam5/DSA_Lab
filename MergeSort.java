import java.util.*;
import java.io.*;

public class MergeSort {


	public static void mergesort(int[] sortArray, int [] tmpArray,int lowIndex, int highIndex){

		if (highIndex>lowIndex){
				int midIndex = (highIndex + lowIndex)/2;
				mergeSort(sortArray, tmpArray,lowIndex,midIndex);
				mergesort(sortArray,tmpArray, midIndex+1,highIndex);
				merge(sortArray,tmpArray,lowIndex,midIndex,highIndex);
		}
	}

	public static void merge(int[] sortArray, int[] tmpArray, int lowIndex,int midIndex, int highIndex){

			int lowIndex1 = lowIndex;
			int lowIndex2 = midIndex+1;

			System.out.println(sortArray,0,tmpArray,0,sortArray.length);

			while(lowIndex1 < midIndex && lowIndex2 <= highIndex){

				if(tmpArray[lowIndex1] <= tmpArray[lowIndex2]){

					sortArray[low]
				}
			}
	}

	public static void main(String[] args) {
		
	

		int[] array = new int []{6,4,10,9,3,2,7,1};
		int[] tmp = new int [array.length]

		mergesort(array, tmp, 0, array.length-1);


		System.out.println(Arrays.toString(array));

	}
	
}