package pl.kwi;

import org.osgi.service.component.ComponentContext;
import pl.kwi.SampleService;

/**
 * @scr.component immediate="true" 
 * @scr.service interface="SampleService"
 */
public class SampleServiceImpl implements SampleService {
	
   /** 
    * @scr.property valueRef="DEFAULT_NAME_PHRASE" 
    */  
    public static final String PROP_NAME_PHRASE = "pl.kwi.namePhrase";  
  
    public static final String DEFAULT_NAME_PHRASE = "Chris"; 
    
    private String name;

	public String getName() {
		return name;
	}
	
	protected void activate(ComponentContext context) {  
        Object namePhrase = context.getProperties().get(PROP_NAME_PHRASE);  
        if (namePhrase != null)  
            this.name = namePhrase.toString();  
    } 

}
