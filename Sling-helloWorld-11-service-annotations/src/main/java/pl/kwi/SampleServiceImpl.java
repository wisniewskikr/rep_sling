package pl.kwi;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;

@Service
@Component(immediate = true)
public class SampleServiceImpl implements SampleService {

	public String getName() {
		return "Chris";
	}

}
