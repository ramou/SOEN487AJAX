package app;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HWFC
 */
public class HWFC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HWFC() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String students[] = {"Aria Greengrass", "Ethan Slytherin", "Isabelle Black", "Maxwell Ravenclaw", "Natalie Weasley", "Oliver Granger", "Penelope Hufflepuff", "Quinn Longbottom", "Ryan Malfoy", "Sophia Davies", "Tate Macmillan", "Uma Patil", "Violet Thomas", "Willow Finnigan", "Xander Abbott", "Yasmin Chang", "Zander Bell", "Aiden Rose", "Bianca Jones", "Caleb Lee"};
		request.setAttribute("students", students);
		
	   RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/FrontEnd.jsp");
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
