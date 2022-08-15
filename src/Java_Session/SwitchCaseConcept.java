package Java_Session;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browser = "Chrome";
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "safari":
			System.out.println("launch safari");
			break;

		default:
			System.out.println("please pass the right browser");
			break;

		}
		
		//use cases:
			//cross browser logic
			//mutilple evironments : QA, DEV, STAGE, PROD, UAT
			String env = "qa";
			
			switch (env.toLowerCase()) {
			case "qa":
				System.out.println("run test cases on qa env");
				break;
			case "dev":
				System.out.println("run test cases on dev env");
				break;
			case "stage":
				System.out.println("run test cases on stage env");
				break;
			case "uat":
				System.out.println("run test cases on uat env");
				break;
			case "prod":
				System.out.println("run test cases on prod env");
				break;

			default:
				System.out.println("plz pass the right env name....");
				break;
			}
			
			int marks = 80;
			switch (marks) {
			case 100:
				System.out.println("Grade A");
					if(marks == 100) {
						System.out.println("ready for scholorship");
					}
				break;
			case 90:
				System.out.println("Grade B");
				break;
			case 80:
				System.out.println("Grade C");
				break;

			default:
				System.out.println("FAIL");
				break;
			}
			
			//key -- double/float, boolean --- not applicable
//			boolean flag = true;
//			float m = 12.33f;
//			switch (m) {
//			case value:
//				
//				break;
	//
//			default:
//				break;
//			}
			
	}

}
