package performance;

public class Student {

	private String name;
	private String id;
	private double mathScore;
	private double chineseScore;
	private double englishScore;
	private double totleScore;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String id, double mathScore,
			double ChineseScore, double EnglishScore, double totleScore) {
		this.name = name;
		this.id = id;
		this.mathScore = mathScore;
		this.chineseScore = ChineseScore;
		this.englishScore = EnglishScore;
		this.totleScore = totleScore;
		
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

	public double getChineseScore() {
		return chineseScore;
	}

	public void setChineseScore(double ChineseScore) {
		this.chineseScore = ChineseScore;
	}

	public double getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(double EnglishScore) {
		this.englishScore = EnglishScore;
	}

	public double getTotleScore(){
		totleScore = englishScore + chineseScore + mathScore;
		return totleScore;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", mathScore="
				+ mathScore + ", ChineseScore=" + chineseScore
				+ ", EnglishScore=" + englishScore + ", TotleScore="
				+ getTotleScore() + "]";
	}
	
	
}
