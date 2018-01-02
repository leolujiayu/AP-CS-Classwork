/*Developer: Leo LUJIAYU Instructor: Mr.Daniel Date: Nov 25th 2017
This program uses selection sort and insertion sort to sort an unsorted array.
 */
package javaapplication39;

/**
 *
 * @author leolu
 */
import java.util.Arrays;
public class LeoSortAlgorithms {

    /**
     * Selection sorting array
     * @param arr an unsorted array to be sorted
     */
    public static void selection_sort(int[] arr){
        for(int i=0;i<arr.length;i++){
        int incmin=i;
         for(int j=0;j<arr.length;j++){
         if(arr[j]>arr[incmin]){
         int temp=arr[incmin];
         arr[incmin]=arr[j];
         arr[j]=temp;
        }
        }
    }
    for(int a=0; a<arr.length; a++){
    System.out.print(arr[a]+" ");}
        
        
        
    
    }
    public static void selection_sort1(int[] arr){
        for(int j=0;j<arr.length-1;j++){
        int imin=j;
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]<arr[imin])
            {imin=i;}
            
        }
        if(imin!=j){
        int temp=arr[imin];
        arr[imin]=arr[j];
        arr[j]=temp;
        
        }
        
        
        }
        for(int a=0; a<arr.length; a++){
    System.out.print(arr[a]+" ");}
    
    
    
    
    
    }
    
    public static void insertion_sort(int[] a){
        for(int i=1; i<a.length;i++){
            int k=i;
            while(k>0&&a[k-1]>a[k]){
            int temp=a[k];
            a[k]=a[k-1];
            a[k-1]=temp;
            {k=k-1;}
            }
            
            
   
        }
    
    
    
    }
    public static void main(String[] args) {
        int[] a={5,20,1,15,2,7};
        selection_sort1(a);
        insertion_sort(a);
        System.out.println(Arrays.toString(a));
    }
    
}
