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
            Start();
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

	public void GenerateRandom(int guess)
	{
		int max = 100;
		int min = 1;
		int range = max - min + 1;
		int rand = (int)(Math.random() * range) + min;
        
        if(rand == guess){

             System.out.println("Right Guess..!!"); 
             System.out.println("Your Guess: " + guess);    
             System.out.println("Random Number: " + rand);                    

        }
        else{
           
             System.out.println("OFFO Wrong Guess..!!"); 
             System.out.println("Your Guess: " + guess);  
        }
	
	}

    public void Start(){
        
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        System.out.print("Enter Your Guess: ");
        int guess = sc.nextInt();
        ran.GenerateRandom(guess);

    }
    public void Score(){

    }
}
