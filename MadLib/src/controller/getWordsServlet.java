package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MadLib;

// Luke Xiong

/**
 * Servlet implementation class getWordsServlet
 */
@WebServlet("/getWordsServlet")
public class getWordsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getWordsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println();
		
		//String userWords = request.getParameter("userWords");
		String userAdjective = request.getParameter("userAdjective");
		String userNoun = request.getParameter("userNoun");
		String userVerb = request.getParameter("userVerb");
		
		//adding this model to process word into all caps
		MadLib userWords1 = new MadLib(userAdjective, userNoun, userVerb); //error 500
		
		//adding this to redirect to another jsp page
		//>>> not correct*** request.setAttribute("userLib", userAdjective);
		//variable set on result.jsp is 'setlib'
		//have to pass over MadLib object - userWords1
		request.setAttribute("setLib", userWords1);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request,  response);
		
		//this does not print after redirect!!! ****
		PrintWriter writer = response.getWriter();
		//writer.println("I attend DMACC. I am a " + userAdjective.toUpperCase() + " student. I am studying " + userNoun.toUpperCase()+". My academic standing is " + userVerb.toUpperCase()+".");
		
		//adding a new println for the processed input
		writer.println(userWords1.toString());
		//writer.println(userAdjective.toUpperCase());
		//writer.println(userNoun.toUpperCase());
		//writer.println(userVerb.toUpperCase());
		writer.close();
		
	}

}
