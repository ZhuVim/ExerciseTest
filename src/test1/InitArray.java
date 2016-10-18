package test1;

public class InitArray {
public InitArray(String s) {
	// TODO Auto-generated constructor stub
	System.out.println("InitTest()");
	System.out.println(s);
	
}

public static void main(String[] args) {
	InitArray[] testArray=new InitArray[19];
	
	for(short i = 0; i < testArray.length;i++)
	{
		testArray[i]= new InitArray(Integer.toString(i));
	}
} 
}
