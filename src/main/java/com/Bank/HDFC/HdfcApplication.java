package com.Bank.HDFC;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
    info = @Info(
          title = "HDFC Bank App ",
          description = "Backend Rest APIs for HDFC Bank",
          version = "v1.0",
          contact = @Contact(
                  name = "Harshad",
                  email = "harshadbhavar123@gmail.com",
                  url = "https://github.com/ImHarshad1/HDFC-Bank"
          ),
            license = @License(
                    name = "HDFC",
                    url = "https://github.com/ImHarshad1/HDFC-Bank"
            )
    ),
        externalDocs = @ExternalDocumentation(
                description = "HDFC Bank App Documentation",
                url = "https://github.com/ImHarshad1/HDFC-Bank"
        )
)
public class HdfcApplication {

	public static void main(String[] args) {
		SpringApplication.run(HdfcApplication.class, args);

	}
}