package test1;
enum Currency{
	ONE, TWO, THREE
}
public class TestEnum {
	Currency showCurren;
	public TestEnum(Currency currency) {
		this.showCurren=currency;
	}
	public void describe() {
		System.out.print("This currency is ");
		switch (showCurren) {
		case ONE:
			System.out.println("this is one");
			break;
		case TWO:
			System.out.println("this is two");
			break;
		case THREE:
			System.out.println("this is three");
			break;
		default:
			break;
		}
	}
	public static void main(String[] args) {
		TestEnum testEnumOne=new TestEnum(Currency.ONE);
		TestEnum testEnumTwo=new TestEnum(Currency.TWO);
		TestEnum testEnumThree=new TestEnum(Currency.THREE);
		testEnumOne.describe();
		testEnumTwo.describe();
		testEnumThree.describe();
//		for(Currency s:Currency.values())
//			System.out.println(s+", ordinal  " + s.ordinal());
	
	}
}
