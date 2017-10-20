package com.vfdiaz.springboot.springbootjparest;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vfdiaz.springboot.springbootjparest.model.Province;
import com.vfdiaz.springboot.springbootjparest.model.Town;
import com.vfdiaz.springboot.springbootjparest.rest.ProvinceService;

@SpringBootApplication
public class SpringbootLombokApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLombokApplication.class, args);
	}

	@Autowired
	ProvinceService provinceService;

	@Override
	public void run(String... args) throws Exception {

		Province ourense = new Province();
		ourense.setName("Ourense");
		ourense.setCapital("Ourense");

		Town xinzo = new Town();
		xinzo.setName("Xinzo de Limia");
		xinzo.setZipCode("32111");
		xinzo.setProvince(ourense);
		
		ourense.setTowns(Arrays.asList(xinzo));

		provinceService.save(ourense);

	}

}
