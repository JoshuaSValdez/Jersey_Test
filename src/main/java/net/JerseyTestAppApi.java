package net;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/")
public class JerseyTestAppApi extends ResourceConfig {
	
	private static final String WEB_LAYER_PREFIX = ".web";

	public JerseyTestAppApi() {
		packages(this.getClass().getPackage().getName() + WEB_LAYER_PREFIX);
	}
}