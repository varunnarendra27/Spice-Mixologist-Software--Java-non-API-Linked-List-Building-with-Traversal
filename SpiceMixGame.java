import java.util.Random;

public class SpiceMixGame
{
    private SpiceMix game_solution;
    private LinkedListNode attempts;
    

    
    
    public SpiceMixGame(SpiceMix spicemix)
    {   
        attempts = new LinkedListNode();
        this.game_solution = spicemix;
    }
    
    public SpiceMixGame()
    {
        char[] SpiceMix = new char[5];
        Random rand = new Random();
        
        
        for (int i = 0; i<5; i++){
            SpiceMix[i] = (char)('N' + rand.nextInt(7));
        }
        
        this.game_solution = new SpiceMix(SpiceMix);
        
        attempts = new LinkedListNode();
        
    }
    
    
    
    public SpiceMix get_game_solution()
    {
        return this.game_solution;
    }
    
    public boolean attemptSpiceMix(SpiceMix spicemix)
    {
        Attempt attempt = new Attempt(spicemix, this.game_solution);
        attempts.add(attempt);
        return attempt.isCorrect();
        
    }
    
    public String getPreviousAttempts()
    {
        return attempts.toString();
        
    }
    
    public SpiceMix getSolution()
    {
        return this.game_solution;
    }
    
    


}


