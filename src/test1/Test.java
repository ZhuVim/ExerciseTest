package test1;
import java.awt.SystemTray;
import java.util.Date;
public class Test {
	public static void main(String[] args) {
		byte[] a = new byte[255];
		for(int i=0;i<255;i++)
			a[i]=(byte) i;
		short v=(short)a[37+0x80];
		System.out.println((short)(37+0x80)&0x00FF);
		System.out.println(v);
		short c =200;
		float f=1.6f;
		System.out.println("float= "+(int)f);
	}

}
