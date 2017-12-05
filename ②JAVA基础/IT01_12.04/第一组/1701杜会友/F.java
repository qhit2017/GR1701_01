package com.bean;

public class F {
	private String name;
	private String number;
	private double mathematical;
	private double language;
	private double Englishperformance;
	private double totalpoints;
	//无参
	public F(){
		
	}
	//有参
	public F(String name, String number, double mathematical,
			double language, double englishperformance) {
		super();
		this.name = name;
		this.number = number;
		this.mathematical = mathematical;
		this.language = language;
		Englishperformance = englishperformance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getMathematical() {
		return mathematical;
	}
	public void setMathematical(double mathematical) {
		this.mathematical = mathematical;
	}
	public double getLanguage() {
		return language;
	}
	public void setLanguage(double language) {
		this.language = language;
	}
	public double getEnglishperformance() {
		return Englishperformance;
	}
	public void setEnglishperformance(double englishperformance) {
		Englishperformance = englishperformance;
	}
	public double getTotalpoints() {
		totalpoints=Englishperformance+language+mathematical;
		return totalpoints;
	}
	@Override
	public String toString() {
		return "Scoresystem [name=" + name + ", number=" + number
				+ ", mathematical=" + mathematical + ", language=" + language
				+ ", Englishperformance=" + Englishperformance
				+ ", totalpoints=" +  toString() + "]";
	}
	public String next() {
		// TODO Auto-generated method stub
		return null;
	}


}	

