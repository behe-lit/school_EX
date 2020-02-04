package sec01.exam03;

public class Another {
    String name;
    public Another(String a) {
        this.name = a;
    }

    public static void main(String[] args) {
        Another a = new Another("greenteck");
        Another b = new Another("nelson");

        a = null;

        System.out.println(System.identityHashCode(a));
        System.out.println(b);
        System.out.println(System.identityHashCode(b));
    }

}
