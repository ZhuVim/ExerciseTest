package test2;

import java.util.Arrays;

import javax.rmi.CORBA.Util;

import java.util.*;
public class TestQuitSort {
	static int[] array ;
	static int[] array1;
	final static int MAX_TIME = 10;
	public static void main(String[] args) {
		for(int b =0;b<MAX_TIME;b++)
		{
		Random random = new Random();
//		int arrayLength = (int)random.nextInt(40);
		int arrayLength = 5;
		array = new int[arrayLength];
		array1 = new int[arrayLength];
		System.arraycopy(array, 0, array1, 0, array.length);
		for (int i = 0; i < array.length; i++) {
			array[i]=random.nextInt(20);
		}
		System.arraycopy(array, 0, array1, 0, array.length);
		Arrays.sort(array);
//		quitsort(array1,(int)0, arrayLength-1);//OK
		qs(array1, (int)0, arrayLength-1);//NO
//		_quickSort(array1, (int)0, arrayLength-1);
//		quicksort3( (int)0, arrayLength-1);//NO
		if(Arrays.equals(array, array1))
		System.out.println("排序成功");
		else 
			System.out.println("没有排序成功");
		}
	}
	public static void quitsort(int[] array,int l,int u) {
		int i, m;
		if (l >= u) return;
		m = l;
		for (i = l+1; i <= u; i++)
		if (array[i] < array[l])
		swap(array,++m, i);
		swap(array,l, m);
		quitsort(array,l, m-1);
		quitsort(array,m+1, u);
	}
		
	public static void swap(int[] array,int left,int right) {
		int temp = array[left];
		array[left]=array[right];
		array[right]=temp;
	}
	
	 public static void _quickSort(int[] list, int l, int r) {
		 
		 if(l>=r) return; //应该放这边，如果l>r直接返回，不进入到下一行代码
		 int tmp = list[l];
	        int low = l;
	        int high = r;
//	        if(l>=r) return; 不能放这边，因为有可能l的数值超出list的边界，抛出异常
	        //数组的第一个作为中轴
	        while (low < high) {
	            while (low < high && list[high] > tmp) {
	                high--;
	            }
	            if(low<high)
	            list[low++] = list[high];   //比中轴小的记录移到低端
	            while (low < high && list[low] < tmp) {
	                low++;
	            }
	            if(low<high)
	            list[high--] = list[low];   //比中轴大的记录移到高端
	        }
	        list[low] = tmp;              //中轴记录到尾
            _quickSort(list, l, low-1 );        //对低字表进行递归排序
            _quickSort(list, low+1 , r);       //对高字表进行递归排序
	    }

	private static void qs(int items[], int left, int right)
	{
		if (left>=right) {    
			return;
		}
	int i, j;
	int pivot, temp;
	i = left;
	j = right;
	pivot = items [i];
	while (i < j)
		{

		while ((pivot < items [j]) && (j > i))
			{
			j--;
			}
		while ((items [i] < pivot) && (i < j))
			{
			i++;
			}
			
		if (i < j) 
			{
			temp = items [i];
			items [i] = items [j];
			items [j] = temp;
			i++;
			j--;
			}
		}
	qs (items, left, i-1);
	qs (items, i+1, right);
	}
	
	static void quicksort2(int items[], int left, int right) 
	{ 
	    int i,j,t,temp; 
	    if(left>=right) 
	       return; 
	                                
	    temp=items[left]; //temp中存的就是基准数 
	    i=left; 
	    j=right; 
	    while(i!=j) 
	    { 
	                   //顺序很重要，要先从右边开始找 
	                   while(items[j]>=temp && i<j) 
	                            j--; 
	                   //再找右边的 
	                   while(items[i]<=temp && i<j) 
	                            i++; 
	                   //交换两个数在数组中的位置 
	                   if(i<j) 
	                   { 
	                            t=items[i]; 
	                            items[i]=items[j]; 
	                            items[j]=t; 
	                   } 
	    } 
	    //最终将基准数归位 
	    items[left]=items[i]; 
	    items[i]=temp; 
	                             
	    quicksort2(items,left,i-1);//继续处理左边的，这里是一个递归的过程 
	    quicksort2(items,i+1,right);//继续处理右边的 ，这里是一个递归的过程 
	} 
//	static void quicksort3( int[] array12, int left, int right) {
//        if(left < right){
//                int key = array12[left];
//                int low = left;
//                int high = right;
//                while(low < high){
//                        while(low < high && array12[high] > key){
//                                high--;
//                        }                       
//                        array12[low] = array12[high];
//                        while(low < high && array12[low] < key){
//                                low++;
//                        }
//                        array12[high] = array12[low];
//                }
//                array12[low] = key;
//                quicksort3(array12,left,low-1);
//                quicksort3(array12,low+1,right);
//        }
//}
	static void quicksort3( int left, int right) {
        if(left < right){
                int key = array1[left];
                int low = left;
                int high = right;
                while(low < high){
                        while(low < high && array1[high] > key){
                                high--;
                        }                       
                        array1[low] = array1[high];
                        while(low < high && array1[low] < key){
                                low++;
                        }
                        array1[high] = array1[low];
                }
                array1[low] = key;
                quicksort3(left,low-1);
                quicksort3(low+1,right);
        }
}
}
