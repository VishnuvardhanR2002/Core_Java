package com.xyz.basicsofprogramming.Assignment;

import java.util.Scanner;

public class Crorepathi {
	static Scanner scan = new Scanner(System.in);
	static int safeReward; 
	static String name;
	static int option;
	static int reward=0; 
	static int life_line = 2;
	static int fifty_fifty = 1;
	static int audience_phone = 1;

	public static void main(String[] args) {
		System.out.println("Quiz Crorepathi");
		System.out.println("=============================");
		System.out.println();
		System.out.println("Entre your name :");
		name = scan.nextLine();
		System.out.println();
		System.out.println("Welcome "+name+" to Crorepathi quiz game");
		System.out.println();
		System.out.println("Instructions :  \n"
				+"1) You have total of ten questions.\n"
				+"2) Each Questions have specific reward points as shown below.");

		System.out.println();
		System.out.println("Question 10 : 1,00,00,000 points\n"
				+"Question 9   : 75,00,000   points\n"
				+"Question 8   : 50,00,000   points\n"
				+"Question 7   : 25,00,000   points\n"
				+"Question 6   : 15,00,000   points\n"
				+"Question 5   : 10,00,000   points\n"
				+"Question 4   : 5,00,000     points\n"
				+"Question 3   : 1,00,000     points\n"
				+"Question 2   : 50,000        points\n"
				+"Question 1   : 10,000        points\n");
		System.out.println();
		System.out.println("3) You will have two safe zones\n"
				+"1st safe zone is 5,00,000\n"
				+"2nd safe zone is 25,00,000");
		System.out.println("=============================");
		System.out.println();
		System.out.println("Enter 1 to start the game");
		int start = scan.nextInt();


		if(start ==1) {
			question1();
		}
		else {
			System.out.println("Invalied response");
		}
	}



	//==========================================================================
	//==========================================================================


	public static void question1() {
		System.out.println("Question one");
		System.out.println("Reward - 10,000");
		int reward1 = 10000;

		System.out.println();
		System.out.println("Which country won the men's Football Worldcup in 2022? ");
		System.out.println("1] Spain\n"
				+"2] Brazil\n"
				+"3] Argentina\n"
				+"4] India\n"
				+"5] lifeline");
		System.out.println("-------------------------------");
		System.out.println("Which option you want to lock");
		option = scan.nextInt();

		if(option==1 || option==2 || option==3  || option==4 || option==5) {
			if(option==5) {                                                                                       //life_line chosen 
				if(life_line!=0) {                                                                                                  //if life_line available 


					System.out.println("You have two life lines\n"
							+"1] Audience phone\n"
							+"2] Fifty_fifty\n"
							+"select the life line you want");
					int sel = scan.nextInt();
					if(sel==1) {                                                                                                             //audience phone selected  
						if(audience_phone == 1) {                                                                                             //if audience phone available   
							audience_phone--;
							life_line--;
							System.out.println("Audience phone activated\n"
									+"audience phone results are available \n"
									+"select the option");
							System.out.println("1] Spain -->20%\n"
									+"2] Brazil -->30%\n"
									+"3] Argentina -->40%\n"
									+"4] India  -->10%");


							System.out.println("");
							option = scan.nextInt();

							if(option!=3) {
								System.out.println("Wrong answer");
								System.out.println("Correct answer is : option 3");
								System.out.println("rewards won : "+0);
								System.out.println("Total rewards won : " + reward);
								System.exit(0);
							}
							else if(option == 3) {
								System.out.println("Correct answer");
								reward=reward1;
								System.out.println("Total rewards won : " + reward);
								System.out.println("-------------------------------");


								System.out.println("Press 1 to continue\n"
										+"press 0 to quit");
								int next = scan.nextInt();

								if(next==0) {
									System.out.println("Your crorepathi contest is ended, By your choice");
									System.out.println("Total rewards won : " + reward1);
									System.out.println("Congratulations! "+name);
									System.exit(0);
								}
								else {
									question2();
								}

							}
							else {
								System.out.println("Invalied option choosen");
							}

						}

						else {                                                                                                                             // audience phone is not available  
							System.out.println("You already used this life line\n"
									+" You have only fifty_fifty life line. Do you wish to use it (y/n)");
							String select = scan.next();
							if(select.equalsIgnoreCase("y")) {                                                                                 //fifty_fifty chosen 
								fifty_fifty--;
								life_line--;
								System.out.println("Your fifty_fifty life line is activated\n"
										+" choose the option you want to lock\n"
										+ "1] Spain"
										+ "3] Argentina");
								option = scan.nextInt();
								if(option!=3) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 3");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + reward);
									System.exit(0);
								}
								else {
									System.out.println("Correct answer");
									reward=reward1;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward1);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question2();
									}

								}
							} 

							else {                                                                                                                         // fifty_fifty not chosen
								System.out.println("select an option \n"
										+"1] Spain\n"
										+"2] Brazil\n"
										+"3] Argentina\n"
										+"4] India\n");
								if(option!=3) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 3");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + reward);
									System.exit(0);
								}
								else {
									System.out.println("Correct answer");
									reward=reward1;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward1);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question2();
									}
								}

							}

						}
					}

					else {                                                                                                          //(sel == 2)  fifty_fifty chosen
						if(fifty_fifty == 1) {                                                                                 //if fifty_fifty available   
							fifty_fifty--;
							life_line--;

							System.out.println("Your fifty_fifty life line is activated\n"
									+" choose the option you want to lock\n"
									+ "1] Spain"
									+ "3] Argentina");
							option = scan.nextInt();
							if(option!=3) {
								System.out.println("Wrong answer");
								System.out.println("Correct answer is : option 3");
								System.out.println("rewards won : "+0);
								System.out.println("Total rewards won : " + reward);
								System.exit(0);
							}
							else {
								System.out.println("Correct answer");
								reward=reward1;
								System.out.println("Total rewards won : " + reward);
								System.out.println("-------------------------------");


								System.out.println("Press 1 to continue\n"
										+"press 0 to quit");
								int next = scan.nextInt();

								if(next==0) {
									System.out.println("Your crorepathi contest is ended, By your choice");
									System.out.println("Total rewards won : " + reward1);
									System.out.println("Congratulations! "+name);
									System.exit(0);
								}
								else {
									question2();
								}

							}

						}

						else {                                                                                                                   // fifty_fifty not available 
							System.out.println("You have already used fifty_fifty life line\n"
									+"You have only audience phone. Do you want to use it (y/n)");
							String select1 = scan.next();
							if(select1.equalsIgnoreCase("y")) {                                                                //audience phone chosen                  
								audience_phone--;
								life_line--;
								System.out.println("Audience phone activated\n"
										+"audience phone results are available \n"
										+"select the option");
								System.out.println("1] Spain -->20%\n"
										+"2] Brazil -->30%\n"
										+"3] Argentina -->40%\n"
										+"4] India  -->10%");


								System.out.println("");
								option = scan.nextInt();

								if(option!=3) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 3");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + reward);
									System.exit(0);
								}
								else if(option == 3) {
									System.out.println("Correct answer");
									reward=reward1;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward1);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question2();
									}

								}
								else {
									System.out.println("Invalied option choosen");
								}

							}
							else {                                                                                                        //audience phone not chosen
								System.out.println("select an option \n"
										+"1] Spain\n"
										+"2] Brazil\n"
										+"3] Argentina\n"
										+"4] India\n");
								option = scan.nextInt();
								if(option!=3) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 3");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + reward);
									System.exit(0);
								}
								else {
									System.out.println("Correct answer");
									reward=reward1;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward1);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question2();
									}
								}                                                                                 
							}

						}
					}
				}
				else {
					System.out.println("You have already used both hthe life lines.\n"
							+"select an option \n"
							+"1] Spain\n"
							+"2] Brazil\n"
							+"3] Argentina\n"
							+"4] India\n");
					option = scan.nextInt();
					if(option!=3) {
						System.out.println("Wrong answer");
						System.out.println("Correct answer is : option 3");
						System.out.println("rewards won : "+0);
						System.out.println("Total rewards won : " + reward);
						System.exit(0);
					}
					else {
						System.out.println("Correct answer");
						reward=reward1;
						System.out.println("Total rewards won : " + reward);
						System.out.println("-------------------------------");


						System.out.println("Press 1 to continue\n"
								+"press 0 to quit");
						int next = scan.nextInt();

						if(next==0) {
							System.out.println("Your crorepathi contest is ended, By your choice");
							System.out.println("Total rewards won : " + reward1);
							System.out.println("Congratulations! "+name);
							System.exit(0);
						}
						else {
							question2();
						}
					}
				}
			}



			else if(option!=3) {
				System.out.println("Wrong answer");
				System.out.println("Correct answer is : option 3");
				System.out.println("rewards won : "+0);
				System.out.println("Total rewards won : " + reward);
			}

			else {
				System.out.println("Correct answer");
				reward=reward1;
				System.out.println("Total rewards won : " + reward);
				System.out.println("-------------------------------");


				System.out.println("Press 1 to continue\n"
						+"press 0 to quit");
				int next = scan.nextInt();
				if(next==0) {
					System.out.println("Your crorepathi contest is ended, By your choice");
					System.out.println("Total rewards won : " + reward1);
					System.out.println("Congratulations! "+name);
				}
				else{
					question2();
				}

			}
		}
	}


	//==========================================================================
	//==========================================================================





	public static void question2() {
		System.out.println();
		System.out.println("=============================");
		System.out.println();
		System.out.println("Question two");
		System.out.println("Reward - 50,000");
		int reward2 = 50000;

		System.out.println();
		System.out.println("Which planet is known as the “Red Planet”? \n"
				+"1] Jupiter\n"
				+"2] Mars\n"
				+"3] sun\n"
				+"4] venus\n"
				+"5] life_line\n"
				+"-------------------------------\n"
				+"Which option you want to lock");
		option = scan.nextInt();

		if(option==1 || option==2 || option==3  || option==4 || option==5) {
			if(option==5) {                                                                                       //life_line chosen 
				if(life_line!=0) {                                                                                                  //if life_line available 


					System.out.println("You have two life lines\n"
							+"1] Audience phone\n"
							+"2] Fifty_fifty\n"
							+"select the life line you want");
					int sel = scan.nextInt();
					if(sel==1) {                                                                                                             //audience phone selected  
						if(audience_phone == 1) {                                                                                             //if audience phone available   
							audience_phone--;
							life_line--;
							System.out.println("Audience phone activated\n"
									+"audience phone results are available \n"
									+"select the option");
							System.out.println("1] Jupiter -->20%\n"
									+"2] Mars -->40%\n"
									+"3] Sun -->30%\n"
									+"4] Venus  -->10%");


							System.out.println("");
							option = scan.nextInt();

							if(option!=2) {
								System.out.println("Wrong answer");
								System.out.println("Correct answer is : option 2");
								System.out.println("rewards won : "+0);
								System.out.println("Total rewards won : " + reward);
								System.exit(0);
							}
							else if(option == 2) {
								System.out.println("Correct answer");
								reward=reward2;
								System.out.println("Total rewards won : " + reward);
								System.out.println("-------------------------------");


								System.out.println("Press 1 to continue\n"
										+"press 0 to quit");
								int next = scan.nextInt();

								if(next==0) {
									System.out.println("Your crorepathi contest is ended, By your choice");
									System.out.println("Total rewards won : " + reward2);
									System.out.println("Congratulations! "+name);
									System.exit(0);
								}
								else {
									question3();
								}

							}
							else {
								System.out.println("Invalied option choosen");
							}

						}

						else {                                                                                                                             // audience phone is not available  
							System.out.println("You already used this life line\n"
									+" You have only fifty_fifty life line. Do you wish to use it (y/n)");
							String select = scan.next();
							if(select.equalsIgnoreCase("y")) {                                                                                 //fifty_fifty chosen 
								fifty_fifty--;
								life_line--;
								System.out.println("Your fifty_fifty life line is activated\n"
										+" choose the option you want to lock\n"
										+ "1] Jupiter"
										+ "2] Mars");
								option = scan.nextInt();
								if(option!=2) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 2");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + reward);
									System.exit(0);
								}
								else {
									System.out.println("Correct answer");
									reward=reward2;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward2);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question3();
									}

								}
							} 

							else {                                                                                                                         // fifty_fifty not chosen
								System.out.println("select an option \n"
										+"1] Spain\n"
										+"2] Brazil\n"
										+"3] Argentina\n"
										+"4] India\n");
								if(option!=3) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 2");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + reward);
									System.exit(0);
								}
								else {
									System.out.println("Correct answer");
									reward=reward2;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward2);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question3();
									}
								}

							}

						}
					}

					else {                                                                                                          //(sel == 2)  fifty_fifty chosen
						if(fifty_fifty == 1) {                                                                                 //if fifty_fifty available   
							fifty_fifty--;
							life_line--;

							System.out.println("Your fifty_fifty life line is activated\n"
									+" choose the option you want to lock\n"
									+ "1] Jupiter"
									+ "2] Mars");
							option = scan.nextInt();
							if(option!=2) {
								System.out.println("Wrong answer");
								System.out.println("Correct answer is : option 2");
								System.out.println("rewards won : "+0);
								System.out.println("Total rewards won : " + reward);
								System.exit(0);
							}
							else {
								System.out.println("Correct answer");
								reward=reward2;
								System.out.println("Total rewards won : " + reward);
								System.out.println("-------------------------------");


								System.out.println("Press 1 to continue\n"
										+"press 0 to quit");
								int next = scan.nextInt();

								if(next==0) {
									System.out.println("Your crorepathi contest is ended, By your choice");
									System.out.println("Total rewards won : " + reward2);
									System.out.println("Congratulations! "+name);
									System.exit(0);
								}
								else {
									question3();
								}

							}

						}

						else {                                                                                                                   // fifty_fifty not available 
							System.out.println("You have already used fifty_fifty life line\n"
									+"You have only audience phone. Do you want to use it (y/n)");
							String select1 = scan.next();
							if(select1.equalsIgnoreCase("y")) {                                                                //audience phone chosen                  
								audience_phone--;
								life_line--;
								System.out.println("Audience phone activated\n"
										+"audience phone results are available \n"
										+"select the option");
								System.out.println("1] Jupiter -->20%\n"
										+"2] Mars -->40%\n"
										+"3] Sun -->30%\n"
										+"4] Venus  -->10%");


								System.out.println("");
								option = scan.nextInt();

								if(option!=2) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 2");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + reward);
									System.exit(0);
								}
								else if(option == 2) {
									System.out.println("Correct answer");
									reward=reward2;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward2);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question3();
									}

								}
								else {
									System.out.println("Invalied option choosen");
								}

							}
							else {                                                                                                        //audience phone not chosen
								System.out.println("select an option \n"
										+"1] Jupiter\n"
										+"2] Mars\n"
										+"3] Sun\n"
										+"4] Venus");
								option = scan.nextInt();
								if(option!=2) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 2");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + reward);
									System.exit(0);
								}
								else {
									System.out.println("Correct answer");
									reward=reward2;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward2);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question3();
									}
								}                                                                                 
							}

						}
					}
				}
				else {
					System.out.println("You have already used both hthe life lines.");
					System.out.println("select an option \n"
							+"1] Jupiter\n"
							+"2] Mars\n"
							+"3] Sun\n"
							+"4] Venus");
					option = scan.nextInt();
					if(option!=2) {
						System.out.println("Wrong answer");
						System.out.println("Correct answer is : option 2");
						System.out.println("rewards won : "+0);
						System.out.println("Total rewards won : " + reward);
						System.exit(0);
					}
					else {
						System.out.println("Correct answer");
						reward=reward2;
						System.out.println("Total rewards won : " + reward);
						System.out.println("-------------------------------");


						System.out.println("Press 1 to continue\n"
								+"press 0 to quit");
						int next = scan.nextInt();

						if(next==0) {
							System.out.println("Your crorepathi contest is ended, By your choice");
							System.out.println("Total rewards won : " + reward2);
							System.out.println("Congratulations! "+name);
							System.exit(0);
						}
						else {
							question3();
						}
					}
				}
			}


			else if(option!=2) {                                                                                                               //add else if
				System.out.println("Wrong answer");
				System.out.println("Correct answer is : option 2");
				System.out.println("rewards won : "+0);
				System.out.println("Total rewards won : " + 0);
				System.out.println("Congratulations! "+name);

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
					System.out.println("Congratulations! "+name);

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

	//==========================================================================
	//==========================================================================




	private static void question3() {
		System.out.println();
		System.out.println("=============================");
		System.out.println();
		System.out.println("Question three");
		System.out.println("Reward - 1,00,000");
		int reward3 = 100000;

		System.out.println();
		System.out.println("Which river is often referred to as the “Mother of Rivers” and is the longest in the world?\n"
				+"1] Murray river\n"
				+"2] Ganges river\n"
				+"3] Mississippi river\n"
				+"4] Nile river\n"
				+"5] life line");
		System.out.println("-------------------------------");
		System.out.println("Which option you want to lock");
		option = scan.nextInt();

		if(option==1 || option==2 || option==3  || option==4 || option==5) {
			if(option ==5) {
				if(life_line!=0) {                                                                                                  //if life_line available 


					System.out.println("You have two life lines\n"
							+"1] Audience phone\n"
							+"2] Fifty_fifty\n"
							+"select the life line you want");
					int sel = scan.nextInt();
					if(sel==1) {                                                                                                             //audience phone selected  
						if(audience_phone == 1) {                                                                                             //if audience phone available   
							audience_phone--;
							life_line--;
							System.out.println("Audience phone activated\n"
									+"audience phone results are available \n"
									+"select the option");
							System.out.println("1] Murray river ---->20%\n"
									+"2] Ganges river ---->20%\n"
									+"3] Mississippi river---->25%\n"
									+"4] Nile river----->35%");


							System.out.println("");
							option = scan.nextInt();

							if(option!=4) {
								System.out.println("Wrong answer");
								System.out.println("Correct answer is : option 4");
								System.out.println("rewards won : "+0);
								System.out.println("Total rewards won : " + reward);
								System.exit(0);
							}
							else if(option == 4) {
								System.out.println("Correct answer");
								reward=reward3;
								System.out.println("Total rewards won : " + reward);
								System.out.println("-------------------------------");


								System.out.println("Press 1 to continue\n"
										+"press 0 to quit");
								int next = scan.nextInt();

								if(next==0) {
									System.out.println("Your crorepathi contest is ended, By your choice");
									System.out.println("Total rewards won : " + reward3);
									System.out.println("Congratulations! "+name);
									System.exit(0);
								}
								else {
									question4();
								}

							}
							else {
								System.out.println("Invalied option choosen");
							}

						}

						else {                                                                                                                             // audience phone is not available  
							System.out.println("You already used this life line\n"
									+" You have only fifty_fifty life line. Do you wish to use it (y/n)");
							String select = scan.next();
							if(select.equalsIgnoreCase("y")) {                                                                                 //fifty_fifty chosen 
								fifty_fifty--;
								life_line--;
								System.out.println("Your fifty_fifty life line is activated\n"
										+" choose the option you want to lock\n"
										+"1] Murray river\n"
										+"4] Nile river");
								option = scan.nextInt();
								if(option!=4) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 4");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + reward);
									System.exit(0);
								}
								else {
									System.out.println("Correct answer");
									reward=reward3;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward3);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question4();
									}

								}
							} 

							else {                                                                                                                         // fifty_fifty not chosen
								System.out.println("select an option \n"
										+"1] Murray river\n"
										+"2] Ganges river\n"
										+"3] Mississippi river\n"
										+"4] Nile river");
								option = scan.nextInt();
								if(option!=4) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 4");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + reward);
									System.exit(0);
								}
								else {
									System.out.println("Correct answer");
									reward=reward3;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward3);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question4();
									}
								}

							}

						}
					}

					else {                                                                                                          //(sel == 2)  fifty_fifty chosen
						if(fifty_fifty == 1) {                                                                                 //if fifty_fifty available   
							fifty_fifty--;
							life_line--;

							System.out.println("Your fifty_fifty life line is activated\n"
									+" choose the option you want to lock\n"
									+"1] Murray river\n"
									+"4] Nile river");
							option = scan.nextInt();
							if(option!=4) {
								System.out.println("Wrong answer");
								System.out.println("Correct answer is : option 4");
								System.out.println("rewards won : "+0);
								System.out.println("Total rewards won : " + reward);
								System.exit(0);
							}
							else {
								System.out.println("Correct answer");
								reward=reward3;
								System.out.println("Total rewards won : " + reward);
								System.out.println("-------------------------------");


								System.out.println("Press 1 to continue\n"
										+"press 0 to quit");
								int next = scan.nextInt();

								if(next==0) {
									System.out.println("Your crorepathi contest is ended, By your choice");
									System.out.println("Total rewards won : " + reward3);
									System.out.println("Congratulations! "+name);
									System.exit(0);
								}
								else {
									question4();
								}

							}

						}

						else {                                                                                                                   // fifty_fifty not available 
							System.out.println("You have already used fifty_fifty life line\n"
									+"You have only audience phone. Do you want to use it (y/n)");
							String select1 = scan.next();
							if(select1.equalsIgnoreCase("y")) {                                                                //audience phone chosen                  
								audience_phone--;
								life_line--;
								System.out.println("Audience phone activated\n"
										+"audience phone results are available \n"
										+"select the option");
								System.out.println(	"1] Murray river\n"
										+"2] Ganges river\n"
										+"3] Mississippi river\n"
										+"4] Nile river\n");


								System.out.println("");
								option = scan.nextInt();

								if(option!=4) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 4");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + reward);
									System.exit(0);
								}
								else if(option == 4) {
									System.out.println("Correct answer");
									reward=reward3;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward3);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question4();
									}

								}
								else {
									System.out.println("Invalied option choosen");
								}

							}
							else {                                                                                                        //audience phone not chosen
								System.out.println("select an option \n"
										+"1] Murray river\n"
										+"2] Ganges river\n"
										+"3] Mississippi river\n"
										+"4] Nile river");
								if(option!=4) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 4");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + reward);
									System.exit(0);
								}
								else {
									System.out.println("Correct answer");
									reward=reward3;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward3);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question4();
									}
								}                                                                                 
							}

						}
					}
				}
				else {
					System.out.println("You have already used both hthe life lines.");
					System.out.println("select an option \n"
							+"1] Murray river\n"
							+"2] Ganges river\n"
							+"3] Mississippi river\n"
							+"4] Nile river");
					option = scan.nextInt();
					if(option!=4) {
						System.out.println("Wrong answer");
						System.out.println("Correct answer is : option 4");
						System.out.println("rewards won : "+0);
						System.out.println("Total rewards won : " + reward);
						System.exit(0);
					}
					else {
						System.out.println("Correct answer");
						reward=reward3;
						System.out.println("Total rewards won : " + reward);
						System.out.println("-------------------------------");


						System.out.println("Press 1 to continue\n"
								+"press 0 to quit");
						int next = scan.nextInt();

						if(next==0) {
							System.out.println("Your crorepathi contest is ended, By your choice");
							System.out.println("Total rewards won : " + reward3);
							System.out.println("Congratulations! "+name);
							System.exit(0);
						}
						else {
							question4();
						}
					}
				}
			}


			else if(option!=4) {                                                                                                        //add else if
				System.out.println("Wrong answer");
				System.out.println("Correct answer is : option 4");
				System.out.println("rewards won : "+0);
				System.out.println("Total rewards won : " + 0);
				System.out.println("Congratulations! "+name);

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
					System.out.println("Congratulations! "+name);

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

	//==========================================================================
	//==========================================================================




	private static void question4() {

		System.out.println();
		System.out.println("=============================");
		System.out.println();
		System.out.println("Question four");
		System.out.println("Reward - 5,00,000");
		int reward4 = 500000;
		safeReward = reward4;

		System.out.println();
		System.out.println("In which country did the Renaissance artist Leonardo da Vinci live?\n"
				+"1] Croatia\n"
				+"2] Italy\n"
				+"3] China\n"
				+"4] North America\n"
				+"5] life line");
		System.out.println("-------------------------------");
		System.out.println("Which option you want to lock");
		option = scan.nextInt();

		if(option==1 || option==2 || option==3  || option==4 || option==5) {
			if(option==5) {

				if(life_line!=0) {                                                                                                  //if life_line available 
					System.out.println("You have two life lines\n"
							+"1] Audience phone\n"
							+"2] Fifty_fifty\n"
							+"select the life line you want");
					int sel = scan.nextInt();
					if(sel==1) {                                                                                                             //audience phone selected  
						if(audience_phone == 1) {                                                                                             //if audience phone available   
							audience_phone--;
							life_line--;
							System.out.println("Audience phone activated\n"
									+"audience phone results are available \n"
									+"select the option");
							System.out.println("1] Croatia\n"
									+"2] Italy\n"
									+"3] China\n"
									+"4] North America");


							System.out.println("");
							option = scan.nextInt();

							if(option!=2) {
								System.out.println("Wrong answer");
								System.out.println("Correct answer is : option 2");
								System.out.println("rewards won : "+0);
								System.out.println("Total rewards won : " + reward);
								System.exit(0);
							}
							else if(option == 2) {
								System.out.println("Correct answer");
								reward=reward4;
								System.out.println("Total rewards won : " + reward);
								System.out.println("-------------------------------");


								System.out.println("Press 1 to continue\n"
										+"press 0 to quit");
								int next = scan.nextInt();

								if(next==0) {
									System.out.println("Your crorepathi contest is ended, By your choice");
									System.out.println("Total rewards won : " + reward4);
									System.out.println("Congratulations! "+name);
									System.exit(0);
								}
								else {
									question5();
								}

							}
							else {
								System.out.println("Invalied option choosen");
							}

						}

						else {                                                                                                                             // audience phone is not available  
							System.out.println("You already used this life line\n"
									+" You have only fifty_fifty life line. Do you wish to use it (y/n)");
							String select = scan.next();
							if(select.equalsIgnoreCase("y")) {                                                                                 //fifty_fifty chosen 
								fifty_fifty--;
								life_line--;
								System.out.println("Your fifty_fifty life line is activated\n"
										+" choose the option you want to lock\n"
										+"1] Croatia\n"
										+"2] Italy");
								option = scan.nextInt();
								if(option!=2) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 2");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + reward);
									System.exit(0);
								}
								else {
									System.out.println("Correct answer");
									reward=reward4;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward4);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question5();
									}

								}
							} 

							else {                                                                                                                         // fifty_fifty not chosen
								System.out.println("select an option \n"
										+"1] Croatia\n"
										+"2] Italy\n"
										+"3] China\n"
										+"4] North America\n");
								option = scan.nextInt();
								if(option!=2) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 2");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + reward);
									System.exit(0);
								}
								else {
									System.out.println("Correct answer");
									reward=reward4;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward4);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question5();
									}
								}

							}

						}
					}

					else {                                                                                                          //(sel == 2)  fifty_fifty chosen
						if(fifty_fifty == 1) {                                                                                 //if fifty_fifty available   
							fifty_fifty--;
							life_line--;

							System.out.println("Your fifty_fifty life line is activated\n"
									+" choose the option you want to lock\n"
									+"1] Croatia\n"
									+"2] Italy");
							option = scan.nextInt();
							if(option!=2) {
								System.out.println("Wrong answer");
								System.out.println("Correct answer is : option 2");
								System.out.println("rewards won : "+0);
								System.out.println("Total rewards won : " + reward);
								System.exit(0);
							}
							else {
								System.out.println("Correct answer");
								reward=reward4;
								System.out.println("Total rewards won : " + reward);
								System.out.println("-------------------------------");


								System.out.println("Press 1 to continue\n"
										+"press 0 to quit");
								int next = scan.nextInt();

								if(next==0) {
									System.out.println("Your crorepathi contest is ended, By your choice");
									System.out.println("Total rewards won : " + reward4);
									System.out.println("Congratulations! "+name);
									System.exit(0);
								}
								else {
									question5();
								}

							}

						}

						else {                                                                                                                   // fifty_fifty not available 
							System.out.println("You have already used fifty_fifty life line\n"
									+"You have only audience phone. Do you want to use it (y/n)");
							String select1 = scan.next();
							if(select1.equalsIgnoreCase("y")) {                                                                //audience phone chosen                  
								audience_phone--;
								life_line--;
								System.out.println("Audience phone activated\n"
										+"audience phone results are available \n"
										+"select the option");
								System.out.println(	"1] Croatia\n"
										+"2] Italy\n"
										+"3] China\n"
										+"4] North America");


								System.out.println("");
								option = scan.nextInt();

								if(option!=2) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 2");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + reward);
									System.exit(0);
								}
								else if(option == 2) {
									System.out.println("Correct answer");
									reward=reward4;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward4);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question5();
									}

								}
								else {
									System.out.println("Invalied option choosen");
								}

							}
							else {                                                                                                        //audience phone not chosen
								System.out.println("select an option \n"
										+"1] Croatia\n"
										+"2] Italy\n"
										+"3] China\n"
										+"4] North America\n");
								if(option!=2) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 2");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + reward);
									System.exit(0);
								}
								else {
									System.out.println("Correct answer");
									reward=reward4;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward4);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question5();
									}
								}                                                                                 
							}

						}
					}
				}
				else {
					System.out.println("You have already used both hthe life lines.");
					System.out.println("select an option \n"
							+"1] Croatia\n"
							+"2] Italy\n"
							+"3] China\n"
							+"4] North America\n");
					option = scan.nextInt();
					if(option!=2) {
						System.out.println("Wrong answer");
						System.out.println("Correct answer is : option 2");
						System.out.println("rewards won : "+0);
						System.out.println("Total rewards won : " + reward);
						System.exit(0);
					}
					else {
						System.out.println("Correct answer");
						reward=reward4;
						System.out.println("Total rewards won : " + reward);
						System.out.println("-------------------------------");


						System.out.println("Press 1 to continue\n"
								+"press 0 to quit");
						int next = scan.nextInt();

						if(next==0) {
							System.out.println("Your crorepathi contest is ended, By your choice");
							System.out.println("Total rewards won : " + reward4);
							System.out.println("Congratulations! "+name);
							System.exit(0);
						}
						else {
							question5();
						}
					}
				}

			}
			else if(option!=2) {                                                                                                                                         //add else if
				System.out.println("Wrong answer");
				System.out.println("Correct answer is : option 2");
				System.out.println("rewards won : "+0);
				System.out.println("Total rewards won : " + 0);
				System.out.println("Congratulations! "+name);

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
					System.out.println("Congratulations! "+name);

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

	//==========================================================================
	//==========================================================================




	private static void question5() {

		System.out.println();
		System.out.println("=============================");
		System.out.println();
		System.out.println("Question five");
		System.out.println("Reward - 10,00,000");
		int reward5 = 1000000;


		System.out.println();
		System.out.println("What does the acronym “PDF” stand for?\n"
				+"1] Portable Document Format.\n"
				+"2] Pseudo-Dynamic Framework\n"
				+"3] Portable Document Framework\n"
				+"4] Portable-Dynamic-Format\n"
				+"5] life line");
		System.out.println("-------------------------------");
		System.out.println("Which option you want to lock");
		option = scan.nextInt();

		if(option==1 || option==2 || option==3  || option==4 || option==5) {
			if(option==5) {

				if(life_line!=0) {                                                                                                  //if life_line available 


					System.out.println("You have two life lines\n"
							+"1] Audience phone\n"
							+"2] Fifty_fifty\n"
							+"select the life line you want");
					int sel = scan.nextInt();
					if(sel==1) {                                                                                                             //audience phone selected  
						if(audience_phone == 1) {                                                                                             //if audience phone available   
							audience_phone--;
							life_line--;
							System.out.println("Audience phone activated\n"
									+"audience phone results are available \n"
									+"select the option");
							System.out.println("1] Portable Document Format.\n"
									+"2] Pseudo-Dynamic Framework\n"
									+"3] Portable Document Framework\n"
									+"4] Portable-Dynamic-Format");


							System.out.println("");
							option = scan.nextInt();

							if(option!=1) {
								System.out.println("Wrong answer");
								System.out.println("Correct answer is : option 1");
								System.out.println("rewards won : "+0);
								System.out.println("Total rewards won : " + safeReward);
								System.exit(0);
							}
							else if(option == 1) {
								System.out.println("Correct answer");
								reward=reward5;
								System.out.println("Total rewards won : " + reward);
								System.out.println("-------------------------------");


								System.out.println("Press 1 to continue\n"
										+"press 0 to quit");
								int next = scan.nextInt();

								if(next==0) {
									System.out.println("Your crorepathi contest is ended, By your choice");
									System.out.println("Total rewards won : " + reward5);
									System.out.println("Congratulations! "+name);
									System.exit(0);
								}
								else {
									question6();
								}

							}
							else {
								System.out.println("Invalied option choosen");
							}

						}

						else {                                                                                                                             // audience phone is not available  
							System.out.println("You already used this life line\n"
									+" You have only fifty_fifty life line. Do you wish to use it (y/n)");
							String select = scan.next();
							if(select.equalsIgnoreCase("y")) {                                                                                 //fifty_fifty chosen 
								fifty_fifty--;
								life_line--;
								System.out.println("Your fifty_fifty life line is activated\n"
										+" choose the option you want to lock\n"
										+"1] Portable Document Format.\n"
										+"2] Pseudo-Dynamic Framework");
								option = scan.nextInt();
								if(option!=1) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 1");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + safeReward);
									System.exit(0);
								}
								else {
									System.out.println("Correct answer");
									reward=reward5;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward5);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question6();
									}

								}
							} 

							else {                                                                                                                         // fifty_fifty not chosen
								System.out.println("select an option \n"
										+"1] Portable Document Format.\n"
										+"2] Pseudo-Dynamic Framework\n"
										+"3] Portable Document Framework\n"
										+"4] Portable-Dynamic-Format");
								option = scan.nextInt();
								if(option!=1) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 1");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + safeReward);
									System.exit(0);
								}
								else {
									System.out.println("Correct answer");
									reward=reward5;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward5);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question6();
									}
								}

							}

						}
					}

					else {                                                                                                          //(sel == 2)  fifty_fifty chosen
						if(fifty_fifty == 1) {                                                                                 //if fifty_fifty available   
							fifty_fifty--;
							life_line--;

							System.out.println("Your fifty_fifty life line is activated\n"
									+" choose the option you want to lock\n"
									+"1] Portable Document Format.\n"
									+"2] Pseudo-Dynamic Framework");
							option = scan.nextInt();
							if(option!=1) {
								System.out.println("Wrong answer");
								System.out.println("Correct answer is : option 1");
								System.out.println("rewards won : "+0);
								System.out.println("Total rewards won : " + safeReward);
								System.exit(0);
							}
							else {
								System.out.println("Correct answer");
								reward=reward5;
								System.out.println("Total rewards won : " + reward);
								System.out.println("-------------------------------");


								System.out.println("Press 1 to continue\n"
										+"press 0 to quit");
								int next = scan.nextInt();

								if(next==0) {
									System.out.println("Your crorepathi contest is ended, By your choice");
									System.out.println("Total rewards won : " + reward5);
									System.out.println("Congratulations! "+name);
									System.exit(0);
								}
								else {
									question6();
								}

							}

						}

						else {                                                                                                                   // fifty_fifty not available 
							System.out.println("You have already used fifty_fifty life line\n"
									+"You have only audience phone. Do you want to use it (y/n)");
							String select1 = scan.next();
							if(select1.equalsIgnoreCase("y")) {                                                                //audience phone chosen                  
								audience_phone--;
								life_line--;
								System.out.println("Audience phone activated\n"
										+"audience phone results are available \n"
										+"select the option");
								System.out.println("1] Portable Document Format.\n"
										+"2] Pseudo-Dynamic Framework\n"
										+"3] Portable Document Framework\n"
										+"4] Portable-Dynamic-Format");


								System.out.println("");
								option = scan.nextInt();

								if(option!=1) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 1");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + safeReward);
									System.exit(0);
								}
								else if(option == 1) {
									System.out.println("Correct answer");
									reward=reward5;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward5);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question6();
									}

								}
								else {
									System.out.println("Invalied option choosen");
								}

							}
							else {                                                                                                        //audience phone not chosen
								System.out.println("select an option \n"
										+"1] Portable Document Format.\n"
										+"2] Pseudo-Dynamic Framework\n"
										+"3] Portable Document Framework\n"
										+"4] Portable-Dynamic-Format");
								if(option!=1) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 1");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + safeReward);
									System.exit(0);
								}
								else {
									System.out.println("Correct answer");
									reward=reward5;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By