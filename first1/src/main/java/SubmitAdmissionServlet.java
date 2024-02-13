import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SubmitAdmissionServlet")
public class SubmitAdmissionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve form data
        String fullname = request.getParameter("fullname");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String dob = request.getParameter("dob");
        String address = request.getParameter("address");
        String previousSchool = request.getParameter("previous_school");
        String grade = request.getParameter("grade");
        String degree = request.getParameter("degree");
        String major = request.getParameter("major");
        String essay = request.getParameter("essay");

        // Display submitted data
        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h2>Submitted Form Data</h2>");
        response.getWriter().println("<p>Full Name: " + fullname + "</p>");
        response.getWriter().println("<p>Email: " + email + "</p>");
        response.getWriter().println("<p>Phone: " + phone + "</p>");
        response.getWriter().println("<p>Date of Birth: " + dob + "</p>");
        response.getWriter().println("<p>Address: " + address + "</p>");
        response.getWriter().println("<p>Previous School/College: " + previousSchool + "</p>");
        response.getWriter().println("<p>Grade/Percentage: " + grade + "</p>");
        response.getWriter().println("<p>Degree Applying For: " + degree + "</p>");
        response.getWriter().println("<p>Intended Major: " + major + "</p>");
        response.getWriter().println("<p>Personal Statement/Essay: " + essay + "</p>");
        response.getWriter().println("</body></html>");
    }
}
