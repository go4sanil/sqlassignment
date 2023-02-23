package com.sanil.SqlExecrcise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SalaryExercise {

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		ResultSet resultset;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_tabe", "root", "root");
			Statement statement = connection.createStatement();
			String query1 = "SELECT MAX(salary) from employee_table;";
			String query2 = "SELECT MIN(salary) from employee_table;";
			String query3 = "SELECT MAX(salary) from employee_table WHERE salary < (SELECT MAX(salary) from employee_table);";

			resultset= statement.executeQuery(query1);
			
			while(resultset.next())
			{
				String salaryinfo = resultset.getString("MAX(salary)");
				System.out.println(salaryinfo);
			}
			
			resultset= statement.executeQuery(query2);

			while(resultset.next())
			{
				String salaryinfo = resultset.getString("MIN(salary)");
				System.out.println(salaryinfo);
			}
			statement.execute(query3);
			resultset= statement.executeQuery(query3);

			while(resultset.next())
			{
				String salaryinfo = resultset.getString("MAX(salary)");
				System.out.println(salaryinfo);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			connection.close();
			System.out.println("Connection closed");
		}

	}

}
