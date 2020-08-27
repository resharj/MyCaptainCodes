package employeeObjects;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Name\t Year of Joining\t     Address");
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		emp1.name("Robert");
		emp1.yoj(1994);
		emp1.add("64C-WallsStreet");
		System.out.println("\n");
		emp1.name("Sam");
		emp1.yoj(2000);
		emp1.add("68D-WallsStreet");
		System.out.println("\n");
		emp1.name("John");
		emp1.yoj(1999);
		emp1.add("26B-WallsStreet");
		
		
	}
	public void name(String nam) {
		System.out.print(nam+"\t\t");
	}
	public void yoj(int y) {
		System.out.print(y+"\t\t");
	}
	public void add(String a) {
		System.out.print(a+"\t");
	}
	

}
