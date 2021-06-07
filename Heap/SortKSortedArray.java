package DsaAlgo;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

//sorting the array in O(nlogK) instead of O(nlogN);

public class SortKSortedArray {
    public static void sortKSortedArray(List<Integer> list, int k){

        //making minHeap with 0 to k+1 elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(list.subList(0, k+1));
        int index =0;

        //for k+1 to last element this loop loop will work
        for(int i = k+1; i<list.size(); i++){

            // just changing/set the element which is sorted in k length
            // at initial index and with help of minheap
            list.set(index++, minHeap.poll());

            //after getting 1 element form 0 - k+1
            //we will add next element.
            minHeap.add(list.get(i));
        }

        //for remaining elements
        while(!minHeap.isEmpty()){
            list.set(index++, minHeap.poll());
        }
    }
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 4, 5, 2, 3, 7, 8, 6, 10, 9);
        int k = 2;

        sortKSortedArray(list, k);
        System.out.println(list);
    }
}
