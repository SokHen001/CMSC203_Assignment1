import  java.util.Scanner;

public class WiFiDiagnosis {
	public static void main(String[] args) {
		System.out.println("If you have a problem with" + "internet connectivity," +
							"this WiFi Diagnosis might work.");
	
		Scanner connect = new Scanner(System.in);
		boolean pass = false;
		while(!pass) {
			System.out.println("\nFirst step: reboot your computer");
			System.out.println("Are you able to connect with the internet?" +
					" (yes or no)");
			String x = connect.nextLine();
			if(x.equals("yes")) {
				pass = true;
				System.out.println("Rebooting your computer seemed to work");
			} 
			else if (x.equals("no")) {
				System.out.println("Second step: reboot your router");
				System.out.println("Now are you able to connect with the internet?" +
						" (yes or no)");
				String y = connect.nextLine();
				
				if (y.equals("yes")) {
					pass = true;
					System.out.println("Rebooting your router seemed to work");
				} 
				else if (y.equals("no")) {
					System.out.println("Third step: make sure the cables to your" +
							"router are plugged in firmly and your router is getting power");
					System.out.println("Now are you able to connect with the" +
							"internet? (yes or no)");
					String z = connect.nextLine();
					if (z.equals("yes")) {
						pass = true;
						System.out.println("Cables must always have power");
					} 
					else if (z.equals("no")) {
						System.out.println("Fourth step: move your computer" +
								"closer to your router");
						System.out.println("Now are you able to connect with the" +
								"internet? (yes or no)");
						String a = connect.nextLine();
						if (a.equals("yes")) {
							pass = true;
							System.out.println("It seems moving your computer" +
									"closer to your router seemed to work");
						}
						else {
							System.out.println("Fifth step: contact your ISP");
							System.out.println("Make sure your ISP is hooked up to your router.");
							System.exit(0);
						}
								
					}
				}
			}
		}
	}
}
