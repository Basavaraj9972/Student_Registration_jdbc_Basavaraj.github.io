package com.tap.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tap.daoImpl.StudentDaoImpl;
import com.tap.model.Student;

@WebServlet("/StudentDataController")
public class StudentDataController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
		String name = req.getParameter("name");
		String lastName = req.getParameter("lastName");
		String phoneNumber = req.getParameter("phoneNumber");
		String email = req.getParameter("email");
		int age = Integer.parseInt(req.getParameter("age"));
		LocalDate dateOfBirth = LocalDate.parse(req.getParameter("dateOfBirth"));
		String gender = req.getParameter("gender");
		String dept = req.getParameter("dept");
		int yearOfPassing = Integer.parseInt(req.getParameter("yearOfPassing"));
		String[] skills = req.getParameterValues("skills");
		String allSkills = null;
		if(skills != null) {
			allSkills =  String.join(",", skills);
		}
		else {
			allSkills = "don't have Skills"; 
		}
		Student student = new Student(name,lastName,phoneNumber,email,age,dateOfBirth,gender,dept,yearOfPassing,allSkills);
		boolean isAdded = studentDaoImpl.addStudentDetails(student);
		req.setAttribute("name", name);
		if(isAdded) {
			RequestDispatcher rd = req.getRequestDispatcher("success.jsp");
			rd.forward(req, resp);
		}
		else {
			RequestDispatcher rd = req.getRequestDispatcher("failed.jsp");
			rd.forward(req, resp);
		}
	} 
}
