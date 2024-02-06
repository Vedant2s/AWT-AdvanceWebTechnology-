import java.io.*;  
import javax.servlet.http.*;  
  
  
public class SessionServlet extends HttpServlet {  
  
    /**
     *
     * @param request
     * @param response
     */
    @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response){  
    try{  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String n=request.getParameter("userName");  
    out.print("Welcome "+n);  
  
    Cookie ck=new Cookie("uname",n);//creating cookie object  
    response.addCookie(ck);//adding cookie in the response  
        //Cookie ck2=new Cookie("user","");//deleting value of cookie  
ck.setMaxAge(0);//changing the maximum age to 0 seconds  
response.addCookie(ck);//adding cookie in the response 
//    creating submit button  
    out.print("<form action='Sessiontracking2' method= 'post'>");  
    out.print("<input type='submit' value='go'>");  
    out.print("</form>");  
          
    out.close();  
 
        }catch(Exception e){System.out.println(e);}  
  }  
}  