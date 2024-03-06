package wakanda.academy.pay.picpaycredy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class PicpayCredyApplication {

	public static void main(String[] args) {
		SpringApplication.run(PicpayCredyApplication.class, args);
	}
	
	@GetMapping
	public String inicioCredy() {
		return "API De Cartao De Credito";
	}

}
