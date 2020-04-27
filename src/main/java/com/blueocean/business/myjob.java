package com.blueocean.business;

import org.springframework.beans.factory.annotation.Autowired;

import com.blueocean.backendjobs.repository.BackendJobRepo;

public class myjob {

	@Autowired
	public BackendJobRepo backendrepo;
	
	public void getjob() {
		backendrepo.fetchArticles("1", "1");
	}
}
