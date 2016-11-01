package test2;
import java.util.Scanner;
public class QuickSort {
	static int[] array = new int[100];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������������֣�����-1����");
		int num = scanner.nextInt();
		int arrayLength = 1;
		array[arrayLength]=num;
		while(num != -1)
		{	
			arrayLength++;	
			num = scanner.nextInt();
			array[arrayLength]=num;
				
		}
		System.out.println("����ǰ������");
		for (int i = 1; i < arrayLength; i++) {
			System.out.print(array[i]+"  ");
		}
		System.out.println("\n"+"����������");
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
	        //����ĵ�һ����Ϊ����
	        while (low < high) {
	            while (low < high && list[high] >= tmp) {
	                high--;
	            }
	            list[low++] = list[high];   //������С�ļ�¼�Ƶ��Ͷ�
	            while (low < high && list[low] < tmp) {
	                low++;
	            }
	            list[high--] = list[low];   //�������ļ�¼�Ƶ��߶�
	        }
	        list[low] = tmp;              //�����¼��β
            _quickSort(list, l, low-1 );        //�Ե��ֱ���еݹ�����
            _quickSort(list, low+1 , r);       //�Ը��ֱ���еݹ�����
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
	                                
	    temp=items[left]; //temp�д�ľ��ǻ�׼�� 
	    i=left; 
	    j=right; 
	    while(i!=j) 
	    { 
	                   //˳�����Ҫ��Ҫ�ȴ��ұ߿�ʼ�� 
	                   while(items[j]>=temp && i<j) 
	                            j--; 
	                   //�����ұߵ� 
	                   while(items[i]<=temp && i<j) 
	                            i++; 
	                   //�����������������е�λ�� 
	                   if(i<j) 
	                   { 
	                            t=items[i]; 
	                            items[i]=items[j]; 
	                            items[j]=t; 
	                   } 
	    } 
	    //���ս���׼����λ 
	    items[left]=items[i]; 
	    items[i]=temp; 
	                             
	    quicksort2(items,left,i-1);//����������ߵģ�������һ���ݹ�Ĺ��� 
	    quicksort2(items,i+1,right);//���������ұߵ� ��������һ���ݹ�Ĺ��� 
	} 
	
}
