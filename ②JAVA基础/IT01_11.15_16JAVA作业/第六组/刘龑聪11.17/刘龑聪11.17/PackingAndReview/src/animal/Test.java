package animal;

public class Test {
	public static void main(String[] args) {
		
		PoliceDogs policdog = new PoliceDogs();
		
		policdog.setVarieties("ÂŞÍşÄÉÈ®");
		policdog.setHaircolor("ºÚ");
		policdog.setAge(9);
		policdog.setWeight(51.0);
		policdog.eyescolor="¹ÅÍ­";
		policdog.legs=4;
		policdog.maxspeed=12;
		
		policdog.dog();
		policdog.maxspeed();
		policdog.eating("²»ÔõÃ´ÌôÊ³£¡");
		policdog.working("Æ¾½èĞá¾õÑ°ÕÒ·¸ÈËºÍÎ¥½ûÆ·£¡");
	}
}
