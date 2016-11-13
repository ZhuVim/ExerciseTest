package test1;

public class Pigeon extends Bird {
	
	public void setColor(String color1)
	{
		System.out.println("子类的方法");
//		return true;
	}
	protected void proMethod() {
		System.out.println("保护方法");
	}
	public static void main(String[] args) {
		Pigeon pigeon = new Pigeon();
		pigeon.setColor("ss");
		pigeon.proMethod();

	}
}
