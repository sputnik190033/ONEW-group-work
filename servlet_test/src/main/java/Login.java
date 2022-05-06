import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user-login")
public class Login extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		super.init();                                                                                                 
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String username = req.getParameter("username");
		String password = req.getParameter("password");

		resp.setContentType("text/html;charset=UTF-8");
		//PrintWriter out = resp.getWriter();

		if (username.equals("wang") && password.equals("wang")) {
			resp.sendRedirect("/servlet_test/Wblog.html");

		} else if (username.equals("liu") && password.equals("liu")) {
			resp.sendRedirect("/servlet_test/Lblog.html");
		} else if (username.equals("zheng") && password.equals("zheng")) {
			resp.sendRedirect("/servlet_test/Zblog.html");
		} else {
			//out.println("请再次确认用户名和密码的正确性。-_-");
			resp.sendRedirect("/servlet_test/fail.html");
		}
	}

	@Override
	public void destroy() {
		super.destroy();
	}
}