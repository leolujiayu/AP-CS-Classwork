/*Developer: Leo LUJIAYU Instructor: Mr. Daniel Date: Oct 25th, 2017
This program helps sort the numbers in ascending order.
 */
package javaapplication28;

/**
 *
 * @author leolu
 */

public class LeoMergerSort {  
      
    public static void MergeSort(int[] A,int p,int q,int r){  
          
        int[] tmp=new int[r-p+1];
        int i=p;   
        int j=q+1; 
        int k=0;        
        while(i<=q&&j<=r){  
            if(A[i]<=A[j]){                  
                tmp[k++]=A[i++];  
            }  
            else{                 
                tmp[k++]=A[j++];  
            }  
        }  
        while(i<=q){             
            tmp[k++]=A[i++];  
        }  
        while(j<=r){             
            tmp[k++]=A[j++];  
        }  
        for(int k2=0;k2<tmp.length;k2++){              
            A[k2+p]=tmp[k2];   
        }  
    }  
    public static void Mergesort(int[] A,int p,int r){  
          
        int q=(p+r)/2;  
        if(p<r){         
            Mergesort(A,p,q);  
            Mergesort(A,q + 1,r);  
            MergeSort(A,p,q,r);  
        }   
    }  
    public static void main(String[] args) {  
        
        
        int[] A = {1,3,2,5,4,1,6,4,7,5,8,9,0};  
        System.out.println("original array： ");  
        for(int i=0;i<A.length;i++){  
              
            System.out.print(A[i] + " ");  
        }  
        System.out.println();  
        Mergesort(A,0,A.length -1);  
        System.out.println("result： ");  
        for(int i=0;i<A.length;i++){  
              
            System.out.print(A[i] + " ");  
        }  
    }  
  
}  