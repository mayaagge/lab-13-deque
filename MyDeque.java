import java.util.NoSuchElementException;
@SuppressWarnings("unchecked")
public class MyDeque<E>{
      // Instance variables
      private E[] data;
      private int size;
      private int start, end;

      // Constructors
      public MyDeque(){ 
        data = (E[])new Object[10];
        size = 0;
        start = 0;
        end = 0;
      }
  
      public MyDeque(int initialCapacity){ 
         data = (E[])new Object[intialCapacity];
         size = 0;
         start = 0;
         end = 0;
      }
      
      // Add a new value on the indicated side
      public void addFirst(E element){
          if (data.length == size){
              this.resize();
          }
          else if (start == 0 && E[0] != null){
              E[data.length-1] = element;
          }
          else if (start == 0 && E[0] == null){
              E[0] = element;
          }
          else{
              E[start-1] = element;
          }
          size++;
      }
      public void addLast(E element){
         if (data.length == size){
              this.resize();
          }
          else if (end == 0 && E[0] == null){
              E[0] = element;
          }
          else{
              E[end+1] = element;
          }
          size++;
      }
      
      // Remove and return the element
      public E removeFirst(){ }
      public E removeLast(){ }
      
      // Return the element. Do not delete elements.
      public E getFirst(){ }
      public E getLast(){ }
      
      // Return deque size
      public int size(){
          return size;
      }
          
      // Getters
  
      // Return data
      public E[] getData(){
          return data;
      }
      // Return start
      public int getStart(){
          return start;
      }
      // Return end
      public int getEnd(){
          return end;
      }
      
      // Resize the array. Double its length (data.length * 2)
      private void resize() {
          data = (E[])new Object(2*data.length); 
      }
      
      // Return the deque as string in the correct order
      // Ex.:  "[hello, my, dear, friends!]" where hello is the value at start index
      // and friends! is the value at end index
      public String toString(){ }
    }
