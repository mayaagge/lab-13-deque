public class Driver{
  public static void main(String[] args){
    MyDeque<String> deque = new MyDeque<>();
    System.out.println("Initial deque: " + deque.toString());
    System.out.println("Size: " + deque.size());
    deque.addFirst("there");
    deque.addFirst("hi");
    System.out.println("After addFirst x2: " + deque.toString());  
    deque.addLast("!");
    System.out.println("After addLast: " + deque.toString());      
    System.out.println("First: " + deque.getFirst());   
    System.out.println("Last: " + deque.getLast());     
    System.out.println("Removed first: " + deque.removeFirst()); 
    System.out.println("After removeFirst: " + deque.toString());            
    System.out.println("Removed last: " + deque.removeLast());    
    System.out.println("After removeLast: " + deque.toString());           
    deque.addFirst("bye");
    deque.addLast("this");
    deque.addLast("is");
    deque.addLast("not");
    deque.addLast("working");
    deque.addLast("anymore");
    System.out.println("After more adds: " + deque.toString());
    System.out.println("Size: " + deque.size());
    while (deque.size() > 0) {
       System.out.println("Removing: " + deque.removeFirst());
    }
    System.out.println("Deque after emptying: " + deque.toString());
    try {
       deque.removeFirst();
    } catch (Exception e) {
       System.out.println("removeFirst exception: " + e);
    }
    try {
       deque.getLast();
    } catch (Exception e) {
    System.out.println("getLast exception: " + e);
    }
  }
}
