
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class Validation implements Filter {    
FilterConfig f;

    /**
     *
     * @param fc
     * @throws ServletException
     */
    @Override
    public void init(FilterConfig fc) throws ServletException {
        f=fc;
       System.out.print("Hello !!! Filter Object is created at the time of "); 
    }
       
    /**
     *
     * @param sr
     * @param sr1
     * @param chain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest sr, ServletResponse sr1, FilterChain chain) throws IOException, ServletException {
    HttpServletResquest rq=(HttpServletResquest)sr;
    HttpServletResponse rs=(HttpServletResponse)sr1;
    String name=rq.getParameter("t1");
    String pass=rq.getParameter("t2");
    String v=f.getInitParameter("Name");
    rs.getWriter().print(v);
    if(name.isEmpty())
        rs.getWriter().print("name is missing");
    else if(pass.isEmpty())
        rs.getWriter().print("password is missing");
    else 
        fc.doFilter(rq,rs);
    }

    /**
     *
     */
    @Override
    public void destroy(){
    }
}
    