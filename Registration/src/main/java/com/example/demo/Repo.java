package com.example.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface Repo extends CrudRepository<Reg,String>
{
     
	@Query("SELECT password FROM reg where email")
	public void get();
}
