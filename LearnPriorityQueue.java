public class LearnPriorityQueue{
  
 public static void main(String[] args){
  Queue<Integer>  pq = new PriorityQueue<>();           // if we want to implement maxHeap then just put Comparator.reverserOrder() inside priorityQ constructor        
                                                        //  Queue<Integer>  pq = new PriorityQueue<>(Comparator.reverseOrder());     ---> maxheap  
   pq.offer(40);
   pq.offer(12;
   pq.offer(2);
   pq.offer(75);
   
   System.out.prinln(pq);                               // 2, 12, 75, 40       --> this is min_Heap where smaller elemnt will always on top/front
                                                        // 75, 2, 40, 12       --> this is max_Heap where larger element will always on top/front
   
   System.out.prinln(pq.poll());                        // 2 output as minheap
 }
}
