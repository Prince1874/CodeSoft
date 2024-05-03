package code_soft.java.random_game;
import java.lang.Math;
import java.util.Scanner;

class Random{


    public  void Template(){

            System.out.println("\n\n\t\t---------------WELCOME TO RANDOM GAME---------------");
            System.out.println("\n\n\nRules of the Game:");
            System.out.println("\t1.Guess a Number in range 1 To 100.");
            System.out.println("\t2.You have 3 life to guess correct answer.");
            System.out.println("\t3.Each right guess Award's you with a point\n\n");
            Random r = new Random();
            r.Menu();
    }

   public void Menu(){
       
       Scanner sc = new Scanner(System.in);
       System.out.print("\n\n1.Start Game\n2.Check Curruent Points\n3.Exit");
       System.out.print("\n\nChoose an Option: ");
       int choice = sc.nextInt();

       switch(choice){

         case 1: 
            GenerateRandom();
            break;
         case 2:
            Score();
            break;
         case 3:
            System.exit(0);
            break;
         default: 
            System.out.println("Invalid Choice..?");
            break;         
       }


    }

	public void GenerateRandom()
	{
		int max = 3;
		int min = 1;
		int range = max - min + 1;
		int rand = (int)(Math.random() * range) + min;

        Scanner sc = new Scanner(System.in);
         int count=1;
         int guess=0;
         while(count<=3){
                System.out.print("\n\nEnter Your Guess: ");
                guess = sc.nextInt();
            
                if(rand == guess){
        
                    System.out.println("Right Guess..!!"); 
                    System.out.println("Your Guess: " + guess);    
                    System.out.println("Random Number: " + rand); 
                    break;                   

                }
                else{
                
                    System.out.println("OFFO Wrong Guess...!!"); 
                    System.out.println("Your Guess: " + guess);  
                    System.out.println("\nTry again...!!");  
                    count++;
                }

        
         }
         System.out.println("OFFO Wrong Guess...!!"); 
         System.out.println("Your Guess: " + guess);  
         System.out.println("Random Number: " + rand);   
         System.out.println("\n\n");
         Menu();   

	
	}

    public void Score(){
            System.out.println("New Change");
    }
}
