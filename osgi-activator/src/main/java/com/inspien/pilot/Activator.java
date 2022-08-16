package com.inspien.pilot;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
	@Override
	public void start(BundleContext context) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		TestObj obj = new TestObj();
		obj.message = "Hello world !!";
		System.out.println(mapper.writeValueAsString(obj));
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("bundle stop");
	}

	private static class TestObj {
		public String message;
	}
}
