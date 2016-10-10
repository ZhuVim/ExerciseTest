package test1;

import java.util.Date;

public class Employee {
private String name;
private float salary;
private Date birthday;
public String getName(){
	return name;
}
public float getSalary(){
	return salary;
}
public Date getBirthday(){
	return birthday;
}
public void setName(String name){
	this.name = name;
}
public void setSalary(float salary) {
	this.salary = salary;
	
}
public void setBirthday(Date birthday) {
	this.birthday = birthday;
	
}
}
