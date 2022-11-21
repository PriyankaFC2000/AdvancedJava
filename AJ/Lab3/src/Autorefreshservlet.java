import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Autorefreshservlet extends HttpServlet
{
public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
{
res.setContenttype("text/html");
PrintWriter pw=res.getWriter();
pw.println("<h1>Date and time: "+new java.util.Date());
res.setIntHeader("refresh",3);
pw.close();
}
}