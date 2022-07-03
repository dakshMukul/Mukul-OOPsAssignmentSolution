package com.gl.model;

public class AdminDepartment extends SuperDepartment {
	public String departmentName()
	{
		return "Admin Department";
	}
	public String getTodaysWork()
	{
		return "Complete your documents submition";
	}
	public String getWorkDeadline()
	{
		return "Complete by EOD";
	}
    
}
