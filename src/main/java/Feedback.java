import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/feedback")

public class Feedback extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Feedback Form</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<form action='ratings'>");
        out.print("Enter Name:<input type='text' name='name'>");
        out.print("<br/><br/>");
        out.print("Enter Year:<input type='number' name='year'>");
        out.print("<br/><br/>");
        out.print("Ratings:<input type='number' name='rat'>");
        out.print("<br/><br/>");
        out.print("<button type='submit'>Submit</button>");
        out.print("</form>");
        out.print("</body>");
        out.print("</html>");
    }
}
