package Queue;

public class QueueImplementation {
    int front;
    int rear;
    int capacity;
    int queue[];

    QueueImplementation(int size)
    {
        queue = new int[size];
        capacity = size;
        front = 0;
        rear = 0;
    }
    public void enqueue(int data)
    {
        if(rear==capacity)
        {
            System.out.println("Queue is full");
        }
        queue[rear] = data;
        rear++;

    }
    public int dqueue()
    {
        if(front==rear)
        {
            System.out.println("Queue is empty");
            return -1;
        }
        int temp = queue[front];
        for (int i = 0; i < rear-1; i++) {
            queue[i]=queue[i+1];
        }
        rear--;
        return temp;
    }
    public void print()
    {
        for (int i = front; i <rear ; i++) {
            System.out.println(queue[i]);
        }
    }

    //--> [f.......r] -->
    public static void main(String[] args) {
        QueueImplementation que = new QueueImplementation(10);
        que.enqueue(3);
        que.enqueue(78);
        que.enqueue(35);
        que.enqueue(5);
        que.enqueue(2);

        que.print();
        System.out.println(que.dqueue());

    }
}
