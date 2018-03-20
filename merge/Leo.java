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
public class Leo {

    public static void main(String[] args) {
        List<Integer>h=new ArrayList();
	h.add(50);
	h.add(20);
	h.add(40);
        h.add(15);
	intset b;
        
        b=new intset((List<Integer>)h);
        
	List<Integer> x=(List<Integer>)b.merge(h);
        
	b.print();
	
	System.out.println("size is "+b.getintsize());
	System.out.println(b.boolelement(5));
	}



}
