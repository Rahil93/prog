public class Queue<T>{
  public Node head;

  public void queue(){
    head = null;
  }

  public <T> void enqueue(T data){
    Node node = new Node();
    node.data = data;
    node.next = null;

    if (head == null) {
      head = node;
    }
    else{
      Node n = head;
      while (n == head) {
        node.next = head;
        head = node;
      }
    }
  }

  public <T> T dequeue(){
    Node<T> n = head;
    Node n1 = null;
    while (n.next != null) {
      n1 = n;
      n = n.next;
    }
    n1.next = null;
    return n.data;
  }

  public boolean isEmpty(){
    Node<T> n = head;
    if (n == null) {
      return true;
    }
    else {
      return false;
    }
  }

  public int size(){
    Node n = head;
    int count = 0;
    while (n.next != null) {
      count++;
      n = n.next;
    }
    count++;
    return count;
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
