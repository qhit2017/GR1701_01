package machao;

public class Student {

	private String id;
	private String name;
	private double MathScore;
	private double ChineseScore;
	private double EnglishScore;
	private double TotleScore;
	public Student(){
	}
	public Student(String id, String name, double mathScore,
			double chineseScore, double englishScore) {
		super();
		this.id = id;
		this.name = name;
		MathScore = mathScore;
		ChineseScore = chineseScore;
		EnglishScore = englishScore;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMathScore() {
		return MathScore;
	}
	public void setMathScore(double mathScore) {
		MathScore = mathScore;
	}
	public double getChineseScore() {
		return ChineseScore;
	}
	public void setChineseScore(double chineseScore) {
		ChineseScore = chineseScore;
	}
	public double getEnglishScore() {
		return EnglishScore;
	}
	public void setEnglishScore(double englishScore) {
		EnglishScore = englishScore;
	}
	public double getTotleScore() {
		TotleScore=MathScore+EnglishScore+ChineseScore;
		return TotleScore;
	}
	@Override
	public String toString() {
		return "Student [编号=" + id + ", 姓名=" + name + ", 数学成绩="
				+ MathScore + ", 语文成绩=" + ChineseScore
				+ ", 英语成绩=" + EnglishScore + ", 总成绩="
				+ getTotleScore() + "]";
	}
	
	
}

