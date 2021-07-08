package jo.secondstep.list;

public class LinkedList implements List{

	//assume we deal with sigleLinkedList
   // LinkedList list = new LinkedList();

    Node head;
    Node tail;
    Node previous;
    Node current=head;
    int CurretSize = 0;
    Node temp_delete= new Node();

   
   
    
	@Override
	//End of list 
	   public void add(int value) {       	
		Node new_node = new Node(value);

        if(isEmpty())
		              {
        new_node.next = head;
		tail=head ;
		              } 
		else {     	
            tail.setNext(new_node);
			tail=tail.getNext();
		     }
        
		CurretSize++;
		                       }
		

	@Override
	public void add(int value, int position)
	{
	
	           {
            Node newNode = new Node(value);

            if (position > size() || position < 0)	System.out.print("Invalid position");
            
	     
	        
	        if (position == size()) add(value);
	        
	        {
	        	//at begging 
	        if (position==0)
	            {
	        newNode.next = head;
	        head = newNode;
	            }      
	        //at middle
	        else {
	        	
	        	for(int i=0 ; i< position-1 ; i++) 
	        		current=current.getNext();
	        	newNode=current.getNext();
	        	current.setNext(newNode);
	              }
	        
			CurretSize++;
	        }

	        
	           }
	      }



	@Override
	public void remove(int position) {

		if (position >= size()|| position < 0) System.out.print("Required position is not valid");
        
		
		else {
		    
			previous=head;
			for(int i=0 ; i<position ;i++) temp_delete=previous.getNext();
		   
			current=previous.getNext();
			previous.next= current.next;
			current.next=null;
			
			}
		
	
		
		
		CurretSize--;	
	                                  }

	
	
	
	@Override
	public int get(int position) {
		if (position >= size()|| position < 0) System.out.print("Required position is not valid");
		else if (position < size() - 1) {
			
			for(int i=0 ; i>position ;i++) { current=current.getNext(); return current.data;}
	                                    }
			
        //if position equals to size()-1    
		return tail.data;
	}


	
	
	@Override
	public int size() {
		return CurretSize;
	}

	
	
	
	@Override
	public void clear() {
      head=null;
      tail=null;
      CurretSize = 0;
	}

	@Override
	public void set(int value, int position) 
	
	{
		if (position >= size()|| position < 0) {System.out.print("Required position is not valid");}
		else if (position < size() - 1) {
			
			for(int i=0 ; i>position ;i++) add(value,position);
			                            }

			
        		
	}

	@Override
	public boolean isEmpty() {
		return head==null;
	                         }
	
	  
    public static void main(String[] args) {  
  
        LinkedList sList = new LinkedList();  
         sList.isEmpty();
         sList.set(5, 0);
        //Adding 1 to the list  
        sList.add(1);  
  
        //Adding 2 to the list  
        sList.add(2 , 1);  
        
        sList.size();
  
       
    }  
	

}
