package test1;

public class Pigeon extends Bird {
	
	public void setColor(String color1)
	{
		System.out.println("����ķ���");
//		return true;
	}
	protected void proMethod() {
		System.out.println("��������");
	}
	public static void main(String[] args) {
		Pigeon pigeon = new Pigeon();
		pigeon.setColor("ss");
		pigeon.proMethod();

	}
}
