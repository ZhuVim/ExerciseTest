package test1;

public class TestAbstractExtend extends TestAbstract {
	int a=11;
	 void print()
	{
		System.out.println(a);
	}
public TestAbstractExtend() {
	// TODO Auto-generated constructor stub
	print();
}
public static void main(String[] args) {
	TestAbstractExtend abstract1=new TestAbstractExtend();
	abstract1.print();
}
}
