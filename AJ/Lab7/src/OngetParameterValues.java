/*In this example we have created multiple checkboxes in HTML form. This form will help user to select multiple Hobbies, which is recalled in servlet/JSP page by using request.getParameterValues()method of the request object. The printWriter is a print representations of objects to a text-output stream.

*/
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class OngetParameterValues extends HttpServlet  {
    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException  {
        PrintWriter pw=res.getWriter();
        res.setContentType("text/html");

        String[] values=req.getParameterValues("habits");
        pw.println("Selected Values...");    
        for(int i=0;i<values.length;i++)  {
           pw.println("<li>"+values[i]+"</li>");
       }
       pw.close();    
    }
}