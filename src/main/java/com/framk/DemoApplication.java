package com.framk;

import com.corundumstudio.socketio.Configuration;
import com.corundumstudio.socketio.SocketIOServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
	@Value("${wss.server.host}")
	private String host;

	@Value("${wss.server.port}")
	private Integer port;

	@Bean
	public SocketIOServer socketIOServer()
	{
		Configuration config = new Configuration();
		config.setHostname(host);
		config.setPort(port);
		final SocketIOServer server = new SocketIOServer(config);
		return server;
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
