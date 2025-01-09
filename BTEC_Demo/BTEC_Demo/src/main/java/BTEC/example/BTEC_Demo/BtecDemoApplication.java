package BTEC.example.BTEC_Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BtecDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BtecDemoApplication.class, args);
	}

}
