package dev.tioachan.dataPickerHelper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@MapperScan("dev.tioachan.dataPickerHelper.dao")
public class DataPickerHelperApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataPickerHelperApplication.class, args);
	}

}
