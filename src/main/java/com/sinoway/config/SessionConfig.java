package com.sinoway.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableRedisHttpSession
public class SessionConfig {
	Logger Logger = LoggerFactory.getLogger(SessionConfig.class);
	
	@Bean
	public JedisConnectionFactory connectionFactory()
	{
		JedisConnectionFactory connection = new JedisConnectionFactory();
		connection.setPort(7009);
		connection.setHostName("192.168.4.207");
		Logger.debug("Visit redis");
		return connection;
	}
}
