package DsaAlgo;

public class NegNumber {
    public static void main(String[] args){
        int[] a = {-12,11,-5,-7,6,2,-8};
        int n = a.length;
        int temp, j=0;
        for (int i =0; i<n; i++){

            if (a[i]<0){
                temp =a[i];
                a[i] =a[j];
                a[j] = temp;
                 j++;
            }
        }
        for (int b : a){
            System.out.print(b + " ");
        }
    }
}
