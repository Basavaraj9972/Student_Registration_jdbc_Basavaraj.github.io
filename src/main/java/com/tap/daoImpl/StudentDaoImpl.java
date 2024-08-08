package com.tap.daoImpl;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.tap.dao.StudentDao;
import com.tap.model.Student;

public class StudentDaoImpl implements StudentDao {
	Connection connection =null;
	public StudentDaoImpl(){
		String url ="jdbc:mysql://localhost:3306/studentregistration";
		String userName ="root";
		String password ="root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Class Loaded Successfully");
			connection = DriverManager.getConnection(url,userName,password);
			System.out.print("Data base connection established successfully");
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public boolean addStudentDetails(Student student) {
		String INSER_STUDENT ="insert into `student` (`name`, "
				+ "`lastname`, `phoneNumber`, "
				+ "`email`, `age`, `dateOfBirth`, `gender`,"
				+ " `department`, `yearOfPassing`, `skills`)"
				+ " values(?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement statement = connection.prepareStatement(INSER_STUDENT);
			statement.setString(1, student.getName());
			statement.setString(2, student.getLastname());
			statement.setString(3, student.getPhoneNumber());
			statement.setString(4, student.getEmail());
			statement.setInt(5, student.getAge());
			statement.setDate(6, Date.valueOf(student.getdateOfBirth()));
			statement.setString(7, student.getGender());
			statement.setString(8, student.getDepartment());
			statement.setInt(9, student.getYearOfPassing());
			statement.setString(10, student.getSkills());
			int executeUpdate = statement.executeUpdate();
			return executeUpdate>0 ? true : false;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
}
