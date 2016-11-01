package test2;
import java.util.Scanner;
public class QuickSort {
	static int[] array = new int[100];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入排序的数字，输入-1结束");
		int num = scanner.nextInt();
		int arrayLength = 1;
		array[arrayLength]=num;
		while(num != -1)
		{	
			arrayLength++;	
			num = scanner.nextInt();
			array[arrayLength]=num;
				
		}
		System.out.println("排序前的数组");
		for (int i = 1; i < arrayLength; i++) {
			System.out.print(array[i]+"  ");
		}
		System.out.println("\n"+"排序后的数组");
//		_quickSort(array, (int)1, arrayLength-1);
//		quitsort(array,(int)1, arrayLength-1);
//		qs(array, (int)1, arrayLength-1);
		quicksort2(array, (int)1, arrayLength-1);
		for (int i = 1; i < arrayLength; i++) {
			System.out.print(array[i]+"  ");
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
	        int tmp = list[l];
	        int low = l;
	        int high = r;
	        if(l>=r) return;
	        //数组的第一个作为中轴
	        while (low < high) {
	            while (low < high && list[high] >= tmp) {
	                high--;
	            }
	            list[low++] = list[high];   //比中轴小的记录移到低端
	            while (low < high && list[low] < tmp) {
	                low++;
	            }
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
		while ((items [i] < pivot) && (i < right))
			{
			i++;
			}
		
		while ((pivot < items [j]) && (j > left))
			{
			j--;
			}
			
		if (i <= j)
			{
			temp = items [i];
			items [i] = items [j];
			items [j] = temp;
//			i++;
//			j--;
			}
		}
	qs (items, left, j);
	qs (items, i, right);
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
	
}
