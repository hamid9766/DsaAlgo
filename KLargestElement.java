import java.util.PriorityQueue;

public class KLargestElement {
    public static void kElements(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i =0; i<arr.length; i++){
            if (i<k){
                pq.add(arr[i]);
            }
            else {
                if (arr[i]>pq.peek()){
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }
        while (pq.size() > 0){
            System.out.println(pq.remove());
        }

    }
    public static void main(String[] args) {
        kElements(new int[]{1,20,4,15,6,4,30}, 3);
    }
}
