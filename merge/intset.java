/*Developer: Leo Instructor: Mr.Daniel Date: March 20th, 2018
This program is an application of merge interface
 */
package merge;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author leolu
 */
public class intset implements merge {
    
  
	
    public List<Integer> k;
    
    
    
    
    public intset(List<Integer> j) {
        k=j;
//	this.k=new ArrayList<Integer> (j);
    }
	
    
    
    
    public Object merge(Object x) {
    ArrayList<Integer> d=new ArrayList();
    
    d.addAll(k);
    
    d.addAll((Collection<? extends Integer>)x);
    return d;
	}
 
	
    
    
    
    public int getintsize() {
    return k.size();
	}
	
    
    
    
    public boolean boolelement(int x) {
    
        for(int i=0;i<k.size();i++) {
	if ((int)k.get(i)==x) {
	return true;
	}
        else{return false;}
	}
	return false; 
	}

    
    
    public void print() {
    for (int i=0;i<k.size();i++){
    System.out.println(k.get(i));
}	
	}
	

}
