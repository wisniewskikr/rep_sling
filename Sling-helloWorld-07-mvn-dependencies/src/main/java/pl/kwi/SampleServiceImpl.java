package pl.kwi;

import test.ILogService;
import test.LogService;

/**
 * @scr.component
 * @scr.service interface="SampleService"
 */
public class SampleServiceImpl implements SampleService {

	public String getName() {
		
		ILogService logService = new LogService();
		logService.logText("----- EXAMPLE TEXT ------");
		
		return "Chris";
	}

}
