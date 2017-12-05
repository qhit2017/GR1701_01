package liuyancong;

/*Author：刘龑聪
 E-mail：15539919713@163.com
 */
public class Student {

	private String name;
	private String id;
	private double mathScore;
	private double chineseScore;
	private double englishScore;
	private double totleScore;

	public Student(String name, String id, double mathScore,
			double chineseScore, double englishScore) {
		this.name = name;
		this.id = id;
		this.mathScore = mathScore;
		this.chineseScore = chineseScore;
		this.englishScore = englishScore;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public double getMathScore() {
		return mathScore;
	}

	public double getChineseScore() {
		return chineseScore;
	}

	public double getEnglishScore() {
		return englishScore;
	}

	public double getTotleScore() {
		totleScore = mathScore + chineseScore + englishScore;
		return totleScore;
	}

	@Override
	public String toString() {
		return "姓名：" + name + ",编号：" + id + ",数学：" + mathScore + ",语文："
				+ chineseScore + ",英语：" + englishScore + ",总分：" + getTotleScore()
				+ "。";
	}

}
