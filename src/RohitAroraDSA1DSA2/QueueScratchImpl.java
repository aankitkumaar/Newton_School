package BatchMarch;

public class QueueScratchImpl {

    int front;
    int rear;
    int capacity;
    int queue[];
    QueueScratchImpl(int size){
        queue=new int[size];
        capacity=size;
        front=0;
        rear=0;
    }

    public void enqueue(int data){
        if(rear==capacity){
            System.out.println("Queue is full");
            return;
        }
        queue[rear]=data;
        rear++;
    }
    public void enqueueFromFrontSide(int data){

        if(rear==capacity){
            System.out.println("Queue is full");
            return;
        }

        for(int i=rear-1;i>=front;i--){
            queue[i+1]=queue[i];
        }

        queue[front]=data;

        rear++;


    }

    public void print(){

        for(int i=front;i<rear;i++){
            System.out.print(queue[i]+ " ");
        }

        System.out.println();
    }

    public int dequeue(){
        if(front==rear){
            System.out.println("Queue is empty");
            return -1;
        }

        int deqElement=queue[front];

        for(int i=0;i<rear-1;i++){
            queue[i]=queue[i+1];
        }

        rear--;

        return deqElement;

    }

    public int dequeueFromRearSide(){

        if(front==rear){
            System.out.println("Queue is empty");
            return -1;
        }

        int dequeueEle=queue[rear-1];
        rear--;
        return dequeueEle;

    }


    public static void main(String[] args) {
        QueueScratchImpl que=new QueueScratchImpl(10);
        que.enqueueFromFrontSide(3);
        que.enqueueFromFrontSide(78);
        que.enqueueFromFrontSide(35);
        que.enqueueFromFrontSide(2);

        que.print();

        System.out.println(que.dequeueFromRearSide());

        que.print();

        System.out.println(que.dequeueFromRearSide());

        que.print();
    }



}
