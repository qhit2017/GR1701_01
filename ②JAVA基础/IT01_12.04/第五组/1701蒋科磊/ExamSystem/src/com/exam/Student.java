package com.exam;

public class Student {

	private String name;
	private String id;
	private double mathScore;
	private double chineseScore;
	private double englishScore;
	private double totalScore;
	public Student(){
		
	}
	
	public Student(String name, String id, double mathScore, double chineseScore,
			double englishScore) {
		super();
		this.name = name;
		this.id = id;
		this.mathScore = mathScore;
		this.chineseScore = chineseScore;
		this.englishScore = englishScore;
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

	public double getMathScore() {
		return mathScore;
	}

	public void setMathScore(double mathScore) {
		this.mathScore = mathScore;
	}

	public double getCheseScore() {
		return chineseScore;
	}

	public void setCheseScore(double cheseScore) {
		this.chineseScore = cheseScore;
	}

	public double getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(double englishScore) {
		this.englishScore = englishScore;
	}

	public double getSumScore() {
		totalScore=mathScore+chineseScore+englishScore;
		return totalScore;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", mathScore="
				+ mathScore + ", chineseScore=" + chineseScore
				+ ", englishScore=" + englishScore + ", totalScore="
				+ totalScore + "]";
	}
	
	
	
	
}
