


class LinkedListNode
{
    private node head = null; //this makes sense as to start of with, there are no nodes within the item.
    
    
    public void add(Attempt attempt)
    {
        if (this.head == null)
        {
            this.head = new node(attempt);
            
        }
        else
        {   
            
            head = new node(attempt, head);
        }
    }
    public node get_head()
    {
        return this.head;
        
    }
    
   
    
    
    
    
    @Override
    public String toString()
    {
        if(this.head==null)
        {
            return null;
        }
        
        else
        {
            String string_holder = "";
            node EmptyNode = this.head;
            
            while(EmptyNode != null)
            {
                string_holder  = string_holder + EmptyNode.get_Attempt().toString() + "\n" ;
                EmptyNode = EmptyNode.get_next();
                
            }
            return string_holder;
            
        }
    }
    
    
    
    

    
    
}


