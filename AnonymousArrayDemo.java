public class AnonymousArrayDemo{
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        System.out.println("The array elements are : \n");
        printArray(new int[]{10,60,40,50,70});
    }
}
