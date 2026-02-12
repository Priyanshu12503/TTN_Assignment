package Q1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FloatingIter {

    static void main(String[] args) {
        List<Float> list = new ArrayList<>();
        list.add(4.6F);
        list.add(7.45F);
        list.add(10.4F);
        list.add(3.1F);
        list.add(1.3F);

        Iterator<Float> itr = list.iterator();

        Double sum = 0.0;
        while(itr.hasNext()){
            double temp = itr.next();
            sum += temp;
        }

        System.out.println("The sum is "+ sum);

    }

}
