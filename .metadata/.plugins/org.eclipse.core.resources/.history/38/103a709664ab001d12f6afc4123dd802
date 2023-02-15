package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Daomain;
import dto.Dtoclass;
@WebServlet("/assd")
public class Ssmain extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		
		String s1=req.getParameter("id");
		int id=Integer.parseInt(s1);
		
		String s2=req.getParameter("name");
		
//		System.out.println(s2);
		
		Dtoclass d1=new Dtoclass();
		d1.setId(id);
		d1.setName(s2);
		
		
		Daomain daomain=new Daomain();
		daomain.insert(d1);
		
		
		resp.getWriter().print("id");
		resp.getWriter().print(s2);
		
	}
}
