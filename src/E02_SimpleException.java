
public class E02_SimpleException extends Exception {
	public static void main(String[] args) {
		String string =null;
		try {
			string.toCharArray();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
