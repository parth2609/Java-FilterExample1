
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class Login extends HttpServlet {
    
    public void doGet(ServletRequest rq, ServletResponse rs)
    {
        try
        {
           rs.getWriter().print("Hello !!! Welcome to Servlet Filter Class");
        }
        catch(Exception e)
        {
            
        }
    }
}