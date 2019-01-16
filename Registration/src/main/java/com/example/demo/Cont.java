package com.example.demo;

import com.example.demo.Reg;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties.Jdbc;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/sri")
public class Cont 
{
     
	@Autowired
	private Services sv;
	
	
	
	@PostMapping(value="/add")
	@ResponseBody
	public String add(@RequestBody Reg r)
	{
		sv.Add(r);
		return "Data Inserted Sucessfuly!";
	}
	
	
	
	
}
