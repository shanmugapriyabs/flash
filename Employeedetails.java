import java.util.*;
class Employeedetails{
	static int rollno=1;
	String name;
	String dept;
	String salary;
	int employeeid;
	public Employeedetails(String name,String dept, String salary){
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		this.employeeid=rollno;
		rollno++;
		
	}
	public String print(){
		return this.name+"--"+this.dept+"--"+this.salary;
	}
}