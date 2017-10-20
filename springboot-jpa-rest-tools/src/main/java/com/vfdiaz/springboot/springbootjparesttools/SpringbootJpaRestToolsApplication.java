package com.vfdiaz.springboot.springbootjparesttools;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vfdiaz.springboot.springbootjparesttools.model.Province;
import com.vfdiaz.springboot.springbootjparesttools.model.Town;
import com.vfdiaz.springboot.springbootjparesttools.rest.ProvinceService;

@SpringBootApplication
public class SpringbootJpaRestToolsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaRestToolsApplication.class, args);
	}
	
	@Autowired
	ProvinceService provinceService;

	@Override
	public void run(String... args) throws Exception {

		Province ourense = new Province("Ourense","Ourense");

		Town aPeroxa = new Town("A Peroxa", "31213");
		aPeroxa.setProvince(ourense);
		
		ourense.setTowns(Arrays.asList(aPeroxa));

		provinceService.save(ourense);

	}
}
