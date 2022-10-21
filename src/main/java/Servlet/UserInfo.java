package Servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="userinfo",
        urlPatterns={"/UserInfo"})

public class UserInfo extends HttpServlet {
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<HTML>\n<BODY>\n" +
                "<H1>Recapitulatif des informations</H1>\n" +
                "<UL>\n" +
                " <LI>Name: "
                + request.getParameter("name") + "\n" +
                " <LI>Email: "
                + request.getParameter("email") + "\n" +
                " <LI>Subject: "
                + request.getParameter("subject") + "\n" +
                " <LI>Field: "
                + request.getParameter("study") + "\n" +
                " <LI>Year: "
                + request.getParameter("year") + "\n" +
                "</UL>\n" +
                "</BODY></HTML>");
    }
}




