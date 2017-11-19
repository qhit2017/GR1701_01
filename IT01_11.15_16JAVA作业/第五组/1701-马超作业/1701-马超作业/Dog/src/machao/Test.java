package machao;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月17日 下午3:43:00 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {
public static void main(String[] args) {
		
		PoliceDogs policdog = new PoliceDogs();
		
		policdog.setVarieties("罗威纳犬");
		policdog.setHaircolor("黑");
		policdog.setAge(9);
		policdog.setWeight(51.0);
		policdog.eyescolor="古铜";
		policdog.legs=4;
		policdog.maxspeed=12;
		
		policdog.dog();
		policdog.maxspeed();
		policdog.eating("不怎么挑食！");
		policdog.working("凭借嗅觉寻找犯人和违禁品！");
	}
}

}
