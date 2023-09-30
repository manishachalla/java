import java.io.*;
public class ExceptionDemo{
    public static void main(String args[]){
        int a[];
        a[]=new int{10,20,40,22,55};
        System.out.println("The array elements are");
        for(int i=0;i<10;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
