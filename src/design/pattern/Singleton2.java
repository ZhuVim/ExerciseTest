package design.pattern;


public class Singleton2 {
    private Singleton2() {
        // TODO Auto-generated constructor stub
        System.out.println("������ƣ�ֻ�ܳ�ʼ��һ��");
    }

    private static Singleton2 singleton = null;

    static public Singleton2 getSingleton() {
        if (singleton == null) {
            singleton = new Singleton2();
        }
        return singleton;
    }
}
