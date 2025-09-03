
public class CircularQueue {
    public static class Queue {
        int arr[];
        int size;
        int rear = -1;
        int front = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        
        }
        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is Full.");
                return;
            }
            if(front  == -1) {
                front  = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                return -1;
            }
            int result = arr[front];
            if(rear == front) {
                rear  = front  = -1;
            } else { 
                front  = (front + 1) % size;
            }
            return result;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(10);
        q.add(100);
        q.add(1000);
        q.add(10000);
        q.add(100000);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
