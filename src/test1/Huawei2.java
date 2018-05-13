package test1;

public class Huawei2 {

	static String s="a|b|c|d|e|f|g|h";
	public static void main(String[]args){  
	String[] str1=s.split("\\|");
	for(int i=0;i<str1.length;i++)
		System.out.println(str1[i]);
	    }  
}
