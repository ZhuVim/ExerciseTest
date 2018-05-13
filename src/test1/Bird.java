package test1;

public  class Bird {
String color="白色";
String skin="羽毛";
int i=0;
String name = "zhuwuming"; 
public void setColor(String color1) {
	 color=color1;
	 System.out.println("父类的方法");
}
private void priMethod() {
	System.out.println("父类的私有方法");
}
}
