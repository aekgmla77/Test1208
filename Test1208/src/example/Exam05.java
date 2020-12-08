package example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Exam05 {
	public static void main(String[] args) {
		Connection conn = DAO.getConnection();
		List<Employee> list = new ArrayList<>(); // collection 선언
		try {
			PreparedStatement psmt = conn.prepareStatement("select * from emp1"); // 예외처리
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee(); // 초기값. 필드에 값이 안 들어있음
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				emp.setDepartmentId(rs.getInt("department_id"));
				emp.setHireDate(rs.getString("hire_date"));
				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//문제 5번
		Stream<Employee> stream = list.stream();
		double avg = list.stream()
				.mapToInt((value) -> value.getSalary())
				.average()
				.getAsDouble();
		System.out.println("평균급여: " + avg);
		
		
				
	}
	

}
