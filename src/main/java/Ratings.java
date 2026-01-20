import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

@WebServlet("/ratings")
public class Ratings extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String rating = req.getParameter("rat").trim();

        if(rating.equals("5")) {
            out.print("<h3>Congratulation Student,");
            out.print("<h1>You got 1000 points</h1>");
        }

        else if(rating.equals("4")) {
            out.print("<h3>Congratulation Student,");
            out.print("<h1>You got 750 points</h1>");
        }
        else if(rating.equals("3")) {
            out.print("<h3>Congratulation Student,");
            out.print("<h1>You got 500 points</h1>");
        }
        else  {
            out.print("<h3>Welcome Student,");
            out.print("<h1>Oop's you have got no points</h1>");
        }




    }
}
