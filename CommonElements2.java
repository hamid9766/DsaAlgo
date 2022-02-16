import java.util.HashMap;

public class CommonElements2 {

    public static void main(String[] args) {

        int[] arr1= new int[]{1,1,2,2,2,3,5};
        int[] arr2 = new int[]{1,1,1,2,2,4,5};


        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val : arr1){
            map.put(val, map.getOrDefault(val, 1));
        }


        for (int j : arr2){
            if(map.containsKey(j) && map.get(j)>0) {
                System.out.println(j);
                map.put(j, map.get(j) - 1);
            }
        }
    }
}
