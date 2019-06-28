public class Stack<T>{
  public Node head;

  public void stack(){
    head = null;
  }

  public <T> void push(T data){
    Node node = new Node();
    node.data = data;
    node.next = null;

    if (head == null) {
      head = node;
    }
    else {
      Node n = head;
      if (n == head) {
        node.next = head;
        head = node;
      }
    }
  }

  public <T> T pop(){
    Node<T> n = head;
    head = head.next;
    return n.data;
  }

  public <T> T peek(){
    Node<T> n =head;
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
      n = n.next;
      count++;
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
