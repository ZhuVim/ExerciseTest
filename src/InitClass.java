
public class InitClass {
	static int snum;
	int inum=99;
	public static void main(String[] args) {
		InitClass initClass1 = new InitClass();
		InitClass initClass2 = new InitClass();
     	snum = 88;
		System.out.println("initClass2.snum="+initClass2.snum);
		System.out.println("initClass1.snum="+initClass2.snum);
		initClass1.inum = 200;
		System.out.println("initClass2.inum="+initClass1.inum);
		System.out.println("initClass1.inum="+initClass2.inum);
	}

}
