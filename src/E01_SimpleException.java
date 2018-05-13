
public class E01_SimpleException extends Exception{
	public static void main(String[] args) {
		try {
			throw new Exception("An Exception in main");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("e.getMessage()"+e.getMessage());
		}finally {
			System.out.println("in final clause");
		}
	}
}
