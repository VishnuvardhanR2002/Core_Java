package com.xyz.basicsofprogramming.day27;

import java.util.Scanner;

public class kbc {
	static Scanner scan = new Scanner(System.in);
	static int option;
	static int reward=0; 
	static int lifeline = 2;
	static int choice;
	 static int audpole = 1;
	static int fifty = 1;
	public static void main(String[] args) {
		System.out.println("Welcome to Crorepathi");
		System.out.println("==================");
		System.out.println("Instructions : ");
		question1();
	}
	public static void question1() {
		System.out.println("Question one");
		System.out.println("Reward - 10,000");
		int reward1 = 10000;

		System.out.println();
		System.out.println("which is the pink city of india ");
		System.out.println("1] Jaipur");
		System.out.println("2] Bangalore");
		System.out.println("3] Chennai");
		System.out.println("4] Mumbai");
		System.out.println("5] lifeline");
		System.out.println("-------------------------------");
		System.out.println("Which option you want to lock");
		option = scan.nextInt();

		if(option==1 || option==2 || option==3  || option==4) {

			if(option!=1) {
				System.out.println("Wrong answer");
				System.out.println("Correct answer is : option 1");
				System.out.println("rewards won : "+0);
				System.out.println("Total rewards won : " + reward);
			}

			else {
			}
				if(option == 5) {
					if(lifeline!=0)
						System.out.println("you have two helplines");
					System.out.println("1] audpole");
					System.out.println("2] 50-50");
					System.out.println("choose your choice");
					choice = scan.nextInt();
					if(choice == 1) {
						System.out.println("1] Jaipur---------->70%");
						System.out.println("2] Bangalore------->10%");
						System.out.println("3] Chennai--------->10%");
						System.out.println("4] Mumbai---------->10%");
						System.out.println("choose your option");
						option = scan.nextInt();
						if(choice == 1) {
						System.out.println("answer is correct");
						question2();
					}
						else {
							System.out.println("wrong answer");
							System.out.println("yoy are eliminated");
							reward1 = 0;
						}
						else {
							if(choice == 2) {
								System.out.println("1] Jaipur");
								System.out.println("2] Bangalore");
								System.out.println("choose your choice");
								choice = scan.nextInt();
								if(choice == 1) {
									System.out.println("correct answer");
									question2();
								}
								else {
									System.out.println("wrong answer");
									System.out.println("yoy are eliminated");
									reward1 = 0;
								}
							}
					
					
				}
				else {
					System.out.println("choose your option");
					question1();
				}
							
						
					}
					
				System.out.println("Correct answer");
				reward=reward1;
				System.out.println("Total rewards won : " + reward);
				System.out.println("-------------------------------");
				System.out.println("Press 1 to continue");
				System.out.println("press 0 to quit");
				int next = scan.nextInt();

				if(next==0) {
					System.out.println("Your crorepathi contest is ended, By your choice");
					System.out.println("Total rewards won : " + reward1);
					System.out.println("Congratulations!");
				}
				else if(next==1){
					question2();
				}
				else {
					System.out.println("Choosen option invalied");
				}
			}
		}
		else {
			System.out.println("Choosen option invalied");
		}




	}
	public static void question2() {
		System.out.println();
		System.out.println("==================");
		System.out.println();
		System.out.println("Question two");
		System.out.println("Reward - 50,000");
		int reward2 = 50000;

		System.out.println();
		System.out.println("which is the sun city of india? ");
		System.out.println("1] Jaipur");
		System.out.println("2] Jodhpur");
		System.out.println("3] Mumbai");
		System.out.println("4] Bangalore");
		System.out.println("-------------------------------");
		System.out.println("Which option you want to lock");
		option = scan.nextInt();

		if(option==1 || option==2 || option==3  || option==4) {

			if(option!=2) {
				System.out.println("Wrong answer");
				System.out.println("Correct answer is : option 2");
				System.out.println("rewards won : "+0);
				System.out.println("Total rewards won : " + reward);
				System.out.println("Congratulations!");

			}

			else {
				System.out.println("Correct answer");
				reward=reward2;
				System.out.println("Total rewards won : " + reward);
				System.out.println("-------------------------------");
				System.out.println("Press 1 to continue");
				System.out.println("press 0 to quit");
				int next = scan.nextInt();

				if(next==0) {
					System.out.println("Your crorepathi contest is ended, By your choice");
					System.out.println("Total rewards won : " + reward2);
					System.out.println("Congratulations!");

				}
				else if(next==1){
					question3();

				}
				else {
					System.out.println("Choosen option invalied");
				}
			}
		}
		else {
			System.out.println("Choosen option invalied");
		}




	}
	private static void question3() {
		System.out.println();
		System.out.println("==================");
		System.out.println();
		System.out.println("Question three");
		System.out.println("Reward - 1,00,000");
		int reward3 = 100000;

		System.out.println();
		System.out.println("Which city is known as city of lakes");
		System.out.println("1] Bangalore");
		System.out.println("2] Hyderbad");
		System.out.println("3] Mumbai");
		System.out.println("4] Udaipur");
		System.out.println("-------------------------------");
		System.out.println("Which option you want to lock");
		option = scan.nextInt();

		if(option==1 || option==2 || option==3  || option==4) {

			if(option!=4) {
				System.out.println("Wrong answer");
				System.out.println("Correct answer is : option 4");
				System.out.println("rewards won : "+0);
				System.out.println("Total rewards won : " + reward);
				System.out.println("Congratulations!");

			}

			else {
				System.out.println("Correct answer");
				reward=reward3;
				System.out.println("Total rewards won : " + reward);
				System.out.println("-------------------------------");
				System.out.println("Press 1 to continue");
				System.out.println("press 0 to quit");
				int next = scan.nextInt();

				if(next==0) {
					System.out.println("Your crorepathi contest is ended, By your choice");
					System.out.println("Total rewards won : " + reward3);
					System.out.println("Congratulations!");

				}
				else if(next==1){
					question4();

				}
				else {
					System.out.println("Choosen option invalied");
				}
			}
		}
		else {
			System.out.println("Choosen option invalied");
		}




	}
	private static void question4() {

		System.out.println();
		System.out.println("==================");
		System.out.println();
		System.out.println("Question four");
		System.out.println("Reward - 5,00,000");
		int reward4 = 500000;

		System.out.println();
		System.out.println("which city is known as manchester of india?");
		System.out.println("1] Kolkata");
		System.out.println("2] Ahmedabad");
		System.out.println("3] Chenni");
		System.out.println("4] Celhi");
		System.out.println("-------------------------------");
		System.out.println("Which option you want to lock");
		option = scan.nextInt();

		if(option==1 || option==2 || option==3  || option==4) {

			if(option!=2) {
				System.out.println("Wrong answer");
				System.out.println("Correct answer is : option 2");
				System.out.println("rewards won : "+0);
				System.out.println("Total rewards won : " + reward);
				System.out.println("Congratulations!");

			}

			else {
				System.out.println("Correct answer");
				reward=reward4;
				System.out.println("Total rewards won : " + reward);
				System.out.println("-------------------------------");
				System.out.println("Press 1 to continue");
				System.out.println("press 0 to quit");
				int next = scan.nextInt();

				if(next==0) {
					System.out.println("Your crorepathi contest is ended, By your choice");
					System.out.println("Total rewards won : " + reward4);
					System.out.println("Congratulations!");

				}
				else if(next==1){
					question5();

				}
				else {
					System.out.println("Choosen option invalied");
				}
			}
		}
		else {
			System.out.println("Choosen option invalied");
		}





	}
	private static void question5() {


		System.out.println();
		System.out.println("==================");
		System.out.println();
		System.out.println("Question five");
		System.out.println("Reward - 10,00,000");
		int reward5 = 1000000;

		System.out.println();
		System.out.println("which city is known as steel city of india");
		System.out.println("1] Jamshedpur");
		System.out.println("2] Bellary");
		System.out.println("3] Bangalore");
		System.out.println("4] Kolkata");
		System.out.println("-------------------------------");
		System.out.println("Which option you want to lock");
		option = scan.nextInt();

		if(option==1 || option==2 || option==3  || option==4) {

			if(option!=1) {
				System.out.println("Wrong answer");
				System.out.println("Correct answer is : option 1");
				System.out.println("rewards won : "+0);
				System.out.println("Total rewards won : " + reward);
				System.out.println("Congratulations!");

			}

			else {
				System.out.println("Correct answer");
				reward=reward5;
				System.out.println("Total rewards won : " + reward);
				System.out.println("-------------------------------");
				System.out.println("Press 1 to continue");
				System.out.println("press 0 to quit");
				int next = scan.nextInt();

				if(next==0) {
					System.out.println("Your crorepathi contest is ended, By your choice");
					System.out.println("Total rewards won : " + reward5);
					System.out.println("Congratulations!");

				}
				else if(next==1){
					question6();

				}
				else {
					System.out.println("Choosen option invalied");
				}
			}
		}
		else {
			System.out.println("Choosen option invalied");
		}






	}
	private static void question6() {
		System.out.println();
		System.out.println("==================");
		System.out.println();
		System.out.println("Question Six");
		System.out.println("Reward - 15,00,000");
		int reward6 = 1500000;

		System.out.println();
		System.out.println("which city is known as joy?");
		System.out.println("1] Kolkata");
		System.out.println("2] Bangalore");
		System.out.println("3] Delhi");
		System.out.println("4] Pune");
		System.out.println("-------------------------------");
		System.out.println("Which option you want to lock");
		option = scan.nextInt();

		if(option==1 || option==2 || option==3  || option==4) {

			if(option!=1) {
				System.out.println("Wrong answer");
				System.out.println("Correct answer is : option 1");
				System.out.println("rewards won : "+0);
				System.out.println("Total rewards won : " + reward);
				System.out.println("Congratulations!");

			}

			else {
				System.out.println("Correct answer");
				reward=reward6;
				System.out.println("Total rewards won : " + reward);
				System.out.println("-------------------------------");
				System.out.println("Press 1 to continue");
				System.out.println("press 0 to quit");
				int next = scan.nextInt();

				if(next==0) {
					System.out.println("Your crorepathi contest is ended, By your choice");
					System.out.println("Total rewards won : " + reward6);
					System.out.println("Congratulations!");

				}
				else if(next==1){
					question7();

				}
				else {
					System.out.println("Choosen option invalied");
				}
			}
		}
		else {
			System.out.println("Choosen option invalied");
		}



	}
	private static void question7() {
		System.out.println();
		System.out.println("==================");
		System.out.println();
		System.out.println("Question Seven");
		System.out.println("Reward - 25,00,000");
		int reward7 = 2500000;

		System.out.println();
		System.out.println("which place is known as scotland of india?");
		System.out.println("1] coorg");
		System.out.println("2] araku");
		System.out.println("3] wayanad");
		System.out.println("4] panaji");
		System.out.println("-------------------------------");
		System.out.println("Which option you want to lock");
		option = scan.nextInt();

		if(option==1 || option==2 || option==3  || option==4) {

			if(option!=3) {
				System.out.println("Wrong answer");
				System.out.println("Correct answer is : option 3");
				System.out.println("rewards won : "+0);
				System.out.println("Total rewards won : " + reward);
				System.out.println("Congratulations!");

			}

			else {
				System.out.println("Correct answer");
				reward=reward7;
				System.out.println("Total rewards won : " + reward);
				System.out.println("-------------------------------");
				System.out.println("Press 1 to continue");
				System.out.println("press 0 to quit");
				int next = scan.nextInt();

				if(next==0) {
					System.out.println("Your crorepathi contest is ended, By your choice");
					System.out.println("Total rewards won : " + reward7);
					System.out.println("Congratulations!");

				}
				else if(next==1){
					question8();

				}
				else {
					System.out.println("Choosen option invalied");
				}
			}
		}
		else {
			System.out.println("Choosen option invalied");
		}








	}
	private static void question8() {

		System.out.println();
		System.out.println("==================");
		System.out.println();
		System.out.println("Question Eight");
		System.out.println("Reward - 50,00,000");
		int reward8 = 5000000;

		System.out.println();
		System.out.println("which city is known as queen of arabian sea?");
		System.out.println("1] Kochi");
		System.out.println("2] Vizag");
		System.out.println("3] Mumbai");
		System.out.println("4] Chennai");
		System.out.println("-------------------------------");
		System.out.println("Which option you want to lock");
		option = scan.nextInt();

		if(option==1 || option==2 || option==3  || option==4) {

			if(option!=4) {
				System.out.println("Wrong answer");				
				System.out.println("Correct answer is : option 4");
				System.out.println("rewards won : "+0);
				System.out.println("Total rewards won : " + reward);
				System.out.println("Congratulations!");

			}

			else {
				System.out.println("Correct answer");
				reward=reward8;
				System.out.println("Total rewards won : " + reward);
				System.out.println("-------------------------------");
				System.out.println("Press 1 to continue");
				System.out.println("press 0 to quit");
				int next = scan.nextInt();

				if(next==0) {
					System.out.println("Your crorepathi contest is ended, By your choice");
					System.out.println("Total rewards won : " + reward8);
					System.out.println("Congratulations!");

				}
				else if(next==1){
					question9();

				}
				else {
					System.out.println("Choosen option invalied");
				}
			}
		}
		else {
			System.out.println("Choosen option invalied");
		}




	}
	private static void question9() {


		System.out.println();
		System.out.println("==================");
		System.out.println();
		System.out.println("Question Nine");
		System.out.println("Reward - 75,00,000");
		int reward9 = 7500000;

		System.out.println();
		System.out.println("which city is known as silicon valley of india?");
		System.out.println("1] bangalore");
		System.out.println("2] chennai");
		System.out.println("3] mumbai");
		System.out.println("4] pune");
		System.out.println("-------------------------------");
		System.out.println("Which option you want to lock");
		option = scan.nextInt();

		if(option==1 || option==2 || option==3  || option==4) {

			if(option!=3) {
				System.out.println("Wrong answer");
				System.out.println("Correct answer is : option 3");
				System.out.println("rewards won : "+0);
				System.out.println("Total rewards won : " + reward);
				System.out.println("Congratulations!");

			}

			else {
				System.out.println("Correct answer");
				reward=reward9;
				System.out.println("Total rewards won : " + reward);
				System.out.println("-------------------------------");
				System.out.println("Press 1 to continue");
				System.out.println("press 0 to quit");
				int next = scan.nextInt();

				if(next==0) {
					System.out.println("Your crorepathi contest is ended, By your choice");
					System.out.println("Total rewards won : " + reward9);
					System.out.println("Congratulations!");

				}
				else if(next==1){
					question10();

				}
				else {
					System.out.println("Choosen option invalied");
				}
			}
		}
		else {
			System.out.println("Choosen option invalied");
		}





	}
	private static void question10() {

		System.out.println();
		System.out.println("==================");
		System.out.println();
		System.out.println("Question ten");
		System.out.println("Reward - 1,00,00,000");
		int reward10 = 10000000;

		System.out.println();
		System.out.println("Which city is known as city of Pearls?");
		System.out.println("1] Hyderbad");
		System.out.println("2] Chennai");
		System.out.println("3] Bangalore");
		System.out.println("4] Mumbai");
		System.out.println("-------------------------------");
		System.out.println("Which option you want to lock");
		option = scan.nextInt();

		if(option==1 || option==2 || option==3  || option==4) {

			if(option!=1) {
				System.out.println("Wrong answer");
				System.out.println("Correct answer is : option 1");
				System.out.println("rewards won : "+0);
				System.out.println("Total rewards won : " + reward);
				System.out.println("Congratulations!");

			}

			else {
				System.out.println("Correct answer");
				reward=reward10;
				System.out.println("Total rewards won : " + reward);
				System.out.println("-------------------------------");

				System.out.println("Champion! Victory is yours!");

				System.out.println("You own the final round of Crorepathi contest");
				System.out.println("Total rewards won : " + reward10);
			}
		}
		else {
			System.out.println("Choosen option invalied");
		}

	}
}