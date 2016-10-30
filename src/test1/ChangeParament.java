package test1;

public class ChangeParament {
	public ChangeParament(String...strings) {
		// TODO Auto-generated constructor stub
		for (String string : strings) {
			System.out.println(string);
		}
	}
//	public static void main(String[] args) {
//		ChangeParament changeParament = new ChangeParament("ss","ww","wewe");
//	}
	public static void main(String...args) {
		for (String string : args) {
			System.out.println(string);
		}
	}
}

