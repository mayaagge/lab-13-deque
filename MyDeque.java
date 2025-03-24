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
         data = (E[])new Object[initialCapacity];
         size = 0;
         start = 0;
         end = 0;
      }
      
      // Add a new value on the indicated side
      public void addFirst(E element){
          if (element == null){
            throw new NullPointerException("Can't add null");
          }
          if (data.length == size){
              resize();
          }
          start = (start-1+data.length)%data.length;
          data[start] = element;
          size++;
          if (size == 1){
              end = start;
          }
      }
      public void addLast(E element){
         if (element == null){
            throw new NullPointerException("Can't add null");
         }
         if (data.length == size){
              resize();
          }
          end = (end+1)%data.length;
          data[end] = element;
          size++;
          if (size == 1){
              end = start;
          }
      }

      
      // Remove and return the element
      public E removeFirst(){
            if (size == 0){
              throw new NoSuchElementException("No element like that");
            }
            E temp = data[start];
            data[start] = null;
            start = (start + 1) % data.length;
            size--;
            return temp;
      }
      public E removeLast(){
           if (size == 0){
              throw new NoSuchElementException("No element like that");
           }
            E temp = data[end];
            data[end] = null;
            end = (end - 1) % data.length;
            size--;
            return temp;
      }
      
      // Return the element. Do not delete elements.
      public E getFirst(){
           if (size == 0){
              throw new NoSuchElementException("No element like that");
           }
           return data[start];
      }
      public E getLast(){
           if (size == 0){
              throw new NoSuchElementException("No element like that");
           }
           return data[end];
      }
      
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
          E[] newArr = (E[])new Object[2*data.length]; 
          for (int i = 0; i < size; i++){
                newArr[i] = data[(start+i) % data.length];
          }
          data = newArr;
          start = 0;
          end = size;
      }
      
      // Return the deque as string in the correct order
      // Ex.:  "[hello, my, dear, friends!]" where hello is the value at start index
      // and friends! is the value at end index
      public String toString(){
            if (size == 0){
                  return "[]";
            }
            String result = "[";
            for (int i = 0; i < size; i++){
                  result += data[(start + i) % data.length];
                  if (i < size-1){
                        )result += ", ";
                  }
            }
            result += "]";
            return result;
      }
    }
