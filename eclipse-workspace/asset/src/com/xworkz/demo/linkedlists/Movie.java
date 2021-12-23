package com.xworkz.demo.linkedlists;

public class Movie {
	private String name;
	private int releaseYear;
	private double budget;
	private String language;

	public Movie() {
		super();
	}

	public Movie(String name, int releaseYear, double budget, String language) {
		super();
		this.name = name;
		this.releaseYear = releaseYear;
		this.budget = budget;
		this.language = language;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", releaseYear=" + releaseYear + ", budget=" + budget + ", language=" + language
				+ "]";
	}





}


