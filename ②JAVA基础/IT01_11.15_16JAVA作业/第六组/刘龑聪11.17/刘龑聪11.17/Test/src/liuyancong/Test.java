package liuyancong;

/*作者：刘龑聪
 邮箱：15539919713@163.com
 */
public class Test {
	public static void main(String[] args) {
		Cat cat = new Cat("Tom","白色", 21);

		cat.setColor("白色");
		cat.name = "Tom";
		cat.weight = 21;

		cat.eyescolor = "绿色";

		cat.shuxing();
		cat.eat("鱼");
		cat.run();
		cat.sleep();

		cat.play();
		cat.catchmouse();
	}
}