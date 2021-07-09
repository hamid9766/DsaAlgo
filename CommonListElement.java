// Statement -- select the common names in both the given list 
// CAN use extra space


import java.util.ArrayList;
import java.util.List;

public class ListQuestion {
    public static List<String> merge(List<String> comment, List<String> like){

        List<String> result = new ArrayList<>();
        int i = 0, j = 0, c = comment.size(), l = like.size();
        while (i<c && j<l){
            String same = comment.get(i);
            if(like.contains(same))
            {   result.add(same);
                j++;
            }
            i++;
        }

        return result;
    }
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        l1.add("hamid");
        l1.add("aman");
        l1.add("rahul");
        l1.add("vivek");
        l1.add("john");

        List<String> l2 = new ArrayList<>();
        l2.add("aman");
        l2.add("mohhit");
        l2.add("john");

        System.out.println(merge(l1,l2));
    }
}
