package JavaCommonConcepts;

public class Persion implements Comparable<Persion> {
    public int age;
    public String name;
    public int salary;

    public Persion(int age, String name,int salary) {
        this.age=age;
        this.name= name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Persion o) {
        return Integer.compare(this.age,o.age);
    }
}
