public class SpiceMix 
{

    private char[] SpiceMix_store;
    
    
    public SpiceMix(char[] spicemix)
    {
    
        this.SpiceMix_store = spicemix; 
    }
    
    public char getSpice(int i)
    {
        return this.SpiceMix_store[i];
    }
    
    public char[] getSpiceMix_store()
    {
        return this.SpiceMix_store;
    }
    
    public String toString()
    {
        return this.SpiceMix_store[0] + " " + this.SpiceMix_store[1] + " " + this.SpiceMix_store[2] + " " + this.SpiceMix_store[3] + " " + this.SpiceMix_store[4];
        
    
    
    }
}

class Attempt
{
    private SpiceMix suggestion;
    private SpiceMix solution;
    
    public Attempt(SpiceMix suggestion, SpiceMix solution)
    {
        this.suggestion = suggestion;
        this.solution = solution;
    }
    
    public SpiceMix getSpiceMix()
    {
        return this.suggestion;
    }
    
    public SpiceMix getsolution()
    {
        return this.solution;
    }
    
    
    public int getNumGood()
    {   
        int count = 0;
        for (int i = 0; i < 5; i++)
        {
            if (this.suggestion.getSpice(i) == this.solution.getSpice(i))
                {count += 1;}
        }
        
        return count;
        
        
    }
    
    public int getNumWrongQuantity()
    {
        
        int position_solution_counter = -1;
        int position_suggestion_counter = -1;
        int wrong_quantity_counter = 0;
        
        for (int i =0; i < 5; i++)
        {   
            
            position_solution_counter += 1;
            for (int i2 = 0; i2 < 5; i2++)
            {
            
                position_suggestion_counter += 1;
                if (this.solution.getSpice(i) == this.suggestion.getSpice(i2))
                {
                    if (position_solution_counter != position_suggestion_counter)
                        {
                            wrong_quantity_counter += 1;
                        }
                }
                
            }
        }
        
        
        return wrong_quantity_counter;
        
        
        
    }
    
    public boolean isCorrect()
    {
        boolean is_correct_checker =false;
        for (int i=0;i<5;i++)
        {
            if (this.solution.getSpice(i) == this.suggestion.getSpice(i))
            {
                is_correct_checker = true;
            }
            else 
            {
                is_correct_checker = false;
            }
        }
        return is_correct_checker;
    }
    
    
    public String toString()
    {
        
        return this.suggestion.getSpice(0) + " " + this.suggestion.getSpice(1) + " " + this.suggestion.getSpice(2) + " " + this.suggestion.getSpice(3) + " " + this.suggestion.getSpice(4) + " (Good "+
        this.getNumGood() + ", Wrong quantity " +
        this.getNumWrongQuantity() + ")";
    }
    

}



