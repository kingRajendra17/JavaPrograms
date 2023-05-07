
class Employee1 {

	String emp_name= "Eshwar";
	int id = 777 ;
	float salary= 15000.0f;
	String company= "ABC";

       public void employee_data() {
	   System.out.println(" Employee : " + emp_name +  " ID " + id + " Salary : " + salary + " Company : " + company);
	}
  }
  public class Person1 {

	  public static void main(String[] args) {
		Employee1 emp = new Employee1();
		emp.employee_data();
	}
    }