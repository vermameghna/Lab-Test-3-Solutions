package com.trainee.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.trainee.model.dao.Trainee;
import com.trainee.model.service.TraineeService;
import com.trainee.model.service.TraineeServiceImpl;


@WebServlet("/TraineeManagement.do")
public class TraineeManagement extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TraineeService traineeService = new TraineeServiceImpl();
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		
		if(action == null) {
			RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/views/home.jsp");
			rd.forward(request, response);
		}
		
		
		else if(action.equalsIgnoreCase("show")) {
			List<Trainee> trainees = traineeService.allTrainees();
			request.setAttribute("trainees", trainees);
			RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/views/show.jsp");
			rd.forward(request, response);
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  String name = request.getParameter("name");
	  String branch = request.getParameter("branch");
	  Double percentage = Double.parseDouble(request.getParameter("percentage"));
	  
	  Trainee newTrainee = new Trainee(name, branch, percentage);
	  traineeService.addTrainee(newTrainee);
	  
	  List<Trainee> trainees = traineeService.allTrainees();
	  request.setAttribute("trainees", trainees);
	  
	  response.sendRedirect("TraineeManagement.do?action=show");
	}

}
