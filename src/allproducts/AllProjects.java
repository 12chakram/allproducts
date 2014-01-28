package allproducts;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/showallprojects")
public class AllProjects extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	    public AllProjects() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

	        /**
	         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	         */
	        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        
	                request.setAttribute("yes", true);
	                RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.htm");
	                requestDispatcher.forward(request, response);
	        }

	        /**
	         * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	         */
	        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	                // TODO Auto-generated method stub
	        }

	        /**
	         * @see HttpServlet#doOptions(HttpServletRequest, HttpServletResponse)
	         */
	        protected void doOptions(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	                // TODO Auto-generated method stub
	        }

	}
