/*Developer: Leo LUJIAYU Instructor: Mr.Daniel Date: Nov. 14th, 2017 APSC
This program enables the user to find the index of the targeted value by using 
binary search.
 */
package javaapplication38;

/**
 *
 * @author leolu
 */
public class LeoBinarySearch {

    /**
     * @param array array
     * @param value targeted value, index to be found
     * @return answer of the index
     */
    public static int binary_search(int[] array, int value){
    
    int min=0;  
    int max=array.length-1;  
    while(min<=max){ 
        int mid=min+(max-min)/2;  
        if(array[mid]>value){  
            max=mid-1;  
        }  
        else if(array[mid]<value){
            min=mid+1;  
        }  
        else{  
            return mid;  
        }  
    }  
    return min;  
}  
    public static void main(String[] args) {
        int[] a={1,2,3,5,7,9,10,25,36,99,100};
        int answer=binary_search(a,25);
        System.out.println(answer);
    }
    
}
