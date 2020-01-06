package problems;

public class InvertString {

    /**
     * Invert a String without using String default reverse() method
     *
     * */


    public static void main(String[] args) {
        InvertString obj1=new InvertString();
       String a= obj1.reverse("unitedstates");
        System.out.println(a);
    }
        public static String reverse(String input){
            char[] in = input.toCharArray();
        int begin=0;
        int end=in.length-1;
        char temp;
        while(end>begin){
            temp = in[begin];
            in[begin]=in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }

    }
