package com.blueocean.backendjobs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.blueocean.business.myjob;

@SpringBootApplication
public class BackendjobsApplication {

	@Autowired
	public static myjob job;

	public static void main(String[] args) {

		SpringApplication.run(BackendjobsApplication.class, args);
		job.getjob();
	}

}
