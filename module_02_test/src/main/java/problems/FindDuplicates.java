package problems;


public class FindDuplicates {

    /**
     * Write Code To Filter Duplicate Elements From An Array?
     * */


    public static void main(String[] args) {
    	 int[] arr={1,2,4,6,7,4,5,9,1,4,6,7,6};
         for(int i=0;i<arr.length-1;i++)
         {
             for(int j=i+1;j<arr.length;j++)
             {
                 if(arr[i]==arr[j])
                 {
                      System.out.println("The Duplicate Element is : "+arr[j]);
                 }

             }
         }
    }
}