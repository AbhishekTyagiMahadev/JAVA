public class Queue_Class {
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;

        Queue(int size){
            arr = new int[size];
            this.size = size;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        public static void add(int data){
            if(rear == size-1 ){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] =  data;
        }
    }
}
