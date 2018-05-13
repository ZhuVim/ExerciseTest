package algorithm;
public class QuickSort {
	
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
		 
		 if(l>=r) return; //Ӧ�÷���ߣ����l>rֱ�ӷ��أ������뵽��һ�д���
		 int tmp = list[l];
	        int low = l;
	        int high = r;
//	        if(l>=r) return; ���ܷ���ߣ���Ϊ�п���l����ֵ����list�ı߽磬�׳��쳣
	        //����ĵ�һ����Ϊ����
	        while (low < high) {
	            while (low < high && list[high] > tmp) {
	                high--;
	            }
	            if(low<high)
	            list[low++] = list[high];   //������С�ļ�¼�Ƶ��Ͷ�
	            while (low < high && list[low] < tmp) {
	                low++;
	            }
	            if(low<high)
	            list[high--] = list[low];   //�������ļ�¼�Ƶ��߶�
	        }
	        list[low] = tmp;              //�����¼��β
            _quickSort(list, l, low-1 );        //�Ե��ֱ���еݹ�����
            _quickSort(list, low+1 , r);       //�Ը��ֱ���еݹ�����
	    }

	 public static void qs(int items[], int left, int right)
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

		while ((pivot <= items [j]) && (j > i))
			{
			j--;
			}
		while ((items [i] <= pivot) && (i < j))
			{
			i++;
			}
			
		if (i < j) 
			{
			temp = items [i];
			items [i] = items [j];
			items [j] = temp;
//			i++;
//			j--;
			}
		}
	qs (items, left, i-1);
	qs (items, i+1, right);
	}
	
	public static void quicksort2(int items[], int left, int right) 
	{ 
	    int i,j,t,temp; 
	    if(left>=right) 
	       return; 
	                                
	    temp=items[left]; //temp�д�ľ��ǻ�׼�� 
	    i=left; 
	    j=right; 
	    while(i<j) 
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
	    //���ս���׼���λ 
	    items[left]=items[i]; 
	    items[i]=temp;             
	    quicksort2(items,left,i-1);//��������ߵģ�������һ���ݹ�Ĺ�� 
	    quicksort2(items,i+1,right);//�������ұߵ� ��������һ���ݹ�Ĺ�� 
	} 
	public static void quicksort3( int[]array1, int left, int right) {
        if(left < right){
                int key = array1[left];
                int low = left;
                int high = right;
                while(low < high){
                        while(low < high && array1[high] >= key){
                                high--;
                        }                       
                        array1[low] = array1[high];
                        while(low < high && array1[low] <= key){
                                low++;
                        }
                        array1[high] = array1[low];
                }
                array1[low] = key;
                quicksort3(array1,left,low-1);
                quicksort3(array1,low+1,right);
        }
}
	public static void quicksort4( int[]array1, int left, int right) {
		if (left>=right)
			return;
		int low=left;
		int high=right;
		int key=array1[left];
		while (low<high) {
			while (low<high && array1[high]>=key) {
				high--;
			}
			swap(array1, low, high);
			while (low<high && array1[low]<=key) {
				low++;
			}
			swap(array1, low, high);
		}
		quicksort4(array1, left, low-1);
		quicksort4(array1, low+1, right);
	}
}
