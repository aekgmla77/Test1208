package example;

public class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String jobId;
	private String hireDate;
	private int departmentId;
	private int salary;

	public Employee(int employeeId, String firstName, String lastName, String jobId, String hireDate, int departmentId,
			int salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.jobId = jobId;
		this.hireDate = hireDate;
		this.departmentId = departmentId;
		this.salary = salary;
	}
	
	public Employee() {
		
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
