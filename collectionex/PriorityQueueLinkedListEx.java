package collectionex;



import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

 

public class PriorityQueueLinkedListEx {

 

    public static void main(String[] args) {
        
        //priorityQueue has element will sort elements priority wise
        //it uses comparable interface compareTo method for deciding the priority of elements added
        Queue<String> q = new PriorityQueue<String>();
        
        q.offer("aman");
        q.offer("Monkey");
        q.offer("Vaibhav");
        q.offer("Sisodia");
        
        //peek returns ele at mouth of queue but doesnt remove it.
        //poll returns ele at moth of queue but also remove it from mouth of queue so that
        // next element then moves in to mouth
        System.out.println(q.size());
        System.out.println("peek:"+q.peek());
        System.out.println(q.size());
        
        System.out.println("poll:"+q.poll());
        System.out.println(q.size());
        
        System.out.println("poll:"+q.poll());
        System.out.println(q.size());
        
        
        //LinkedList - FIFO structure
        System.out.println("output from LinkedList implementation of Queue interface:");
        q = new LinkedList<String>();
        
        q.offer("Sonali");
        q.offer("Utkarsh");
        
        //peek returns ele at mouth of queue but doesnt remove it.
        //poll returns ele at moth of queue but also remove it from mouth of queue so that
        // next element then moves in to mouth
        System.out.println(q.size());
        System.out.println("peek:"+q.peek());
        System.out.println(q.size());
        
        System.out.println("poll:"+q.poll());
        System.out.println(q.size());
        
        System.out.println("poll:"+q.poll());
        System.out.println(q.size());
        
    }

 

}