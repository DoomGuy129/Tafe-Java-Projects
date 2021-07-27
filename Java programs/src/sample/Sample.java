package sample;
import java.util.Scanner;
public class Sample {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean IsProgramRunning = true;
		System.out.println("Sample Console Program 5 - IF statement, Area and Perimeter");
		while(IsProgramRunning == true) {
		System.out.println("Square or Circle?");
		String Type = input.nextLine();
			if (Type.equalsIgnoreCase("Square")) {
				int length = 0, breadth = 0;
				boolean isvalidPreference = true;
				while(isvalidPreference == true) {
					while(true) {
						System.out.print("Enter the Length: ");
						try {
							length = Integer.parseInt(input.nextLine());
							if(length < 0) {
								System.out.println("Error: length < 0");
							}
							else {
								break;
							}
						}
						catch(Exception e)
						{
							System.out.println("Unacceptable");
						}
					}
					while(true) {
						System.out.print("Enter the Breadth: ");
						try {
							breadth = Integer.parseInt(input.nextLine());
							if(breadth < 0) {
								System.out.println("Error: breadth < 0");
							}
							else {
								break;
							}
						}
						catch (Exception e)
						{
							System.out.println("Unacceptable");
						}
					}
				System.out.print("Area or Perimeter: ");
				String preference = input.nextLine();

					if (preference.equalsIgnoreCase("Area")) {
						int area = length * breadth;
						System.out.println("Area = " + area);
						isvalidPreference = false;
					} else if (preference.equalsIgnoreCase("Perimeter")) {
						int perimeter = 2 * (length + breadth);
						System.out.println("Perimeter = " + perimeter);
						isvalidPreference = false;
					} else if (preference.equalsIgnoreCase("Exit")) {
						isvalidPreference = false;
					} else {
						System.out.println("Unacceptable");
					}
				}
			}
			else if (Type.equalsIgnoreCase("Circle")) {
				int radius = 0;
				boolean isvalidPreferenceC = true;
				while(isvalidPreferenceC == true) {
					while(true) {
						System.out.println("Enter in the radius:");
						try {
							radius = Integer.parseInt(input.nextLine());
							if(radius < 0) {
								System.out.println("Error: radius < 0");
							}
							else {
								break;
							}
						} catch (Exception e) {
							System.out.println("Unacceptable");
						}
					}
					System.out.println("Circumference or Area?");
					String preferenceC = input.nextLine();
					if (preferenceC.equalsIgnoreCase("Area")) {
						int area = (int) (3.14159 * radius * radius);
						System.out.println("Area = " + area);
					} else if (preferenceC.equalsIgnoreCase("Circumference")) {
						int Circumference = (int) (2 * 3.14159 * radius);
						System.out.println("Circumference = " + Circumference);
					} else if (preferenceC.equalsIgnoreCase("Exit")) {
						isvalidPreferenceC = false;
					}
					else {
						System.out.println("Unacceptable");
					}
				}
			}
			else if (Type.equalsIgnoreCase("Exit")) {
				IsProgramRunning = false;
			}
			else {
				System.out.println("Unacceptable");
			}
		}
	}
}