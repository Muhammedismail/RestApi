package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;



@RestController 
public class ShortenProcess 
{

	@Autowired
	ShortenRepository Repo;
	
	@GetMapping("GetUrl")
	public List<ShortenEntity> Geturl()
	{
		List<ShortenEntity> objSe = (List<ShortenEntity>) Repo.findAll();
		return objSe;
	}
	
	
}
