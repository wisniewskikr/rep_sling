package pl.kwi;

  import java.io.IOException;
  import javax.servlet.ServletException;
  import org.apache.sling.api.SlingHttpServletRequest;
  import org.apache.sling.api.SlingHttpServletResponse;
  import org.apache.sling.api.servlets.SlingAllMethodsServlet;
  /** 
   * @scr.service interface="javax.servlet.Servlet"
   * @scr.component immediate="true" metatype="no"
   * @scr.property name="service.description" value="my servlet"
   * @scr.property name="service.vendor" value="Day"
   * @scr.property name="sling.servlet.paths" value="/webapp" 
   */
  @SuppressWarnings("serial")
  public class SampleServlet extends SlingAllMethodsServlet {
  
      @Override
      protected void doGet(SlingHttpServletRequest request,
              SlingHttpServletResponse response) throws ServletException,
              IOException {
          
    	  response.setContentType("text/plain");  
          response.getOutputStream().print("Hello World: Chris");
    	  
      }

  }
