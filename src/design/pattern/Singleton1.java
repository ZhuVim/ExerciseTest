package design.pattern;

public class Singleton1 {
    private Singleton1() {
        // TODO Auto-generated constructor stub
        System.out.println("单例设计，只能初始化一次");
    }

    private static Singleton1 singleton = new Singleton1();

    static public Singleton1 getSingleton() {
        return singleton;
    }
}
