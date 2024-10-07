package com.xyz.basicsofprogramming.day27;

import java.util.Scanner;

public class KBC1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("welcome to KBC");
	System.out.println("...............................");
	System.out.println("queston1. 10,000");
	System.out.println("queston2. 50,000");
	System.out.println("queston3. 100,000");
	System.out.println("queston4. 300,000");
	System.out.println("queston5. 600,000");
	System.out.println("queston6. 1,250,000");
	System.out.println("queston7. 2,500,000");
	System.out.println("queston8. 5,000,000");
	System.out.println("queston9. 8,000,000");
	System.out.println("queston10. 10,000,000");
	 System.out.println(".............................................................");
	System.out.println("question number");
	int a=1 , b=2 ,c=3 , d=4 , e=5, f=6 ,g=7, h=8, i=9 ,j=10; 
	int question = sc.nextInt();
	if(question==a) {
	System.out.println("what is capital of france?");
    System.out.println("1. Berlin");
    System.out.println("2. Paris");
    System.out.println("3. Rome");
    System.out.println("4. Madrid");
    System.out.print("Enter your choice (1-4): ");
    int choice = sc.nextInt();
    
    if (choice == 2) {
        System.out.println("Correct! ");
        System.out.println("Paris");
        System.out.println("congratulations you won 10000");
        System.out.println("you entered into safe zone");
        System.out.println(".............................................................");
    } else {
        System.out.println("Incorrect.");
        System.out.println("you are Eliminated");
        System.out.println("correct answer is option:2");
        System.out.println("congratulations you won 10000");
        System.out.println(".............................................................");
    }
   if(choice==2) {
   System.out.println("...........................................................");
	System.out.println("enter  1 to continue");
	System.out.println("enter 0 to quite");
	int next =sc.nextInt();
	if(next==0) {
		System.out.println("I am ready to quite the game");
		System.out.println("congratulations you won 10000");
		 System.out.println(".............................................................");
	}
	else if(next==1) {
		question=b;
		 System.out.println(".............................................................");
	}
	else {
		System.out.println("you are rewarded with 10000");
	}
	}
	}
	if(question==b){
    System.out.println("-------------------"+b);
    System.out.println("who is present prime minister of india");
    System.out.println("1. Devegowda");
    System.out.println("2. Narendra Modi");
    System.out.println("3. Jawaharlal Nehru");
    System.out.println("4. Manmohan Singh");
    System.out.print("Enter your choice (1-4): ");
    int choice1 = sc.nextInt();
    if (choice1 == 2) {
        System.out.println("Correct!");
        System.out.println("Narendra Modi");
        System.out.println("congratulations you won  50,000");
        System.out.println(".............................................................");
    } else {
        System.out.println("Incorrect.");
        System.out.println("you are Eliminated");
        System.out.println("correct answer is option:2");
        System.out.println("congratulations you won 10000");
        System.out.println(".............................................................");
    }
	
	if(choice1==2) {
		   System.out.println("...........................................................");
			System.out.println("enter  1 to continue");
			System.out.println("enter 0 to quite");
			int next =sc.nextInt();
			if(next==0) {
				System.out.println("I am ready to quite the game");
				System.out.println("congratulations you won 50,000");
				 System.out.println(".............................................................");
			}
			else if(next==1) {
				question=c;
				 System.out.println(".............................................................");	
			}
			else {
				System.out.println("you are rewarded with 50000");
			}
			}
			}

	if(question==c) {
    System.out.println("question3");
    System.out.println("Who is the first woman to successfully climb K2, the world’s second highest mountain peak?");
    System.out.println("1. Junko Tabei");
    System.out.println("2. Wanda Rutkiewicz");
    System.out.println("3. Tamae Watanabe");
    System.out.println("4. Chantal Mauduit");
    System.out.print("Enter your choice (1-4): ");
    int choice2 = sc.nextInt();
    if (choice2 == 2) {
        System.out.println("Correct!");
        System.out.println("Wanda Rutkiewicz");
        System.out.println("congratulations you won  100,000");
        System.out.println(".............................................................");
    } else {
        System.out.println("Incorrect.");
        System.out.println("you are Eliminated");
        System.out.println("correct answer is option:2");
        System.out.println("congratulations you won 10000");
        System.out.println(".............................................................");
    }
	
    if(choice2==2) {
    	   System.out.println("...........................................................");
    		System.out.println("enter  1 to continue");
    		System.out.println("enter 0 to quite");
    		int next =sc.nextInt();
    		if(next==0) {
    			System.out.println("quite the game");
    			System.out.println("congratulations you won  100,000");
    			 System.out.println(".............................................................");
    		}
    		else if(next==1) {
    			question=d;
    			 System.out.println(".............................................................");
    		}
    		else {
    			System.out.println("you are rewarded with 10000");
    		}
    		}
    		}
	if(question==d) {
	    System.out.println("question4");
	    System.out.println( "What does not grow on tree according to a popular Hindi saying?");
	    System.out.println("1. money");
	    System.out.println("2. fruits");
	    System.out.println("3. flower");
	    System.out.println("4. vegitables");
	    System.out.print("Enter your choice (1-4): ");
	    int choice3 = sc.nextInt();
	    if (choice3 == 1) {
	        System.out.println("Correct!");
	        System.out.println("money");
	        System.out.println("you entered into safe zone");
	        System.out.println("congratulations you won 300,000");
	        System.out.println(".............................................................");
	    } else {
	        System.out.println("Incorrect.");
	        System.out.println("correct answer is option:1");
	        System.out.println("you are Eliminated");
	        System.out.println(".............................................................");
	    }
	    if(choice3==1) {
	    	   System.out.println("...........................................................");
	    		System.out.println("enter  1 to continue");
	    		System.out.println("enter 0 to quite");
	    		int next =sc.nextInt();
	    		if(next==0) {
	    			System.out.println("quite the game");
	    			System.out.println("congratulations you won 300,000");
	    			 System.out.println(".............................................................");
	    		}
	    		else if(next==1) {
	    			question=e;
	    			 System.out.println(".............................................................");
	    		}
	    		else {
	    			System.out.println("you are rewarded with 300000");
	    		}
	    		}
	    		}
	if(question==e) {
	    System.out.println("question5");
	    System.out.println( "Who wrote India's National Anthem?");
	    System.out.println("1. Rabindranath Tagore");
	    System.out.println("2. Lal Bahadur Shastri");
	    System.out.println("3. Chetan Bhagat");
	    System.out.println("4.RK Narayan");
	    System.out.print("Enter your choice (1-4): ");
	    int choice4 = sc.nextInt();
	    if (choice4 == 1) {
	        System.out.println("Correct!");
	        System.out.println("Rabindranath Tagore");
	        System.out.println("congratulations you won  600,000");
	        System.out.println(".............................................................");
	    } else {
	        System.out.println("Incorrect.");
	        System.out.println("you are Eliminated");
	        System.out.println("correct answer is option:1");
	        System.out.println("congratulations you won 300,000");
	       
	        System.out.println(".............................................................");
	    }
	    if(choice4==1) {
	    	   System.out.println("...........................................................");
	    		System.out.println("enter  1 to continue");
	    		System.out.println("enter 0 to quite");
	    		int next =sc.nextInt();
	    		if(next==0) {
	    			System.out.println("quite the game");
	    			System.out.println("congratulations you won 600,000");
	    			 System.out.println(".............................................................");
	    		}
	    		else if(next==1) {
	    			question=f;
	    			 System.out.println(".............................................................");
	    		}
	    		else {
	    			System.out.println("you are rewarded with 300000");
	    		}
	    		}
	}  

if(question==f) {
	    System.out.println("question6");
	    System.out.println("Where is India Gate located?");
	    System.out.println("1. Agra");
	    System.out.println("2. Mumbai");
	    System.out.println("3. New Delhi");
	    System.out.println("4.Bengauru");
	    System.out.print("Enter your choice (1-4): ");
	    int choice5 = sc.nextInt();
	    if (choice5 == 3) {
	        System.out.println("Correct!");
	        System.out.println("New Delhi");
	        System.out.println("congratulations you won 12500000");
	        System.out.println(".............................................................");  
	       
	    } else {
	        System.out.println("Incorrect.");
	        System.out.println("you are Eliminated");
	        System.out.println("correct answer is option:3");
	        System.out.println("congratulations you won 300,000");
	        System.out.println(".............................................................");
	    }
	    if(choice5==3) {
	    	   System.out.println("...........................................................");
	    		System.out.println("enter  1 to continue");
	    		System.out.println("enter 0 to quite");
	    		int next =sc.nextInt();
	    		if(next==0) {
	    			System.out.println("quite the game");
	    			System.out.println("congratulations you won 1250000");
	    			 System.out.println(".............................................................");
	    		}
	    		else if(next==1) {
	    			question=g;
	    			 System.out.println(".............................................................");
	    		}
	    		else {
	    			System.out.println("you are rewarded with 300000");
	    		}
	    		}
	    		}
if(question==g){
	    System.out.println("question7");
	    System.out.println("Who wrote Vande Mataram?");
	    System.out.println("1. Sarat Chandra Chattopadhyay");
	    System.out.println("2.Rabindranath Tagore");
	    System.out.println("3.Bankim Chandra Chatterjee");
	    System.out.println("4.Ishwar Chandra Vidyasagar");
	    System.out.print("Enter your choice (1-4): ");
	    int choice6 = sc.nextInt();
	    if (choice6 == 3) {
	        System.out.println("Correct!");
	        System.out.println("Bankim Chandra Chatterjee");
	        System.out.println("congratulations you won  2500000");
	        System.out.println(".............................................................");
	        } 
	    else {
	        System.out.println("Incorrect.");
	        System.out.println("you are Eliminated");
	        System.out.println("correct answer is option:3");
	        System.out.println("congratulations you won 300,000");
	        System.out.println(".............................................................");
	    }
	    if(choice6==3) {
	    	   System.out.println("...........................................................");
	    		System.out.println("enter  1 to continue");
	    		System.out.println("enter 0 to quite");
	    		int next =sc.nextInt();
	    		if(next==0) {
	    			System.out.println("quite the game");
	    			System.out.println("congratulations you won 2500000");
	    			 System.out.println(".............................................................");
	    		}
	    		else if(next==1) {
	    			question=h;
	    			 System.out.println(".............................................................");
	    		}
	    		else {
	    			System.out.println("you are rewarded with 300000");
	    		}
	    		}
	    		}
	if(question==h) {
	    System.out.println("question8");
	    System.out.println("Which city is known as the Pink City of India?");
	    System.out.println("1.Mumbai");
	    System.out.println("2.Bengaluru");
	    System.out.println("3.Chennai");
	    System.out.println("4.Rajasthan");
	    System.out.print("Enter your choice (1-4): ");
	    int choice7 = sc.nextInt();
	    if (choice7 == 4) {
	        System.out.println("Correct!");
	        System.out.println("Rajasthan");
	        System.out.println("you entered into safe zone");
	        System.out.println("congratulations you won  5000000");
	        System.out.println(".............................................................");
	        } 
	    else {
	        System.out.println("Incorrect.");
	        System.out.println("you are Eliminated");
	        System.out.println("correct answer is option:4");
	        System.out.println("congratulations you won 5000000");
	        System.out.println(".............................................................");
	    }
	    if(choice7==4) {
	    	   System.out.println("...........................................................");
	    		System.out.println("enter  1 to continue");
	    		System.out.println("enter 0 to quite");
	    		int next =sc.nextInt();
	    		if(next==0) {
	    			System.out.println("quite the game");
	    			System.out.println("congratulations you won 5000000");
	    			 System.out.println(".............................................................");
	    		}
	    		else if(next==1) {
	    			question=i;
	    			 System.out.println(".............................................................");	
	    		}
	    		else {
	    			System.out.println("you are rewarded with 5000000");
	    		}
	    		}
	    		}
		if(question==i) {
	    System.out.println("question9");
	    System.out.println("Which city is known as the \"Silicon Valley Of India\"?");
	    System.out.println("1.Mumbai");
	    System.out.println("2.Bengaluru");
	    System.out.println("3.Chennai");
	    System.out.println("4.Rajasthan");
	    System.out.print("Enter your choice (1-4): ");
	    int choice8 = sc.nextInt();
	    if (choice8 == 2) {
	        System.out.println("Correct!");
	        System.out.println("Bengaluru");
	        System.out.println("congratulations you won 8000000");
	        System.out.println(".............................................................");
	        } 
	    else {
	        System.out.println("Incorrect.");
	        System.out.println("you are Eliminated");
	        System.out.println("correct answer is option:2");
	        System.out.println("congratulations you won 5000000");
	        System.out.println(".............................................................");
	    }
	    if(choice8==2) {
	    	   System.out.println("...........................................................");
	    		System.out.println("enter  1 to continue");
	    		System.out.println("enter 0 to quite");
	    		int next =sc.nextInt();
	    		if(next==0) {
	    			System.out.println("quite the game");
	    			System.out.println("congratulations you won 8000000");
	    			 System.out.println(".............................................................");
	    		}
	    		else if(next==1) {
	    			question=j;
	    			 System.out.println(".............................................................");
	    		}
	    		else {
	    			System.out.println("you are rewarded with 5000000");
	    		}
	    		}
	    		}
		
if(question==j) {
	    System.out.println("question10");
	    System.out.println("Which country is the largest by land area?");
	    System.out.println("1.Canada");
	    System.out.println("2.China");
	    System.out.println("3.United States");
	    System.out.println("4.Russia");
	    System.out.print("Enter your choice (1-4): ");
	    int choice9 = sc.nextInt();
	    if (choice9 == 4) {
	        System.out.println("Correct!");
	        System.out.println("Russia");
	        System.out.println(j);
	        System.out.println(".............CONGRATULATIONS YOU WON 1 CRORE RUPEE...............");
	        System.out.println(".............................................................");
	        } 
	    else {
	        System.out.println("Incorrect.");
	        System.out.println("correct answer is option:4");
	        System.out.println("congratulations you won 5000000");
	        
	        System.out.println(".............................................................");
	    }
	   
	}
}
}