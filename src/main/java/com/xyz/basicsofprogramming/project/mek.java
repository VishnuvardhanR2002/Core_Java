package com.xyz.basicsofprogramming.project;

import java.util.Scanner;

public class mek {
	static Scanner scan = new Scanner(System.in);
	static int safeReward; 
	static String name;
	static int option;
	static int reward=0; 
	static int life_line = 2;
	static int fifty_fifty = 1;
	static int audience_phone = 1;

	public static void main(String[] args) {
		System.out.println("Meelo Evaru Koteehwarulu");
		System.out.println("=============================");
		System.out.println();
		System.out.println("Entre your name :");
		name = scan.nextLine();
		System.out.println();
		System.out.println("Welcome "+name+" to mek quiz game");
		System.out.println();
		

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
		System.out.println("which is the pink city of india ");
		System.out.println("1] chennai");
		System.out.println("2] Bangalore");
		System.out.println("3] Jaipur");
		System.out.println("4] Mumbai");
		System.out.println("5] lifeline");
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
							System.out.println("1] Chennai -->20%\n"
									+"2] Bangalore -->30%\n"
									+"3] Jaipur -->40%\n"
									+"4] Mumbai  -->10%");


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
										+"1] Chennai\n"
										+"2] Bangalore\n"
										+"3] Jaipur\n"
										+"4] Mumbai\n");
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
									+ "1] Chennai"
									+ "3] Jaipur");
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
								System.out.println("1] Chennai -->20%\n"
										+"2] Bangalore -->30%\n"
										+"3] Jaipur -->40%\n"
										+"4] Mumbai  -->10%");


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
										+"1] Chennai\n"
										+"2] Bangalore\n"
										+"3] Jaipur\n"
										+"4] Mumbai\n");
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
							+"1] Chennai\n"
							+"2] Bangalore\n"
							+"3] Jaipur\n"
							+"4] Mumbai\n");
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
		System.out.println("which city is known as sun city of india”? \n"
				+"1] Jaipur\n"
				+"2] jodhpur\n"
				+"3] Mumbai\n"
				+"4] Bangalore\n"
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
							System.out.println("1] Jaipur -->20%\n"
									+"2] jodhpur -->40%\n"
									+"3] mumbai -->30%\n"
									+"4] Bangalore  -->10%");


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
										+ "1] Jaipur"
										+ "2] jodhpur");
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
										+"1] Jaipur\n"
										+"2] jodhpur\n"
										+"3] Mumbai\n"
										+"4] Bangalore\n");
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
									+ "1] Jaipur"
									+ "2] jodhpur");
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
								System.out.println("1] Jaipur -->20%\n"
										+"2] Jodhpur -->40%\n"
										+"3] Mumbai -->30%\n"
										+"4] Bangalore  -->10%");


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
										+"1] Jaipur\n"
										+"2] jodhpur\n"
										+"3] Mumbai\n"
										+"4] Bangalore\n");
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
							+"1] Jaipur\n"
							+"2] jodhpur\n"
							+"3] Mumbai\n"
							+"4] Bangalore\n");
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
		System.out.println("Which city is known as city of lakes?\n"
				+"1] Bangalore\n"
				+"2] Mumbai\n"
				+"3] Chennai\n"
				+"4] Udaipur\n"
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
							System.out.println("1] Bangalore ---->20%\n"
									+"2] Mumbai ---->20%\n"
									+"3] Chennai---->25%\n"
									+"4] Udaipur----->35%");


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
										+"1] Bangalore\n"
										+"4] Udaipur");
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
										+"1] Bangalore\n"
										+"2] Mumbai\n"
										+"3] Chennai\n"
										+"4] Udaipur\n");
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
									+"1] Bangalore\n"
									+"4] Udaipur");
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
								System.out.println(	"1] Bangalore ---->20%\n"
										+"2] Mumbai ---->20%\n"
										+"3] Chennai---->25%\n"
										+"4] Udaipur----->35%");


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
										+"1] Bangalore\n"
										+"2] Mumbai\n"
										+"3] Chennai\n"
										+"4] Udaipur\n");
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
							+"1] Bangalore\n"
							+"2] Mumbai\n"
							+"3] Chennai\n"
							+"4] Udaipur\n");
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
		System.out.println("which city is known as manchester of india?\n"
				+"1] Chennai\n"
				+"2] Ahmedabad\n"
				+"3] Bangalore\n"
				+"4] vizag\n"
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
							System.out.println("1] Chennai----20%\n"
									+"2] Ahmedabad ------60%\n"
									+"3] Bangalore ------10%\n"
									+"4] vizag -----10%\n");


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
										+"1] Chennai\n"
										+"2] Ahmadabad");
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
										+"1] Chennai\n"
										+"2] Ahmedabad\n"
										+"3] Bangalore\n"
										+"4] vizag\n");
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
									+"1] Chennai\n"
									+"2] Ahmedabad");
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
								System.out.println(	"1] Chennai----20%\n"
										+"2] Ahmedabad ------60%\n"
										+"3] Bangalore ------10%\n"
										+"4] vizag -----10%\n");


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
										+"1] Chennai\n"
										+"2] Ahmedabad\n"
										+"3] Bangalore\n"
										+"4] vizag\n");
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
							+"1] Chennai\n"
							+"2] Ahmedabad\n"
							+"3] Bangalore\n"
							+"4] vizag\n");
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
		System.out.println("which city is known as steel city of india?\n"
				+"1] Jamshedpur.\n"
				+"2] Kolkata\n"
				+"3] Delhi\n"
				+"4] pune\n"
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
							System.out.println("1] Jamshedpur------60%.\n"
									+"2] Kolkata -----15%\n"
									+"3] Delhi ----15%\n"
									+"4] pune -----10%\n");


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
										+"1] Jamshedpur.\n"
										+"2] Kolkata");
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
										+"1] Jamshedpur.\n"
										+"2] Kolkata\n"
										+"3] Delhi\n"
										+"4] pune\n");
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
									+"1] Jamshedpur.\n"
									+"2] Kolkata");
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
								System.out.println("1] Jamshedpur------60%.\n"
										+"2] Kolkata -----15%\n"
										+"3] Delhi ----15%\n"
										+"4] pune -----10%\n");


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
										+"1] Jamshedpur.\n"
										+"2] Kolkata\n"
										+"3] Delhi\n"
										+"4] pune\n");
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
				}
				else {
					System.out.println("You have already used both hthe life lines.");
					System.out.println("select an option \n"
							+"1] Jamshedpur.\n"
							+"2] Kolkata\n"
							+"3] Delhi\n"
							+"4] pune\n");
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
			else if(option!=1) {                                                                                                                                     //add else if
				System.out.println("Wrong answer");
				System.out.println("Correct answer is : option 1");
				System.out.println("rewards won : "+0);
				System.out.println("Total rewards won : " + safeReward);

				System.out.println("Congratulations! "+name);

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
					System.out.println("Congratulations! "+name);

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

	//==========================================================================
	//==========================================================================




	private static void question6() {
		System.out.println();
		System.out.println("=============================");
		System.out.println();
		System.out.println("Question Six");
		System.out.println("Reward - 15,00,000");
		int reward6 = 1500000;

		System.out.println();
		System.out.println("which city is known as joy?\n"
				+"1] Delhi\n"
				+"2] Pune\n"
				+"3] Mumbai\n"
				+"4] Kolkata\n"
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
							System.out.println("1] Delhi------10%\n"
									+"2] Pune -----20%\n"
									+"3] Mumbai -----20%\n"
									+"4] Kolkata----50%\n");


							System.out.println("");
							option = scan.nextInt();

							if(option!=4) {
								System.out.println("Wrong answer");
								System.out.println("Correct answer is : option 4");
								System.out.println("rewards won : "+0);
								System.out.println("Total rewards won : " + safeReward);
								System.exit(0);
							}
							else if(option == 4) {
								System.out.println("Correct answer");
								reward=reward6;
								System.out.println("Total rewards won : " + reward);
								System.out.println("-------------------------------");


								System.out.println("Press 1 to continue\n"
										+"press 0 to quit");
								int next = scan.nextInt();

								if(next==0) {
									System.out.println("Your crorepathi contest is ended, By your choice");
									System.out.println("Total rewards won : " + reward6);
									System.out.println("Congratulations! "+name);
									System.exit(0);
								}
								else {
									question7();
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
										+"3] Mumbai\n"
										+"4] Kolkata");
								option = scan.nextInt();
								if(option!=4) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 4");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + safeReward);
									System.exit(0);
								}
								else {
									System.out.println("Correct answer");
									reward=reward6;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward6);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question7();
									}

								}
							} 

							else {                                                                                                                         // fifty_fifty not chosen
								System.out.println("select an option \n"
										+"1] Delhi\n"
										+"2] Pune\n"
										+"3] Mumbai\n"
										+"4] Kolkata\n");
								option = scan.nextInt();
								if(option!=4) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 4");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + safeReward);
									System.exit(0);
								}
								else {
									System.out.println("Correct answer");
									reward=reward6;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward6);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question7();
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
									+"3] Mumbi\n"
									+"4] Kolkata");
							option = scan.nextInt();
							if(option!=4) {
								System.out.println("Wrong answer");
								System.out.println("Correct answer is : option 4");
								System.out.println("rewards won : "+0);
								System.out.println("Total rewards won : " + safeReward);
								System.exit(0);
							}
							else {
								System.out.println("Correct answer");
								reward=reward6;
								System.out.println("Total rewards won : " + reward);
								System.out.println("-------------------------------");


								System.out.println("Press 1 to continue\n"
										+"press 0 to quit");
								int next = scan.nextInt();

								if(next==0) {
									System.out.println("Your crorepathi contest is ended, By your choice");
									System.out.println("Total rewards won : " + reward6);
									System.out.println("Congratulations! "+name);
									System.exit(0);
								}
								else {
									question7();
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
								System.out.println(	"1] Delhi------10%\n"
										+"2] Pune -----20%\n"
										+"3] Mumbai -----20%\n"
										+"4] Kolkata----50%\n");


								System.out.println("");
								option = scan.nextInt();

								if(option!=4) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 4");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + safeReward);
									System.exit(0);
								}
								else if(option == 4) {
									System.out.println("Correct answer");
									reward=reward6;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward6);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question7();
									}

								}
								else {
									System.out.println("Invalied option choosen");
								}

							}
							else {                                                                                                        //audience phone not chosen
								System.out.println("select an option \n"
										+"1] Delhi\n"
										+"2] Pune\n"
										+"3] Mumbai\n"
										+"4] Kolkata\n");
								if(option!=4) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 4");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + safeReward);
									System.exit(0);
								}
								else {
									System.out.println("Correct answer");
									reward=reward6;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward6);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question7();
									}
								}                                                                                 
							}

						}
					}
				}
				else {
					System.out.println("You have already used both hthe life lines.");
					System.out.println("select an option \n"
							+"1] Delhi\n"
							+"2] Pune\n"
							+"3] Mumbai\n"
							+"4] Kolkata\n");
					option = scan.nextInt();
					if(option!=4) {
						System.out.println("Wrong answer");
						System.out.println("Correct answer is : option 4");
						System.out.println("rewards won : "+0);
						System.out.println("Total rewards won : " + safeReward);
						System.exit(0);
					}
					else {
						System.out.println("Correct answer");
						reward=reward6;
						System.out.println("Total rewards won : " + reward);
						System.out.println("-------------------------------");


						System.out.println("Press 1 to continue\n"
								+"press 0 to quit");
						int next = scan.nextInt();

						if(next==0) {
							System.out.println("Your crorepathi contest is ended, By your choice");
							System.out.println("Total rewards won : " + reward6);
							System.out.println("Congratulations! "+name);
							System.exit(0);
						}
						else {
							question7();
						}
					}
				}

			}
			else if(option!=1) {                                                                                              //add else if
				System.out.println("Wrong answer");
				System.out.println("Correct answer is : option 1");
				System.out.println("rewards won : "+0);
				System.out.println("Total rewards won : " + safeReward);
				System.out.println("Congratulations! "+name);

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
					System.out.println("Congratulations! "+name);

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

	//==========================================================================
	//==========================================================================




	private static void question7() {
		System.out.println();
		System.out.println("=============================");
		System.out.println();
		System.out.println("Question Seven");
		System.out.println("Reward - 25,00,000");
		int reward7 = 2500000;

		System.out.println();
		System.out.println("which place is known as scotland of india\n"
				+"1] Coorg\n"
				+"2] Araku\n"
				+"3] Wayanad\n"
				+"4] Pune\n"
				+"5] life line" );
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
							System.out.println("1] Coorg------>15%\n"
									+"2] Araku---->30%\n"
									+"3] Wayanad----->40%\n"
									+"4] Pune--->15%");


							System.out.println("");
							option = scan.nextInt();

							if(option!=3) {
								System.out.println("Wrong answer");
								System.out.println("Correct answer is : option 3");
								System.out.println("rewards won : "+0);
								System.out.println("Total rewards won : " + safeReward);
								System.exit(0);
							}
							else if(option == 3) {
								System.out.println("Correct answer");
								reward=reward7;
								System.out.println("Total rewards won : " + reward);
								System.out.println("-------------------------------");


								System.out.println("Press 1 to continue\n"
										+"press 0 to quit");
								int next = scan.nextInt();

								if(next==0) {
									System.out.println("Your crorepathi contest is ended, By your choice");
									System.out.println("Total rewards won : " + reward7);
									System.out.println("Congratulations! "+name);
									System.exit(0);
								}
								else {
									question8();
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
										+"2] Araku\n"
										+"3] Wayanad");
								option = scan.nextInt();
								if(option!=3) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 3");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + safeReward);
									System.exit(0);
								}
								else {
									System.out.println("Correct answer");
									reward=reward7;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward7);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question8();
									}

								}
							} 

							else {                                                                                                                         // fifty_fifty not chosen
								System.out.println("select an option \n"
										+"1] Coorg\n"
										+"2] Araku\n"
										+"3] Wayanad\n"
										+"4] Pune\n");
								option = scan.nextInt();
								if(option!=3) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 3");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + safeReward);
									System.exit(0);
								}
								else {
									System.out.println("Correct answer");
									reward=reward7;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward7);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question8();
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
									+"2] Araku\n"
									+"3] Wayanad");
							option = scan.nextInt();
							if(option!=3) {
								System.out.println("Wrong answer");
								System.out.println("Correct answer is : option 3");
								System.out.println("rewards won : "+0);
								System.out.println("Total rewards won : " + safeReward);
								System.exit(0);
							}
							else {
								System.out.println("Correct answer");
								reward=reward7;
								System.out.println("Total rewards won : " + reward);
								System.out.println("-------------------------------");


								System.out.println("Press 1 to continue\n"
										+"press 0 to quit");
								int next = scan.nextInt();

								if(next==0) {
									System.out.println("Your crorepathi contest is ended, By your choice");
									System.out.println("Total rewards won : " + reward7);
									System.out.println("Congratulations! "+name);
									System.exit(0);
								}
								else {
									question8();
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
								System.out.println("1] Coorg------>15%\n"
										+"2] Araku---->30%\n"
										+"3] Wayanad----->40%\n"
										+"4] Pune--->15%");


								System.out.println("");
								option = scan.nextInt();

								if(option!=3) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 3");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + safeReward);
									System.exit(0);
								}
								else if(option == 3) {
									System.out.println("Correct answer");
									reward=reward7;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward7);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question8();
									}

								}
								else {
									System.out.println("Invalied option choosen");
								}

							}
							else {                                                                                                        //audience phone not chosen
								System.out.println("select an option \n"
										+"1] Coorg\n"
										+"2] Araku\n"
										+"3] Wayanad\n"
										+"4] Pune\n");
								if(option!=3) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 3");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + safeReward);
									System.exit(0);
								}
								else {
									System.out.println("Correct answer");
									reward=reward7;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward7);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question8();
									}
								}                                                                                 
							}

						}
					}
				}
				else {
					System.out.println("You have already used both the life lines.");
					System.out.println("select an option \n"
							+"1] Coorg\n"
							+"2] Araku\n"
							+"3] Wayanad\n"
							+"4] Pune\n");
					option = scan.nextInt();
					if(option!=3) {
						System.out.println("Wrong answer");
						System.out.println("Correct answer is : option 3");
						System.out.println("rewards won : "+0);
						System.out.println("Total rewards won : " + safeReward);
						System.exit(0);
					}
					else {
						System.out.println("Correct answer");
						reward=reward7;
						System.out.println("Total rewards won : " + reward);
						System.out.println("-------------------------------");


						System.out.println("Press 1 to continue\n"
								+"press 0 to quit");
						int next = scan.nextInt();

						if(next==0) {
							System.out.println("Your crorepathi contest is ended, By your choice");
							System.out.println("Total rewards won : " + reward7);
							System.out.println("Congratulations! "+name);
							System.exit(0);
						}
						else {
							question8();
						}
					}
				}

			}
			else if(option!=3) {                                                                                                                     //add else if
				System.out.println("Wrong answer");
				System.out.println("Correct answer is : option 3");
				System.out.println("rewards won : "+0);
				System.out.println("Total rewards won : " + safeReward);
				System.out.println("Congratulations! "+name);

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
					System.out.println("Congratulations! "+name);

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

	//==========================================================================
	//==========================================================================




	private static void question8() {

		System.out.println();
		System.out.println("=============================");
		System.out.println();
		System.out.println("Question Eight");
		System.out.println("Reward - 50,00,000");
		int reward8 = 5000000;
		safeReward = reward8;

		System.out.println();
		System.out.println("which city is known as queen of arabian sea?\n"
				+"1] Goa\n"
				+"2] Kochi\n"
				+"3] Vizag\n"
				+"4] Chennai\n"
				+"5] Life line");
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
							System.out.println("1] Goa---->20%\n"
									+"2] Kochi---->20%\n"
									+"3] Vizag----->20%\n"
									+"4] Chennai----->40%");


							System.out.println("");
							option = scan.nextInt();

							if(option!=4) {
								System.out.println("Wrong answer");
								System.out.println("Correct answer is : option 4");
								System.out.println("rewards won : "+0);
								System.out.println("Total rewards won : " + safeReward);
								System.exit(0);
							}
							else if(option == 4) {
								System.out.println("Correct answer");
								reward=reward8;
								System.out.println("Total rewards won : " + reward);
								System.out.println("-------------------------------");


								System.out.println("Press 1 to continue\n"
										+"press 0 to quit");
								int next = scan.nextInt();

								if(next==0) {
									System.out.println("Your crorepathi contest is ended, By your choice");
									System.out.println("Total rewards won : " + reward8);
									System.out.println("Congratulations! "+name);
									System.exit(0);
								}
								else {
									question9();
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
										+"3] Vizag\n"
										+"4] Chennai");
								option = scan.nextInt();
								if(option!=4) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 4");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + safeReward);
									System.exit(0);
								}
								else {
									System.out.println("Correct answer");
									reward=reward8;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward8);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question9();
									}

								}
							} 

							else {                                                                                                                         // fifty_fifty not chosen
								System.out.println("select an option \n"
										+"1] Goa\n"
										+"2] Kochi\n"
										+"3] Vizag\n"
										+"4] Chennai\n");
								option = scan.nextInt();
								if(option!=4) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 4");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + safeReward);
									System.exit(0);
								}
								else {
									System.out.println("Correct answer");
									reward=reward8;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward8);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question9();
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
									+"3] Vizag\n"
									+"4] Chennai");
							option = scan.nextInt();
							if(option!=4) {
								System.out.println("Wrong answer");
								System.out.println("Correct answer is : option 4");
								System.out.println("rewards won : "+0);
								System.out.println("Total rewards won : " + safeReward);
								System.exit(0);
							}
							else {
								System.out.println("Correct answer");
								reward=reward8;
								System.out.println("Total rewards won : " + reward);
								System.out.println("-------------------------------");


								System.out.println("Press 1 to continue\n"
										+"press 0 to quit");
								int next = scan.nextInt();

								if(next==0) {
									System.out.println("Your crorepathi contest is ended, By your choice");
									System.out.println("Total rewards won : " + reward8);
									System.out.println("Congratulations! "+name);
									System.exit(0);
								}
								else {
									question9();
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
								System.out.println("1] Goa---->20%\n"
										+"2] Kochi---->20%\n"
										+"3] Vizag----->20%\n"
										+"4] Chennai----->40%");


								System.out.println("");
								option = scan.nextInt();

								if(option!=4) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 4");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + safeReward);
									System.exit(0);
								}
								else if(option == 4) {
									System.out.println("Correct answer");
									reward=reward8;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward8);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question9();
									}

								}
								else {
									System.out.println("Invalied option choosen");
								}

							}
							else {                                                                                                        //audience phone not chosen
								System.out.println("select an option \n"
										+"1] Goa\n"
										+"2] Kochi\n"
										+"3] Vizag\n"
										+"4] Chennai\n");
								if(option!=4) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 4");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + safeReward);
									System.exit(0);
								}
								else {
									System.out.println("Correct answer");
									reward=reward8;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward8);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question9();
									}
								}                                                                                 
							}

						}
					}
				}
				else {
					System.out.println("You have already used both hthe life lines.");
					System.out.println("select an option \n"
							+"1] Goa\n"
							+"2] Kochi\n"
							+"3] Vizag\n"
							+"4] Chennai\n");
					option = scan.nextInt();
					if(option!=4) {
						System.out.println("Wrong answer");
						System.out.println("Correct answer is : option 4");
						System.out.println("rewards won : "+0);
						System.out.println("Total rewards won : " + safeReward);
						System.exit(0);
					}
					else {
						System.out.println("Correct answer");
						reward=reward8;
						System.out.println("Total rewards won : " + reward);
						System.out.println("-------------------------------");


						System.out.println("Press 1 to continue\n"
								+"press 0 to quit");
						int next = scan.nextInt();

						if(next==0) {
							System.out.println("Your crorepathi contest is ended, By your choice");
							System.out.println("Total rewards won : " + reward8);
							System.out.println("Congratulations! "+name);
							System.exit(0);
						}
						else {
							question9();
						}
					}
				}

			}
			else if(option!=4) {                                                                                                              //---------
				System.out.println("Wrong answer");				
				System.out.println("Correct answer is : option 4");
				System.out.println("rewards won : "+0);
				System.out.println("Total rewards won : " + safeReward);
				System.out.println("Congratulations! "+name);

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
					System.out.println("Congratulations! "+name);

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

	//==========================================================================
	//==========================================================================




	private static void question9() {

		System.out.println();
		System.out.println("=============================");
		System.out.println();
		System.out.println("Question Nine");
		System.out.println("Reward - 75,00,000");
		int reward9 = 7500000;

		System.out.println();
		System.out.println("which city is known as silicon valley of india?\n"
				+"1] chennai\n"
				+"2] Mumbai\n"
				+"3] Bangalore\n"
				+"4] Delhi\n"
				+"5] Life line");
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
							System.out.println("1] Chennai----->20%\n"
									+"2] Mumbai---->20%\n"
									+"3] Bangalore----->40%\n"
									+"4] Delhi----->20%");
							System.out.println("");
							option = scan.nextInt();

							if(option!=3) {
								System.out.println("Wrong answer");
								System.out.println("Correct answer is : option 3");
								System.out.println("rewards won : "+0);
								System.out.println("Total rewards won : " + safeReward);
								System.exit(0);
							}
							else if(option == 3) {
								System.out.println("Correct answer");
								reward=reward9;
								System.out.println("Total rewards won : " + reward);
								System.out.println("-------------------------------");


								System.out.println("Press 1 to continue\n"
										+"press 0 to quit");
								int next = scan.nextInt();

								if(next==0) {
									System.out.println("Your crorepathi contest is ended, By your choice");
									System.out.println("Total rewards won : " + reward9);
									System.out.println("Congratulations! "+name);
									System.exit(0);
								}
								else {
									question10();
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
										+"3] Bangalore\n"
										+"4] Delhi");
								option = scan.nextInt();
								if(option!=3) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 3");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + safeReward);
									System.exit(0);
								}
								else {
									System.out.println("Correct answer");
									reward=reward9;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward9);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question10();
									}

								}
							} 

							else {                                                                                                                         // fifty_fifty not chosen
								System.out.println("select an option \n"
										+"1] chennai\n"
										+"2] Mumbai\n"
										+"3] Bangalore\n"
										+"4] Delhi\n");
								option = scan.nextInt();
								if(option!=3) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 3");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + safeReward);
									System.exit(0);
								}
								else {
									System.out.println("Correct answer");
									reward=reward9;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward9);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question10();
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
									+"3] Bangalore\n"
									+"4] Delhi");
							option = scan.nextInt();
							if(option!=3) {
								System.out.println("Wrong answer");
								System.out.println("Correct answer is : option 3");
								System.out.println("rewards won : "+0);
								System.out.println("Total rewards won : " + safeReward);
								System.exit(0);
							}
							else {
								System.out.println("Correct answer");
								reward=reward9;
								System.out.println("Total rewards won : " + reward);
								System.out.println("-------------------------------");


								System.out.println("Press 1 to continue\n"
										+"press 0 to quit");
								int next = scan.nextInt();

								if(next==0) {
									System.out.println("Your crorepathi contest is ended, By your choice");
									System.out.println("Total rewards won : " + reward9);
									System.out.println("Congratulations! "+name);
									System.exit(0);
								}
								else {
									question10();
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
								System.out.println(	"1] Chennai----->20%\n"
										+"2] Mumbai--->20%\n"
										+"3] Bangalore----->40%\n"
										+"4] Delhi-->20%");


								System.out.println("");
								option = scan.nextInt();

								if(option!=3) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 3");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + safeReward);
									System.exit(0);
								}
								else if(option == 4) {
									System.out.println("Correct answer");
									reward=reward9;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward9);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question10();
									}

								}
								else {
									System.out.println("Invalied option choosen");
								}

							}
							else {                                                                                                        //audience phone not chosen
								System.out.println("select an option \n"
										+"1] chennai\n"
										+"2] Mumbai\n"
										+"3] Bangalore\n"
										+"4] Delhi\n");
								if(option!=3) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 3");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + safeReward);
									System.exit(0);
								}
								else {
									System.out.println("Correct answer");
									reward=reward9;
									System.out.println("Total rewards won : " + reward);
									System.out.println("-------------------------------");


									System.out.println("Press 1 to continue\n"
											+"press 0 to quit");
									int next = scan.nextInt();

									if(next==0) {
										System.out.println("Your crorepathi contest is ended, By your choice");
										System.out.println("Total rewards won : " + reward9);
										System.out.println("Congratulations! "+name);
										System.exit(0);
									}
									else {
										question10();
									}
								}                                                                                 
							}

						}
					}
				}
				else {
					System.out.println("You have already used both the life lines.");
					System.out.println("select an option \n"
							+"1] chennai\n"
							+"2] Mumbai\n"
							+"3] Bangalore\n"
							+"4] Delhi\n");
					option = scan.nextInt();
					if(option!=3) {
						System.out.println("Wrong answer");
						System.out.println("Correct answer is : option 3");
						System.out.println("rewards won : "+0);
						System.out.println("Total rewards won : " + safeReward);
						System.exit(0);
					}
					else {
						System.out.println("Correct answer");
						reward=reward9;
						System.out.println("Total rewards won : " + reward);
						System.out.println("-------------------------------");


						System.out.println("Press 1 to continue\n"
								+"press 0 to quit");
						int next = scan.nextInt();

						if(next==0) {
							System.out.println("Your crorepathi contest is ended, By your choice");
							System.out.println("Total rewards won : " + reward9);
							System.out.println("Congratulations! "+name);
							System.exit(0);
						}
						else {
							question10();
						}
					}
				}

			}

			else if(option!=3) { 																													
				System.out.println("Wrong answer");
				System.out.println("Correct answer is : option 3");
				System.out.println("rewards won : "+0);
				System.out.println("Total rewards won : " + safeReward);
				System.out.println("Congratulations! "+name);

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
					System.out.println("Congratulations! "+name);

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

	//==========================================================================
	//==========================================================================





	private static void question10() {

		System.out.println();
		System.out.println("=============================");
		System.out.println();
		System.out.println("Question ten");
		System.out.println("Reward - 1,00,00,000");
		int reward10 = 10000000;

		
		System.out.println();
		System.out.println("Which city is known as city of Pearls?\n"
				+"1] Hyderbad\n"
				+"2] Bangalore\n"
				+"3] Chennai\n"
				+"4] Goa\n"
				+"5] Life line");
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
							System.out.println("1] Hyderbad------>40%\n"
									+"2] Bangalore-------->20%\n"
									+"3] Chennai-------->20%\n"
									+"4] Bangalore------>20%");


							System.out.println("");
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
								reward=reward10;
								System.out.println("Total rewards won : " + reward);
								System.out.println("Congratulations! "+name);
								System.out.println("-------------------------------");
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
										+"1] Hyderbad\n"
										+"2] Bangalore");
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
									reward=reward10;
									System.out.println("Total rewards won : " + reward);
									System.out.println("Congratulations! "+name);
									System.out.println("-------------------------------");

								}
							} 

							else {                                                                                                                         // fifty_fifty not chosen
								System.out.println("select an option \n"
										+"1] Hyderbad\n"
										+"2] Bangalore\n"
										+"3] Chennai\n"
										+"4] Goa\n");
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
									reward=reward10;
									System.out.println("Total rewards won : " + reward);
									System.out.println("Congratulations! "+name);
									System.out.println("-------------------------------");
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
									+"1] Hyderbad\n"
									+"2] Bangalore");
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
								reward=reward10;
								System.out.println("Total rewards won : " + safeReward);
								System.out.println("-------------------------------");
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
								System.out.println(	"1] Hyderbad------>40%\n"
										+"2] Bangalore-------->20%\n"
										+"3] Chennai-------->20%\n"
										+"4] Goa------>20%");


								System.out.println("");
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
									reward=reward10;
									System.out.println("Total rewards won : " + reward);
									System.out.println("Congratulations! "+name);
									System.out.println("-------------------------------");
								}
							}
							else {                                                                                                        //audience phone not chosen
								System.out.println("select an option \n"
										+"1] Hyderbad\n"
										+"2] Bangalore\n"
										+"3] Chennai\n"
										+"4] Goa\n");
								if(option!=1) {
									System.out.println("Wrong answer");
									System.out.println("Correct answer is : option 1");
									System.out.println("rewards won : "+0);
									System.out.println("Total rewards won : " + safeReward);
									System.exit(0);
								}
								else {
									System.out.println("Correct answer");
									reward=reward10;
									System.out.println("Total rewards won : " + reward);
									System.out.println("Congratulations! "+name);
									System.out.println("-------------------------------");
								}                                                                                 
							}
						}
					}
				}
				else {
					System.out.println("You have already used both the life lines.");
					System.out.println("select an option \n"
							+"1] Hyderbad\n"
							+"2] Bangalore\n"
							+"3] Chennai\n"
							+"4] Goa\n");
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
						reward=reward10;
						System.out.println("Total rewards won : " + reward);
						System.out.println("Congratulations! "+name);
						System.out.println("-------------------------------");
					}
				}
			}
			else if(option!=1) {                                                                                                      //=========
				System.out.println("Wrong answer");
				System.out.println("Correct answer is : option 1");
				System.out.println("rewards won : "+0);
				System.out.println("Total rewards won : " + safeReward);
				System.out.println("Congratulations! "+name );
			}
			else {
				System.out.println("Correct answer");
				reward=reward10;
				System.out.println("Total rewards won : " + reward);
				System.out.println("-------------------------------");

				System.out.println("Congratulations! "+name+" Victory is yours!");

				System.out.println("You own the final round of Crorepathi contest");
				System.out.println("Total rewards won : " + reward10);
			}
		}
		else {
			System.out.println("Choosen option invalied");
		}
	}
}
