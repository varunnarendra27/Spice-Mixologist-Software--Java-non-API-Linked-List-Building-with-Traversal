import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class SpiceMixologistCli
{
    public static void main(String[] args)
    {
        SpiceMixGame spicemixgame = new SpiceMixGame();
        playGame(spicemixgame);
    }
    
    public static void playGame(SpiceMixGame spicemixgame)
    {
        Scanner kbd = new Scanner(System.in);
        char[] list_of_spices = {'N','O', 'P', 'Q', 'R', 'S', 'T'};
        ArrayList<Character> holder = new ArrayList<Character>();
        
        for (char z : list_of_spices)
        {
            holder.add(z);
        }
        
        

        
        
        boolean loop = true;
        boolean loop2 = true;
        int checker = 0;
        String user_input_string = "";
        
        
        while (loop == true)
        {
            System.out.println("Previous attempts:");
            if (spicemixgame.getPreviousAttempts() == null)
            {
                System.out.println("No previous attempts");
            }
            else
            {
                System.out.println(spicemixgame.getPreviousAttempts());
            }
            while (loop2 == true)
            {
                System.out.println("Enter spice mix:"); //
               
                for (int i = 0; i < 5 ; i++)
                {
                    user_input_string += kbd.next().charAt(0);
                }
                
                for (char x : user_input_string.toCharArray())
                {
                    
                    
                    if (holder.contains(x))
                    {  
                        
                        checker = checker;
                    }
                    else 
                    {
                        checker = checker + 1;
                    }
                    
                                    
                   
                }
                if (checker == 0) 
                {   
                    char[] spicemix_holder = new char[user_input_string.length()];
                    
                    for (int i = 0 ;i < user_input_string.length(); i++)
                    {
                        spicemix_holder[i] = user_input_string.charAt(i);
                    }

                    
                    
                    SpiceMix spicemix = new SpiceMix(spicemix_holder);
                    boolean isCorrect = spicemixgame.attemptSpiceMix(spicemix);
                    if (isCorrect == true)
                    {
                        System.out.println("Congratulations!");
                        loop = false;
                    
                    }
                    loop2 = false;
                    
                    
                    
                    
                }
                else 
                {
                    System.out.println("Invalid spice mix!");
                    loop2 = true;
                }
            }
            
        }
        
    }





}
