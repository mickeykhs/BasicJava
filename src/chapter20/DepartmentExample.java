package chapter20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class DepartmentExample {
	public static void main(String[] args) throws Exception {
		//pc-06 ip : 192.168.142.12, id: pc06, password: java
		
		new OracleDriver();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","pc06","java");
		
		Statement statement = connection.createStatement();
		
		ResultSet resultSet = statement.executeQuery("select dept_id, dept_name, dept_tel from department");
		
		while(resultSet.next()) {
			String deptId = resultSet.getString("dept_id");
			String deptName = resultSet.getString("dept_name");
			String deptTel = resultSet.getString("dept_tel");
			System.out.printf("%s\t%s\t%s\n", deptId,deptTel,deptName);
			
		}
		resultSet.close();
		statement.close();
		connection.close();
		
	}
}
