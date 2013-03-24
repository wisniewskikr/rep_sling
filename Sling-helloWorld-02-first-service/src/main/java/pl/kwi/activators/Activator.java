package pl.kwi.activators;

import java.util.Hashtable;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import pl.kwi.services.SampleService;
import pl.kwi.services.SampleServiceImpl;

 public class Activator implements BundleActivator {
 
 	public void start(BundleContext context) throws Exception {
 
 		SampleService sample = new SampleServiceImpl();
 
 		context.registerService(
 				SampleService.class.getName(), 
 				sample,
 				new Hashtable<Object, Object>());
 
 		System.err.println("SampleService Started");
 	}
 
 	public void stop(BundleContext context) throws Exception {
 		System.err.println("SampleService Stopped");
 	}
}
