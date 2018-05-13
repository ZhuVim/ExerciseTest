	class MyException extends Exception{ 
	String string;
	public MyException(String s) {
		// TODO Auto-generated constructor stub
		this.string=s;
	}
	public void printMsg()
	{
		System.out.println(this.string);
		
	}
	}
	class myException2 extends Exception{
		public myException2(String s) {
			super(s);
		}
	}
	
	public class E04_NewException extends Exception {
		public static void main(String[] args) {
			try {
				throw new MyException("MyException Message");
			} catch (MyException e) {
				// TODO: handle exception
				e.printMsg();
			}
			try {
				throw new myException2("MyException2 message");
			} catch (myException2 e) {
				// TODO: handle exception
				e.getMessage();
			}
		}
}
