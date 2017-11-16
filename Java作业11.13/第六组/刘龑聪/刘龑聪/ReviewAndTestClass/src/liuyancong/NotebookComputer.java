package liuyancong;

public class NotebookComputer {
	public static void main(String[] args) {
		Computer notebook = new Computer();
		
		notebook.sort="笔记本电脑";
		notebook.brand="联想";
		notebook.type="ideapad110";
		notebook.price=3499;
		notebook.CPU="酷睿I7-6500U";
		notebook.RAM=4;
		notebook.disk=500;
		notebook.SSD=256;
		
		notebook.computer();
	}
}
