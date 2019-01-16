package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Reg 
{ 
	 @Id
	 private String email;
     private String Fname;
     private String lname;
     private String uname;
     private String password;
     private String phone;
     private String gen;
     
     public Reg()
     {
    	 
     }
     public Reg(String Fname, String lname, String uname, String email,String password,String phone, String gen)
     {
    	 
    	 
    	 this.Fname = Fname;
    	 this.lname = lname;
    	 this.email = email;
    	 this.password = password;
    	 this.phone = phone;
    	 this.gen = gen;
    	 
    	 
     }
	public String getFname() 
	{
		return Fname;
	}
	public void setFname(String fname) 
	{
		Fname = fname;
	}
	public String getLname() 
	{
		return lname;
	}
	public void setLname(String lname) 
	{
		this.lname = lname;
	}
	public String getUname() 
	{
		return uname;
	}
	public void setUname(String uname) 
	{
		this.uname = uname;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public String getPhone() 
	{
		return phone;
	}
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}
	public String getGen() 
	{
		return gen;
	}
	public void setGen(String gen) 
	{
		this.gen = gen;
	}
     
     
     
}
