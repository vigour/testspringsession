package com.sinoway.config;

import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

public class SessionInitializer extends AbstractHttpSessionApplicationInitializer {


	public SessionInitializer(Class<?>... configurationClasses) {
		super(configurationClasses);
		// TODO Auto-generated constructor stub
	}

	public SessionInitializer() 
	{
		super(SessionConfig.class);
	}
	
	
}
