/**
 * 作者：高洁 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年12月6日 下午5:50:41
 */
public class Phone {

	private String name;

	private String sex;

	private String phoneNumber;

	public Phone(String name, String sex, String phoneNumber) {
		super();
		this.name = name;
		this.sex = sex;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", sex=" + sex + ", phoneNumber="
				+ phoneNumber + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
