package Employee;

import java.util.*;

// Class
class Employee {
	private String name;
	private int id;
	private double salary;
	private String dept;

//Constructor or Setter
	public Employee(String name, int id, double salary, String dept) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.dept = dept;
	}

// Getter

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public double getSalary() {
		return salary;
	}

	public String getDept() {
		return dept;
	}

//Setter

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

}

public class EmployeeDetails {

	List<Employee> emplist = new ArrayList<Employee>();

	// ADD Method
	public void addEmp(Employee emp) {
		emplist.add(emp);
	}

	// Get EmpID

	public Employee getEmp(String empId) {
		for (Employee emps : emplist) {
			if (emps.getId() == Integer.parseInt(empId)) {
				return emps;
			}
		}
		return null;
	}

	// Get All Employees

	public List<Employee> getAllEmp() {
		return emplist;
	}

	// Delete Employee

	public void deleteEmp(String empId) {
		for (Employee emps : emplist) {
			if (emps.getId() == Integer.parseInt(empId)) {
				emplist.remove(emps);
			}
		}
	}

	// Update Employee

	public boolean updateEmp(String empId, String dept) {
		for (Employee emps : emplist) {
			if (emps.getId() == Integer.parseInt(empId)) {
				emps.setDept(dept);
				return true;
			}
		}
		return false;
	}

	public int getNoofEmp() {
		return emplist.size();
	}

	public boolean existsEmp(String empId) {
		for (Employee emps : emplist) {
			if (emps.getId() == Integer.parseInt(empId)) {
				return true;
			}
		}
		return false;
	}

	
	
	/* emplist.add(new Employee("Raj", 101, 2500.0, "Java")); 
	 emp.add(new Employee("Kumar", 102, 3500.0, "Python")); 
	 emp.add(new Employee("Goutham", 103, 4500.0, "SQL")); 
	 emp.add(new Employee("Kasi", 104, 3300.0, "ReactJS"));
	 
	  // Retrieving for (Employee emp1 : emp) System.out.println("Name : " +
	  emp1.getName() + " ID : " + emp1.getId() + " Salary :" + emp1.getSalary() +
	 " Department : " + emp1.getDept()); }
	 */
}
