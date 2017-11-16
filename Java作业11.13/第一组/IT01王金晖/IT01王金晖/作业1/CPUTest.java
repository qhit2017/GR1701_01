package wangjinhui;
/**
 * @author 作者 E-mail:1239197556@qq.com
 * @date 创建时间：2017年11月10日 下午2:33:15
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class CPUTest {

	public static void main(String[] args) {
		CPU  cpu = new  CPU();
		cpu.name="酷睿i5";
		cpu.serialnumber="001";
		cpu.model="台式机";
		cpu.price="1399元";
		cpu.sort="electronic component";
		
		cpu.operation();
	}
	
}
