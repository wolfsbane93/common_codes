package JavaCommonConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableComparatorPractice {

    public static void main(String[] args) {
        Persion p1 =new Persion(31,"Souradeep", 2500000);
        Persion p2 =new Persion(30,"demo1", 2500000);
        Persion p3 =new Persion(70,"demo2", 230000);
        List<Persion> pl = new ArrayList<>();
        pl.add(p1);
        pl.add(p2);
        pl.add(p3);
        Collections.sort(pl);
        pl.forEach(x-> System.out.println(x.name));
        Collections.sort(pl, new NameComparator());
        pl.forEach(x-> System.out.println(x.name));

    }


}
