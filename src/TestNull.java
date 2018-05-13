import java.*;
import java.lang.reflect.Array;
import java.util.Arrays;
public class TestNull {
static class Test1{
	boolean flag;
	int num;
	void setFlag(boolean flag)
	{this.flag=flag;}
	void setNum(int num)
	{this.num=num;}
}
static byte[] array1={1,1,1,1,1,1,1,1,1,1,1};
public void changeArray(byte[] array,boolean flag) {
	for(int i=0;i<array.length;i++)
		array[i]=0x00;
	flag=true;
}
static boolean flag1=false;
public static void main(String[] args) {
TestNull testNull=new TestNull();
	
	testNull.changeArray(array1,flag1);
	System.out.println(Arrays.toString(array1));
	System.out.println(flag1);
}
}