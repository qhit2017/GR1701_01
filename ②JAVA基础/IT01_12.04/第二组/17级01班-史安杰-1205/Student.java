package com.saj;

public class Student {

	String name;
	String id;
	double mathscore;
	double englishscore;
	double languagescore;
	double alwaysscore;

	public Student() {
		super();
	}

	public Student(String name, String id, double mathscore,
			double englishscore, double languagescore) {
		super();
		this.name = name;
		this.id = id;
		this.mathscore = mathscore;
		this.englishscore = englishscore;
		this.languagescore = languagescore;

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

	public double getEnglishscore() {
		return englishscore;
	}

	public void setEnglishscore(double englishscore) {
		this.englishscore = englishscore;
	}

	public double getLanguagescore() {
		return languagescore;
	}

	public void setLanguagescore(double languagescore) {
		this.languagescore = languagescore;
	}

	public double getAlwaysscore() {
		alwaysscore = languagescore + mathscore + englishscore;
		return alwaysscore;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", mathscore="
				+ mathscore + ", englishscore=" + englishscore
				+ ", languagescore=" + languagescore + ", alwaysscore="
				+ getAlwaysscore() + "]";
	}

}
