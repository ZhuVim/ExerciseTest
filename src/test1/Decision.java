package test1;

public class Decision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Decision decision = new Decision();
		String s1 = "Dasd111";
		String s2 = "dasd111";
		String s3 = "15032452983";
		String s4 = "12331344112";
		System.out.println(s1+"�ǺϷ�������"+decision.stringLegal(s1));
		System.out.println(s2+"�ǺϷ�������"+decision.stringLegal(s2));
		System.out.println(s3+"�ǺϷ��绰��"+decision.telphonenum(s3));
		System.out.println(s4+"�ǺϷ��绰��"+decision.telphonenum(s4));
	}
private boolean stringLegal(String str) {
	
	if(str.matches("\\p{Upper}\\p{Lower}\\p{Lower}\\p{Lower}\\d\\d\\d"))
		return true;
	else return false;
			
}
private boolean telphonenum(String str) {
	
	if(str.matches("1[3,5,8]\\d{9}$")) 
		return true;
	else return false;
}
}
