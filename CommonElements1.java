import java.util.HashMap;

public class CommonElements1 {
    public static void repeatingElements(int[] arr1, int[] arr2){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr1){
            if(map.containsKey(i))
                map.put(i,map.get(i));
            else
                map.put(i, 1);
        }


        for (int j : arr2){
            if(map.containsKey(j))
                System.out.println(j);
                map.remove(j);
        }
    }
    public static void main(String[] args) {
        repeatingElements(new int[]{1,1,2,2,2,3,5}, new int[]{1,1,1,2,2,4,5});
    }
}
