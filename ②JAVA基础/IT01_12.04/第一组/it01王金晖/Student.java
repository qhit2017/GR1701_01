package com.examination;

public class Student {

	private String name;
	private String id;
	private double mathscore;
	private double chinesescore;
	private double englishscore;
	private double totalscore;
                    
	public Student() {
		
	}

	public Student(String name, String id, double mathscore,
			double chinesescore, double englishscore, double totalscore) {
		super();
		this.name = name;
		this.id = id;
		this.mathscore = mathscore;
		this.chinesescore = chinesescore;
		this.englishscore = englishscore;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getMathscore() {
		return mathscore;
	}

	public void setMathscore(double mathscore) {
		this.mathscore = mathscore;
	}

	public double getChinesescore() {
		return chinesescore;
	}

	public void setChinesescore(double chinesescore) {
		this.chinesescore = chinesescore;
	}

	public double getEnglishscore() {
		return englishscore;
	}

	public void setEnglishscore(double englishscore) {
		this.englishscore = englishscore;
	}

	public double getTotalscore() {
		totalscore = mathscore + chinesescore + englishscore;
		return totalscore;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", mathscore="
				+ mathscore + ", chinesescore=" + chinesescore
				+ ", englishscore=" + englishscore + ", totalscore="
				+ getTotalscore() + "]";
	}

}
