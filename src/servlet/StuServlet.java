package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.student;
import service.StuService;
@WebServlet("/index")

public class StuServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		req.setCharacterEncoding("UTF-8");
		
		//创建service对象
		StuService ss=new StuService();
		
		 
		List<student> stude =ss.getShow();
		req.setAttribute("stu", stude);
		
		//网页跳转
		req.getRequestDispatcher("index.jsp").forward(req, resp);
		
		
		
	}

}
