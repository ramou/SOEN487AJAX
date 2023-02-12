package app;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class HWStudents
 */
public class HWStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HWStudents() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String students[] = {"Aria Greengrass", "Ethan Slytherin", "Isabelle Black", "Maxwell Ravenclaw", "Natalie Weasley", "Oliver Granger", "Penelope Hufflepuff", "Quinn Longbottom", "Ryan Malfoy", "Sophia Davies", "Tate Macmillan", "Uma Patil", "Violet Thomas", "Willow Finnigan", "Xander Abbott", "Yasmin Chang", "Zander Bell", "Aiden Rose", "Bianca Jones", "Caleb Lee"};
		request.setAttribute("students", students);
		int page = 0;
		int pageSize = 5;
		try {
			page = Integer.valueOf(request.getParameter("page"));
		} catch (Exception e) {}
		try {
			pageSize = Integer.valueOf(request.getParameter("pageSize"));
		} catch (Exception e) {}
		request.setAttribute("page", page);
		request.setAttribute("pageSize", pageSize);
		request.setAttribute("count", students.length);
		
		
	   RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/Students.jsp");
	   dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
