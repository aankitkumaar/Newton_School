package Queue;

public class QueueImplementationAnotherWay {
        int front;
        int rear;
        int capacity;
        int queue[];

        QueueImplementationAnotherWay(int size)
        {
            queue = new int[size];
            capacity = size;
            front = 0;
            rear = 0;
        }
        public void enqueueFromfrontside(int data)
        {
            if(rear==capacity)
            {
                System.out.println("Queue is full");
                return;
            }
            for (int i = rear-1; i < front; i--) {
                queue[i+1] = queue[i];
            }
            queue[front] = data;

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
            QueueImplementationAnotherWay que = new Queue.QueueImplementationAnotherWay(10);
            que.enqueueFromfrontside(3);
            que.enqueueFromfrontside(78);
            que.enqueueFromfrontside(35);
            que.enqueueFromfrontside(5);
            que.enqueueFromfrontside(2);

            System.out.println(que);
            //que.print();
           // System.out.println(que.dqueue());

        }
    }
