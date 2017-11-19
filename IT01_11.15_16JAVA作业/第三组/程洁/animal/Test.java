package animal;

public class Test {
	public static void main(String[] args) {
		
		PoliceDogs policdog = new PoliceDogs();
		
		policdog.setVarieties("高加索犬");
		policdog.setHaircolor("黑");
		policdog.setAge(9);
		policdog.setWeight(60.0);
		policdog.eyescolor="棕色";
		policdog.legs=4;
		policdog.maxspeed=15;
		
		policdog.dog();
		policdog.maxspeed();
		policdog.eating("不挑食！");
		policdog.working("凭借本能 护卫牲畜");
	}
}
