package test1;

public class TestThis {
int count = 0;
String s = "initial value";
TestThis(int petals) {
	// TODO Auto-generated constructor stub
	count = petals;
	System.out.println("Constructor int only,count="+petals);
}
TestThis(String ss) {
	// TODO Auto-generated constructor stub
	System.out.println("Constructor String only,s="+ss);
}
TestThis(String s,int petals) {
	// TODO Auto-generated constructor stub
	this(petals);
	this.s=s;
	System.out.println("int & String");
}
TestThis() {
	// TODO Auto-generated constructor stub
	this("hi", 11);
	System.out.println("default");
}
void printPetalCount(){
	System.out.println("count= "+count+" s="+s);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TestThis x = new TestThis();
x.printPetalCount();
	}

}
