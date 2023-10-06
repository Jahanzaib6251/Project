import java.util.Scanner;

public class RunFIle {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		TestFile obj = new TestFile();
		Scanner input = new Scanner(System.in);
		System.out.println("_____________RECORD_______________\n");

			System.out.println("Press 1 to add student");
			System.out.println("Press 2 to check how many students you have?");
			System.out.println("Press 3 to check latest student you've added");
			System.out.println("Press 4 to check first student you've added");
			System.out.println("Press 5 to remove latest student");
			System.out.println("Press 6 to get students list");
			System.out.println("Press 7 to Clear all the record");
			System.out.println("Press 8 to search in all the record");
			System.out.println("Press 0 to exit");
			int temp = input.nextInt();
			while (temp != 0) {
				switch (temp) {
					case 1: {
						obj.add();
						break;
					}
					case 2:{
						obj.addedStudents();
						break;
					}
					case 3:{
						obj.look();
						break;
					}
					case 4:{
						 obj.first();
						    break;
					}
					case 5:{
						obj.remove();
						break;					
					}
					case 6:{
						obj.getDisplay();
						break;
					} 
					case 7:{
						obj.clear();
						break;
					}
					case 8:{
						if(obj.search()) {
							System.out.println("Found!");
						} else {
						System.out.println("Not found!");
						}
						break;
					}
					
				}//switch
				System.out.println("\n-------------------------------------------------------------------------------------\n");
				System.out.println("Choose Again...");
				System.out.println("Press 1 to add student");
				System.out.println("Press 2 to check how many students you have?");
				System.out.println("Press 3 to check latest student you've added");
				System.out.println("Press 4 to check first student you've added");
				System.out.println("Press 5 to remove latest student");
				System.out.println("Press 6 to get students list");
				System.out.println("Press 7 to Clear all the record");
				System.out.println("Press 8 to search in all the record");
				System.out.println("Press 0 to exit");
		 temp = input.nextInt();
		}//while

		
	}
}
