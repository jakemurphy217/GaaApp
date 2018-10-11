/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package doublelinkedlistexample;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Node;

/**
 *
 * @author cmuntean
 */
public class DLList {
     private DlNode head;
    private DlNode last;
    private DlNode curr;
    private int size;

    DLList(){
        head = null; last = null; size = 0;
        curr = head;
    }
    public boolean isEmpty(){
	 return (size == 0);
    }
    public int size(){
	 return size;
    }
    private void setCurrent(int index){
	curr = head;
	for (int k  = 1; k < index; k++){
		curr = curr.getNext();
        }
    }
    public void add(int index, Object theElement)
    {
        //add here the code that implements operation
        //that adds a new node on a given position (index)
        
        //insert a new Node when the lisy is empty
        if (size == 0){        
            // write your code here
            DlNode firstNode = new DlNode(theElement, null, null);
            head = firstNode;
            last = firstNode;
            
            
        } else {
            // Insert a new Node at the head position
            if (index == 1){
                // write your code here
                DlNode secondNode = new DlNode(theElement, head, null);
                secondNode = head;
                
                
            }
            // Insert a new Node at the last position
            else if (index == (size+1)){
                // write your code here
                DlNode lastNode = new DlNode(theElement, null, last);
                lastNode = last;
                
            }
            else {
                // Insert a new node in the middle
               
                // write your code here
                setCurrent(index);
                DlNode middleNode = new DlNode(theElement, curr, curr.getPrev());
                curr.setPrev(middleNode);
                curr.getPrev().setNext(middleNode);
            }
        }
        size++;

    }


   public void remove(int index)
    {
        if (size > 0)
        {
            setCurrent(index);

            // If current item is the head, then the head become the next right node after current
            if (curr == head) {
                // write your code here
                
            } 
            // If current item is the last, then the last become the previous right before current
            else if(curr == last)
            {
                // write your code here
                
            } else {
            // If current item is not the last or the first, then the element to be removed is in the middle
                
                // write your code here

                
            }
            
            curr = null;
            size--;
        }
    }


    public Object get(int index) {
      setCurrent(index);
      return curr;
   }
    //************************************************************/
    // Provide a printlist() method which will print out       */
    // the contents of the double linked list, starting with he first node                                */
    //************************************************************/

    public void printList()
    {
         // write your code here
        DlNode aNode = head;
        while (aNode !=null){
            System.out.println(aNode.toString());
            aNode = aNode.getNext();
        }
        
    }
    
    //************************************************************/
    // Provide a printBackwardList() method which will print out       */
    // the information from the nodes starting from the last node up to the first node                                */
    //************************************************************/

    public void printBackwardList()
    {
         // write your code here
        
    }
    
}
