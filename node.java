public class node
{
    private Attempt attempt;
    private node next;
    private LinkedListNode SpiceMixList;
    
    
    
    public node(Attempt attempt)
    {
        this.attempt = attempt;
        next = null;
    }
    
    
    
    public node(Attempt attempt, node next)
    {
        this.attempt = attempt;
        this.next = next;
    }
    
    public LinkedListNode get_SpiceMixList()
    {
        return this.SpiceMixList;
    }
    
    public Attempt get_Attempt()
    {
        return this.attempt;
    }
    
    
    
     public node get_next()
    {
        return this.next;
    }
    
    public node get_head()
    {
        return SpiceMixList.get_head();
    }
    
    public void set_next(node next)
    {
        this.next = next;
    }
   
    
    
    


}
