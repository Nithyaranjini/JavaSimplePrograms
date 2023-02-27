package og.emp;

public class Employee {
	public void empId() {
		System.out.println("100356");
	}
	public void empName() {
		System.out.println("Annu");
	}
	public void empDOB() {
		System.out.println("18-Nov-1990");
	}
	public void empEmail() {
		System.out.println("annu@gmail.com");	
	}
    public void empPhone() {			
	System.out.println("9328975421");
    }
    public void empAddress() {
		System.out.println("OMR,Chennai-97");
	}
    public static void main(String[] args) {
		Employee e = new Employee();
		
		e.empId();
		e.empName();
		e.empDOB();
		e.empEmail();
		e.empPhone();
		e.empAddress();
		
	}
}
