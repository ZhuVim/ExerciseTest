package sort.algorithm;

import java.util.Arrays;

import javax.rmi.CORBA.Util;
import sort.algorithm.*;
import java.util.*;
public class TestSort {
	static int[] array ;
	static int[] array1;
	final static int MAX_TIME = 10;
	public static void main(String[] args) {
		for(int b =0;b<MAX_TIME;b++)
		{
		Random random = new Random();
		int arrayLength = (int)random.nextInt(40);
//		int arrayLength = 5;
		array = new int[arrayLength];
		array1 = new int[arrayLength];
		System.arraycopy(array, 0, array1, 0, array.length);
		for (int i = 0; i < array.length; i++) {
			array[i]=random.nextInt(20);
		}
		System.arraycopy(array, 0, array1, 0, array.length);
		Arrays.sort(array);
//		quitsort(array1,(int)0, arrayLength-1);//OK
//		qs(array1, (int)0, arrayLength-1);//NO
//		QuickSort._quickSort(array1, (int)0, arrayLength-1);
//		QuickSort.quicksort2(array1, (int)0, arrayLength-1);
//		quicksort3( (int)0, arrayLength-1);//NO
//		MaoPao.maoSort(array1, 0, arrayLength-1);
//		InsertSort.derctInsertSort(array1, 0,  arrayLength-1);
		InsertSort.binaryInsertSort(array1, 0,  arrayLength-1);
		if(Arrays.equals(array, array1))
		System.out.println("排序成功");
		else 
			System.out.println("没有排序成功");
		}
	}
}
