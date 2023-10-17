package tobiasjohansson.m3clientgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class M3ClientGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(M3ClientGatewayApplication.class, args);
	}

}
