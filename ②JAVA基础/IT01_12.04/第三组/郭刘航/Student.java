package ExamSystem;
/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Student {

	private String name;
	private String ID;
	private double cGrade;
	private double mGrade;
	private double eGrade;
	private double TolGrade;
	
	public Student(){
		
	}

	/**
	 * @param name
	 * @param iD
	 * @param cGrade
	 * @param mGrade
	 * @param eGrade
	 */
	public Student(String name, String iD, double cGrade, double mGrade,
			double eGrade) {
		super();
		this.name = name;
		ID = iD;
		this.cGrade = cGrade;
		this.mGrade = mGrade;
		this.eGrade = eGrade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public double getcGrade() {
		return cGrade;
	}

	public void setcGrade(double cGrade) {
		this.cGrade = cGrade;
	}

	public double getmGrade() {
		return mGrade;
	}

	public void setmGrade(double mGrade) {
		this.mGrade = mGrade;
	}

	public double geteGrade() {
		return eGrade;
	}

	public void seteGrade(double eGrade) {
		this.eGrade = eGrade;
	}

	public double getTolGrade() {
		TolGrade = cGrade + mGrade + eGrade;
		return TolGrade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", ID=" + ID + ", cGrade=" + cGrade
				+ ", mGrade=" + mGrade + ", eGrade=" + eGrade + ", TolGrade="
				+ getTolGrade() + "]";
	}
	
	
}
