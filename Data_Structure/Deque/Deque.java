public class Deque<T>{
  public Node head;

  public <T> void addFront(T data){
    Node node = new Node();
    node.data = data;

    node.next = head;
    head = node;
  }

  public <T> void addRear(T data){
    Node node  = new Node();
    node.data = data;

    Node n = head;
    while (n.next != null) {
      n = n.next;
    }
    n.next = node;
  }

  public <T> T removeFront(){
    Node<T> n = head;
    head = head.next;
    return n.data;
  }

  public <T> T removeRear(){
    Node<T> n = head;
    Node n1 = null;
    while (n.next != null) {
      n1 = n;
      n = n.next;
    }
    n1.next = null;
    return n.data;
  }

  public int size(){
    Node n = head;
    int count = 0;
    while (n.next != null) {
      n = n.next;
      count++;
    }
    count++;
    return count;
  }

  public boolean isEmpty(){
    Node<T> n = head;
    if (n.next == null) {
      return true;
    }
    else {
      return false;
    }
  }

  public void display(){
    Node n = head;
    while (n.next != null) {
      System.out.print(n.data+" ");
      n = n.next;
    }
    System.out.println(n.data);
  }

}
