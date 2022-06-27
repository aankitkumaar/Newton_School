package BatchMarch;

public class DLLScratchImplementation {

    NodeDLL head;
    static int size=0;


    static class NodeDLL{
        int data;
        NodeDLL next;
        NodeDLL prev;

        NodeDLL(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
            size++;
        }
    }


       //  head->[null,3,null]
    //   head->[null,4,43555]->[9087,3,null]
    public void addFirst(NodeDLL newNode){
        newNode.next=head;// prev =null


        if(head!=null){
            head.prev=newNode;
        }


        head=newNode;
    }

    public void printIt(){
        NodeDLL ptr=head;
        System.out.print("null");
        while(ptr!=null){
            System.out.print("<- "+ ptr.data +  " ->");
            ptr=ptr.next;
        }
        System.out.println("null");
    }


    // null-6-5-4-3-null
    public void addNodeAfterGivenNode(NodeDLL prev,int data){
        NodeDLL newNode=new NodeDLL(data);

        if(prev==null){
            System.out.println("Wrong prev reference");
            return;
        }

        newNode.next=prev.next;
        prev.next=newNode;
        newNode.prev=prev;

        if(newNode.next!=null){
            newNode.next.prev=newNode;
        }


    }

    public void addLast(int data){
        NodeDLL newNode=new NodeDLL(data);
        NodeDLL ptr=head;

        if(head==null){
            head=newNode;
            return;
        }

        while(ptr.next!=null){
            ptr=ptr.next;
        }

        ptr.next=newNode;
        newNode.prev=ptr;

    }

    public int getSize()
    {
        return size;
    }

    public void deleteNode(NodeDLL node){
        if(node==null){
            System.out.println("Wrong node reference");
            return; // come out of the function
        }

        if(head==node){
            head=node.next;
        }

        if(node.next!=null)
        node.next.prev=node.prev;

        if(node.prev!=null)
        node.prev.next=node.next;

        size--;

    }

    public static void main(String[] args) {
        DLLScratchImplementation list=new DLLScratchImplementation();

        NodeDLL newNode1=new NodeDLL(3);
        list.addFirst(newNode1);

        NodeDLL newNode2=new NodeDLL(4);
        list.addFirst(newNode2);

        NodeDLL newNode3=new NodeDLL(5);
        list.addFirst(newNode3);

        NodeDLL newNode4=new NodeDLL(6);
        list.addFirst(newNode4);

        list.printIt();

        list.addNodeAfterGivenNode(newNode2,7);
        list.addNodeAfterGivenNode(newNode1,8);
       // list.addNodeAfterGivenNode(null,9);
        list.printIt();


        list.addLast(9);
        list.addLast(10);
        list.printIt();

        System.out.println(list.getSize());

        list.deleteNode(newNode1);
        list.printIt();
        System.out.println(list.getSize());
    }
}
