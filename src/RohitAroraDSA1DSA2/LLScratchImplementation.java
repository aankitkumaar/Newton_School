package BatchMarch;


// java -> ll,stack,queue..

// scratch implementation
//



public class LLScratchImplementation {  // Linked list

    Node head; // help me to store the address of first node
    static int size=0;
    // we will never touch head in our algo


    //  head -----> [Welcome,null]

    // NewNode  -> [Welcome,null]
    public static class Node{
        String data;
        Node next;

        Node(String str){
            this.data=str;
            this.next=null;
            size++;
        }
    }


    // ptr(847654378)---> [Welcome,38746]------>[to,372478678]


    // head->Welcome->to->newton->School->null
    //ptr-------------------^

    public void addLast(Node newNode){
          //newNode---->[School,null]

        if (head == null) {
            head=newNode;
            return;
        }

        Node ptr=head;

        while(ptr.next!=null){
            ptr=ptr.next;
        }

        ptr.next=newNode;

    }


    //// head->Welcome->to->newton->School->null
    //    ptr--------------------------------^
    public void printList(){
        Node ptr=head;

        while(ptr!=null){
            System.out.print(ptr.data+ " -> ");
            ptr=ptr.next;
        }

        System.out.print("null");
    }



   // head=7834687---->  [Welcome,9034] ->  [to,1002] -> [Newton,6756] -> [School,null]


   // newNode=7834687    [Welcome,9034]
    public void addFirst(String str){ // Welcome
        Node newNode=new Node(str);     // newNode--->[Welcome,null]
        newNode.next=head;// // newNode--->[Welcome,9034]
        head=newNode;
       // System.out.println(head.data);
    }

    public int getSize(){
        return size;
    }


    // head=9034- ->  [to,1002] -> [Newton,6756] -> [School,null]
    //[Welcome,9034]
    public void removeFirst(){
        if(head==null){
            System.out.println("nothig is there to delete, list is empty");
            return;
        }
        head=head.next;
        size--;
    }
// [to,1002] -> [Newton,null] ->  --> null
    public void removeLast(){
        if(head==null){
            System.out.println("nothing is there to delete, list is empty");
            return;
        }
        size--;

        if(head.next==null){
            head=null;
            return;
        }

        Node ptr=head;
        while(ptr.next.next!=null){
            ptr=ptr.next;
        }
        ptr.next=null;
    }
    //  5 6-> newnode ->7 8 9

    // 1->2->3->4->5->6->rohit->7->8->9->10
    // 0  1  2  3  4  5  6  7  8   9  10
//                    c  n

    //index=6
    //      newnode-> rohit


    // curr->6
    // next->7

    //new->rohit
    public void addSomeWhere(int index, String data){
        if(index<0 || index>size){
            System.out.println("Not a valid position to add the element");
            return;
        }

        Node newNode=new Node(data);// [rohit,null] // size++

        if(index==0){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node curr=head;


        //  1 2 3 4->rohit->5 6 7   size=7
        //  0 1 2 3 4 5 6
        //        c n
        //  rohit-> 4   3
        // [rohit,null]  size=8

        for(int i=0;i<size-1;i++){
            if(i==index-1){
                Node nextNode=curr.next;
                curr.next=newNode;
                newNode.next=nextNode;
                break;
            }
            curr=curr.next;
        }

    }

    // 5 6 7->t-> 8 9

    // newNode.next=curr.next;
    //curr.next=newNode


    // head->1->2->3->4->5->null
    public void deleteMiddle(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        System.out.println(count);

        if(count==1){
            head=null;
            return;
        }


        temp=head;
        int middle=count/2;

        for(int i=0;i<middle-1;i++){
            temp=temp.next;
        }

        temp.next=temp.next.next;
    }


    public String kthNodeFromLast(int k){
        Node ptr1=head;
        Node ptr2=head;

        int count=0;

        if(head==null){
            System.out.println("No nodes are there");
            return "";
        }


        //  Rohit -> Mr. Kunal  -> Welcome ->  Newton ->  School -> null
        //   p1                       p2
        while(count<k){
            if(ptr2==null){
                System.out.println("No of elements lesser than k");
                return "";
            }
            ptr2=ptr2.next;
            count++;
        }

        if(ptr2==null){
            return head.data;
        }

        while(ptr2!=null){
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }

        return ptr1.data;

    }

    public void makeCircular(){
        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=head;
    }

    public boolean detectCircular(){

        if(head==null)
            return false;

       Node temp=head.next;

       while(temp!=null && temp!=head){
           temp=temp.next;
       }

       if(temp==head){
           return true;
       }

       else{
           return false;
       }
    }

    public void addElementAtLastOfCircularList(String data){
        Node newNode=new Node(data);

        Node node=head;
        while(node.next!=head){
            node=node.next;
        }

        node.next=newNode;
        newNode.next=head;
    }

    public void printCircularList(){
        Node ptr=head;

        while(ptr.next!=head){
            System.out.print(ptr.data+ " -> ");
            ptr=ptr.next;
        }

        System.out.print(ptr.data);
        System.out.print("->"+ ptr.next.data);
    }


    public boolean detectCycle(){

        Node slow=head;
        Node fast=head;

        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;//1 step
            fast=fast.next.next;//2 steps
            if(slow==fast){
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        LLScratchImplementation list=new LLScratchImplementation();

        Node newNode1=new Node(" Shubham, ");
        list.addLast(newNode1);
        Node newNode2=new Node(" Welcome");
        list.addLast(newNode2);
        Node newNode3=new Node("to");
        list.addLast(newNode3);
        Node newNode4=new Node("Newton");
        list.addLast(newNode4);
        Node newNode5=new Node("School");
        list.addLast(newNode5);

        newNode5.next=newNode3;

      //  list.printList();

       // System.out.println();
      //  list.addFirst("Welcome");
      //  list.addFirst("Mr. Kunal ");
    //    list.printList();


//        System.out.println();
//        System.out.println(list.getSize());
//
//        System.out.println();
//        list.removeFirst();
//        System.out.println(list.getSize());
//        list.printList();

//        System.out.println();
//        list.removeLast();
//        list.printList();

      //  System.out.println();
      //  list.addSomeWhere(0,"Rohit");
       // list.printList();

       // list.deleteMiddle();    //  1 2  4 5 6

       // list.printList();
      //  System.out.println();
        //System.out.println(list.detectCircular()); // false
       // list.makeCircular();
       // System.out.println(list.detectCircular()); // true
       // list.printList();

       // list.printCircularList();
       // System.out.println();
       // list.addElementAtLastOfCircularList("Ishrat");
       // list.printCircularList();

        System.out.println();
        System.out.println(list.detectCycle());



        //int k=4;
        //System.out.println();
        //System.out.println(list.kthNodeFromLast(k));
    }

     //    create circular - done
    //      detect circular - done
    //    add element at last of circular linked list  -done
    //print circular linked list -done

    // detect if cycle is there or not -- done
    // tell the point where the cycle is

}
