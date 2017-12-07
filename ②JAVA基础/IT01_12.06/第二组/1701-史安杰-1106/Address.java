public class Address {

	private String name;
	private String sex;
	private String call;

	public Address() {

		super();
	}

	public Address(String name, String sex, String call) {
		super();
		this.name = name;
		this.sex = sex;
		this.call = call;
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

	public String getCall() {
		return call;
	}

	public void setCall(String call) {
		this.call = call;
	}

	@Override
	public String toString() {
		return "Address [name=" + name + ", sex=" + sex + ", call=" + call
				+ "]";
	}

}
