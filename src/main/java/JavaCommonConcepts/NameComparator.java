package JavaCommonConcepts;

import java.util.Comparator;

public class NameComparator implements Comparator<Persion>{


    @Override
    public int compare(Persion o1, Persion o2) {
        return o1.name.compareTo(o2.name);
    }
}
