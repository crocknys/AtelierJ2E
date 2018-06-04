package fr.wildcodeschool.wildmai;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet", urlPatterns = "/email")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String mailrequested = request.getParameter("eMail");

        MailBean email = new MailBean();
        email.setContent("none");
        email.setFrom("moi");
        email.setTo(mailrequested);
        request.setAttribute("email", email);

        if ( mailrequested != null && !mailrequested.isEmpty()) {
            request.getSession().setAttribute("mail",mailrequested);
            this.getServletContext().getRequestDispatcher("/maillist.jsp").forward(request,response);
        } else {
            this.getServletContext().getRequestDispatcher("/login.jsp").forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
