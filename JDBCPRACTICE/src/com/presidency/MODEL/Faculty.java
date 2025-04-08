package com.presidency.MODEL;
public class Faculty {
	private int fid;
	private String name;
	private String designation;
	private String subject;
	// generate getter setter, constructor, toString()
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Faculty [fid=" + fid + ", name=" + name + ", designation=" + designation + ", subject=" + subject + "]";
	}
	public Faculty(int fid, String name, String designation, String subject) {
		super();
		this.fid = fid;
		this.name = name;
		this.designation = designation;
		this.subject = subject;
	}
	public Faculty() {
		super();
	}
    	

}



