package LinkedList;

public class LL {
    private Node head;
    private Node tail;


    private int size;
    public LL(){

        this.size=0;
    }
    public class Node{
        private int value;
        private Node next;

        public Node(int value){

            this.value=value;
        }
        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }

    public void insertFirst(int val)
    {
        Node node = new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value +"->");
            temp=temp.next;
        }
        System.out.printf("End \n");
    }

    public void insertLast(int val){
        Node node =new Node(val);
        if(tail==null){
             insertFirst(val);
             return;
        }
        tail.next=node;
        tail=node;
    }
    public  void  insert(int val , int index){
        if(index==1){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp =head;
        for(int i=1; i<index;i++){
            temp=temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next=node;
        size++;

    }
    void deleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        System.out.printf( "\n"   + "The removed value is :" +val);
    }
     public void deleteLast(){
           if(size<=1){
               deleteFirst();
           }
           Node secondLast = get(size-2);
           int val=tail.value;
           tail=secondLast;
           tail.next=null;
         System.out.printf(" \n The value deleted is " +val+ "\n");
    }
    void delete(int index){
     if(index==1){
         deleteFirst();
         return;
     }
     if(index==size){
         deleteLast();
         return;
     }
     Node prev = get(index-1);
     int val =prev.next.value;
     prev.next=prev.next.next;
     System.out.printf("The deleted value is "+val+"\n");
    }

    public Node get(int index){
        Node node =head;
        for(int i =0; i< index;i++){
            node=node.next;
        }
        return node;
    }
}
