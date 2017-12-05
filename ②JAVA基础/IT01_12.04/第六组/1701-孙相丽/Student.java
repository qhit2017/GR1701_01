package com.exam;

public class Student {
    //成员变量
	private String name;
	private String id;
	private double mathScore;
	private double englishScore;
	private double chineseScore;
	private double totleScore;//总成绩
	//无参的构造方法
	public Student() {
		
	}
   //有参的构造方法
	public Student(String name, String id, double mathScore,
			double englishScore, double chineseScore) {
		
		this.name = name;
		this.id = id;
		this.mathScore = mathScore;
		this.englishScore = englishScore;
		this.chineseScore = chineseScore;
	}

	//set/get方法
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

	public double getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(double englishScore) {
		this.englishScore=englishScore;
	}

	public double getChineseScore() {
		return chineseScore;
	}

	public void setChineseScore(double chineseScore) {
		this.chineseScore = chineseScore;
	}

	public double getTotleScore() {
		totleScore=mathScore+englishScore+englishScore+chineseScore;
		
		
		return totleScore;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", mathScore="
				+ mathScore + ", englishScore=" + englishScore
				+ ", chineseScore=" + chineseScore + ", totleScore="
				+  +getTotleScore()+ "]";
	}
    
	
	
	
}
