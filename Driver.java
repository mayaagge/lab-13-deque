public class Driver{
  public static void main(String[] args){
    MyDeque<String> deque = new MyDeque<>();
    MyDeque<String> deque1 = new MyDeque<>(2);
    System.out.println("Initial deque: " + deque.toString());
    System.out.println("Size: " + deque.size());
    deque.addFirst("there");
    deque.addFirst("hi");
    System.out.println("After addFirst: " + deque.toString());  
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
    deque.addLast("going");
    deque.addLast("right");
    deque.addLast("now");
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
       deque.getFirst();
    } catch (Exception e) {
       System.out.println("getFirst exception: " + e);
    }
    try {
       deque.removeLast();
    } catch (Exception e) {
       System.out.println("removeLast exception: " + e);
    }
    try {
       deque.getLast();
    } catch (Exception e) {
    System.out.println("getLast exception: " + e);
    }
    try {
       deque.addFirst(null);
    } catch (Exception e) {
       System.out.println("addFirst exception: " + e);
    }
    try {
       deque.addLast(null);
    } catch (Exception e) {
       System.out.println("addLast exception: " + e);
    }
    deque1.addFirst("go");
    deque1.addLast("away");
    deque1.addFirst("Size changer");
    System.out.println("Check resize after adding 2 elements to deque with capacity 2: " + deque1.toString());
  }
}
