package jo.secondstep.list;

public class Node {
	  int  data;
      Node next;
      Node prev;
      Node last;
   // Constructor
      Node(int d)
      {
          data = d;
          next = null;
          prev=null;
          
      }

      Node()
      {
          
          next = null;
          prev=null;
          
      }
     
    public Node getNext() {
    	return next;
    	 
      } 
    

    public void setNext(Node n) {
        next = n;
        if (this == last) {
            last = n;
        }
        if (n != null && n.prev != this) {
            n.setPrevious(this);
        }
    }       
    public void setPrevious(Node p) {
        prev = p;
        if (p != null && p.next != this) 
                       {
            p.setNext(this);
                        }
    } 
}
