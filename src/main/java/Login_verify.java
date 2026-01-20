import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/next")
public class Login_verify extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String uname=req.getParameter("name");
        String pass=req.getParameter("pass");
        if(uname.equals("admin")&&pass.equals("admin@123"))
        {
            out.print("<h1>Login Successfull</h1>");
        }else{
            out.print("<h1>Wrong Credentials</h1>");
        }
    }
}
