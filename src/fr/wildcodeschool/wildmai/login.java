package fr.wildcodeschool.wildmai;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "login", urlPatterns = "/login")
public class login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String mail = request.getParameter("eMail");

        request.getSession().setAttribute("email", mail);

        MailBean email = new MailBean();
        email.setContent("none");
        email.setFrom("moi");
        email.setTo(mail);
        request.setAttribute("mailist", email);

        if (mail != null && !mail.isEmpty()) {
            this.getServletContext().getRequestDispatcher("/maillist.jsp").forward(request, response);
        } else {
            this.getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String mail = (String) request.getSession().getAttribute("email");

        if (mail != null && !mail.isEmpty()) {

            MailBean email = new MailBean();
            email.setContent("none");
            email.setFrom("moi");
            email.setTo(mail);
            request.setAttribute("mailist", email);

            this.getServletContext().getRequestDispatcher("/maillist.jsp").forward(request, response);

        } else {

            this.getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }
}

