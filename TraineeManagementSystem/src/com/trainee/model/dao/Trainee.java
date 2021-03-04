package com.trainee.model.dao;


public class Trainee {
	
	private Integer id;
	private String name;
	private String branch;
	private Double percentage;
	
	
	public Trainee() {}
	
	public Trainee(String name, String branch, Double percentage) {
		this.name = name;
		this.branch = branch;
		this.percentage = percentage;
	}
	
	

	public Trainee(Integer id, String name, String branch, Double percentage) {
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.percentage = percentage;
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public Double getPercentage() {
		return percentage;
	}


	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Trainee [id=").append(id).append(", name=").append(name).append(", branch=").append(branch)
				.append(", percentage=").append(percentage).append("]");
		return builder.toString();
	}
	
}
