public class Kaoshen {

	private String name;

	private String id;

	private double languagee;

	private double mathematics;

	private double English;

	private double totalPoints;

	public Kaoshen() {

	}

	public Kaoshen(String name, String id, double languagee,
			double mathematics, double english) {
		super();
		this.name = name;
		this.id = id;
		this.languagee = languagee;
		this.mathematics = mathematics;
		English = english;
	}

	@Override
	public String toString() {
		return "Kaoshen [name=" + name + ", id=" + id + ", languagee="
				+ languagee + ", mathematics=" + mathematics + ", English="
				+ English + ", totalPoints=" + getTotalPoints() + "]";
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

	public double getLanguagee() {
		return languagee;
	}

	public void setLanguagee(double languagee) {
		this.languagee = languagee;
	}

	public double getMathematics() {
		return mathematics;
	}

	public void setMathematics(double mathematics) {
		this.mathematics = mathematics;
	}

	public double getEnglish() {
		return English;
	}

	public void setEnglish(double english) {
		English = english;
	}

	public double getTotalPoints() {
		totalPoints = languagee + mathematics + English;

		return totalPoints;
	}

}
