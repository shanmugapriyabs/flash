import java.util.*;
class Main{
	public static void createdata(){
		String name;
		String salary;
		String dept;
		int id;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter name");
			name=s.nextLine();
		System.out.println("Enterthe salary");
			salary=s.nextLine();
		System.out.println("Enter the dept");
			dept=s.nextLine();
		Employeedetails employee=new Employeedetails(name,dept,salary);
		Curd curdobj=new Curd();
		curdobj.adddatas(employee);
		
	}
	public static void showdata(){
		Curd curdobj=new Curd();
		curdobj.showdetails();
	}
	public static void deletedata(){
		Curd curdobj=new Curd();
		int id;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the id");
		id=s.nextInt();
		curdobj.delete(id);
	}
	public static void  editdata(){
		Curd curdobj=new Curd();
		int id;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the id");
		id=s.nextInt();
		curdobj.edit(id);
	}
	public static void main(String[] args) {
		int choice;
		Scanner s=new Scanner(System.in);
		boolean loop=true;
		while(loop){
			System.out.println("Enter the choice you want\n 1. create data\n 2.edit data \n 3.delete data\n 4. list data");
			choice=s.nextInt();
			switch(choice){
				case 1:
					createdata();
					break;
				case 2:
					editdata();
					break; 
				case 3:
					 deletedata();
					 break;
				case 4:
					showdata();
					break;
				case 5:
					loop=false;
			}				
		}
			
	}
}