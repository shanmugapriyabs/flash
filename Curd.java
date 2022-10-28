import java.util.*;
public class Curd{
	static Map<Integer,Employeedetails> datalist=new HashMap<>();
	public  void adddatas(Employeedetails employee){
		datalist.put(employee.employeeid,employee);
		System.out.println("----------------Succesfully booked");
	}
	public void edit(int id){
		String name;
		String salary;
		String dept;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name");
			name=s.nextLine();
		System.out.println("Enterthe salary");
			salary=s.nextLine();
		System.out.println("Enter the dept");
			dept=s.nextLine();
		Employeedetails employee=new Employeedetails(name,dept,salary);
		datalist.replace(id,employee);
	}
	public void delete(int id){
		datalist.remove(id);
	}
	public  void showdetails(){
		for (Map.Entry<Integer, Employeedetails> me :
             datalist.entrySet()) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue().print());

        }
    }

}