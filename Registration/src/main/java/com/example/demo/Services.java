package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Services 
{
      @Autowired
      private Repo repo;
      Reg r;
	public void Add(Reg r)
	{
		repo.save(r);
	}
	
	
	
	
}
