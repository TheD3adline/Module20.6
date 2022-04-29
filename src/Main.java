import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {                    //There are 2 types of queues, the regular queue functions just like the name suggested. If a data point is saved in the structure it will be
                                                                //put into a queue, and the first data point to be saved will be the first called on.
        Queue<String> iceQueue = new LinkedList<String>();
        iceQueue.offer("Michael");                          //.offer to add a data point to the queue. !!! Queue is not a class but an interface, it needs a LinkedList as actual object.
        iceQueue.offer("Jens");
        iceQueue.offer("Rita");
        iceQueue.offer("Lisa");

        System.out.println(iceQueue.peek());                    //.peek to call the data point that is next in queue

        System.out.println();

        while(!iceQueue.isEmpty()) {
            System.out.println(iceQueue.poll());                //.poll to remove the data point that is next in queue
        }

        System.out.println("-----------------------------------------");

        PriorityQueue<String> queueTest = new PriorityQueue<String>();      //PriorityQueue is an actual class now, it's a queue that allows customization of release order via Comparable interface of the stored data types
        queueTest.offer("Zannah");                                      //With the data type String it does so alphabetically
        queueTest.offer("Quasimodo");
        queueTest.offer("Ignaz");
        queueTest.offer("Anton");

        while(!queueTest.isEmpty()) {
            System.out.println(queueTest.poll());
        }
    }
}