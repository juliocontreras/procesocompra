package com.basico;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class comprar
 */
@WebServlet("/Comprar")
public class Comprar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Comprar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Copias los valores del formulario
		String correo = request.getParameter("correo");
		String producto = request.getParameter("producto");
		int  unidades = Integer.parseInt(request.getParameter("unidades"));
		
		//Variable de la memoria de la sesion del request
		HttpSession session = request.getSession();
		//Pegas los valores del formulario en la variable session
		session.setAttribute("pedido", new Pojo(correo, producto, unidades));
		
		//Creas el dispatcher del request, que te envia a compra.jsp y ademas, adjunta lo almacenado en request
		request.getRequestDispatcher("/compra.jsp").forward(request, response);
		
		
//		doGet(request, response);
	}

}
