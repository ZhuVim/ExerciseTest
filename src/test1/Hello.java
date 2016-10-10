package test1;

public class Hello {
	public static long a = 0x10000;
	static char b= 'a';
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chartoBinary('e');
	}
public static void chartoBinary(char ab)
{
  byte i = (byte) ab;
 byte b = 0;
while(i>0)
{
	b = (byte) (i/2);
	System.out.print(b);
	i = (byte) (i/2);
}	
}
}
