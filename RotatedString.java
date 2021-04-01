package DsaAlgo;
//String-60

public class RotatedString {
    static boolean isRotated(String s1, String s2){/*
        return (s1.length()==s2.length()) &&
                ((s1+s1).indexOf(s2) !=-1);*/
        s1= s1+s2;
        if(s1.contains(s2))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isRotated("ABCD","CDxAB"));

    }
}
