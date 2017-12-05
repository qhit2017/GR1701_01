package machao;

import java.security.Provider.Service;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Student> arrayList=new ArrayList<Student>();
		ScoreService service=new ScoreService();
		boolean isQuit = true;
		boolean isSubQuit = false;
		int key = 0;
		service.helpinfo();
		while (isQuit) {
			key = sc.nextInt();
			switch (key) {
			case 1:
				service.addStudent(arrayList,sc);
				break;

			case 2:
				service.infostudent(arrayList);
				break;
				
			case 3:
				service.helpsubinfo();
				isSubQuit=true;
				
				while(isSubQuit){
					key=sc.nextInt();
					switch (key) {
					case 1:
						Service.getMax(arrayList,"总成绩");
						break;

                                        case 2:
						Service.getMax(arrayList,"语文成绩");
						break;

                                        case 3:
						Service.getMax(arrayList,"数学成绩");
						break;

                                        case 4:
						Service.getMax(arrayList,"英语成绩");
						break;
                                        case 5:
						isbusquit=false;	
						break;
					default:
						break;
                                        case 4:
				          isQuit=false;  
				          break;
					}
				}
				break;
			default:
				break;
			}
			system.out.println("感谢使用")
		}
			
		
	}

	}

