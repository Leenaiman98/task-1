package jo.secondstep.list;

public class ArrayList implements List{

	private static final int DEFAULT_CAPACITY = 4;
	
	int[] elements = new int[DEFAULT_CAPACITY];
	int[] newArrayl;
	
	int elsize=elements.length;
	int Requested_Element;
	boolean result;

	@Override
	public void add(int value) {
		elements[elsize+1]=value;
		
	}

	@Override
	public void add(int value, int position) {

		if ( position < 0) System.out.print("Required position is not valid");
		else 
		{ 
			// if the capacity is exceeded
			if(position > elsize )
		    {
			// assume that we will add one element at each call
			newArrayl = new int[position];
	        for (int i = 0; i<elsize; i++) newArrayl[i] = elements[i]; 
		    newArrayl = elements;
    	    newArrayl[position]=value;
    	    }
			//if ArrayList is not fully yet!
    	   else {
		    	 elements[position]=value;
		    	} 
         }
	     	                                 }

	
		
		
	

	@Override
	public void remove(int position) 
	{   if (position > DEFAULT_CAPACITY || position < 0) {System.out.print("Required position is not valid");}
		else 
		{
			  int[] temp = new int[elements.length + 1];
			  for (int i = 0; i < elements.length; ++i) {
				if (i==position) return;
				if(i<position) temp[i]=elements[i];
			    if(i>position) temp[i-1]=elements[i];
			  }
			  elements = temp;
		}
   
	}

	@Override
	public int get(int position) {
      
		if (position > DEFAULT_CAPACITY || position < 0) {System.out.print("Required position is not valid");}
		else 
			 for(int i=0 ; i<position  ; i++ )	
             {
				 Requested_Element = elements[position] ;   
             }
		
		return Requested_Element;  
	}

	@Override
	public int size() {
		return elsize;
	}

	@Override
	public void clear() {
		//memory saving 
		elements = new int[DEFAULT_CAPACITY] ; 
        elsize = 0;		
	}
	
	
	
	

	@Override
	public void set(int value, int position) 
	     {
          elements[position] = value;
         }

	
	
	
	@Override
	public boolean isEmpty() {
		if (elsize != 0) {result=false;}
		else {result = true;}
	return result;
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
