package liuyancong;

public class Computer {
	String sort;
	String brand;
	String type;
	int price;
	String CPU;
	int RAM;
	int disk;
	int SSD;
	
	void computer(){
		  System.out.println("电脑类型：\t"+sort+"\n"
							+"电脑品牌：\t"+brand+"\n"
							+"电脑型号：\t"+type+"\n"
							+"电脑价格：\t"+price+"元\n"
							+"CPU型号：\t"+CPU+"\n"
							+"运行内存：\t"+RAM+"G"+"\n"
							+"硬盘：\t\t"+disk+"G"+"\n"
							+"固态硬盘：\t"+SSD+"G");
	}
	
}
