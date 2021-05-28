package DsaAlgo.Matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] arr ){
        List<Integer> nums = new ArrayList<>();

        if(arr.length == 0);

        int rb = 0;                                  //row begin
        int re = arr.length-1;                       //row end
        int cb = 0;                                  //column begin
        int ce = arr[0].length-1;                    //column end

        int size = arr.length * arr[0].length;

        while (nums.size() < size){
        for (int i = cb; i<=ce && nums.size() < size; i++){                          //1->2->3;
            nums.add(arr[rb][i]);                                                    //from left ro rightcorner
        }
        rb++;

        for(int i = rb; i<=re && nums.size() < size; i++){                           //6->9;
            nums.add(arr[i][ce]);                                                    //from rightcorner to bottomright
        }
        ce--;

        for (int i = ce; i>=cb && nums.size() < size; i--){                         //8->7
            nums.add(arr[re][i]);                                                   //from bottomright to bottomleft
        }
        re--;

        for (int i = re; i>=rb && nums.size() < size; i--){                          //4->5
            nums.add(arr[i][cb]);                                                    //from bottomleft to upside
        }
        cb++;
    }
        return nums;
    }
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(a));

    }
}
