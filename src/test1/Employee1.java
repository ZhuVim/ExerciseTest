package test1;

import javax.print.attribute.standard.RequestingUserName;

public class Employee1 implements Comparable<Employee1>{
	private int id;
	private String name;
	private int age;
	public Employee1 (int id,String name,int age) {
		this.id=id;
		this.age=age;
		this.name=name;
	}
	@Override
	public int compareTo(Employee1 o)
	{
		if (id>o.id) {
			return 1;
		}else if(id<o.id){
			return -1;
	}
	return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
