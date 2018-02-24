package gc.test;

public class GC_cllectOld {
    private static int int_1M = 1024 * 1024;

    public static void main(String[] args) {
        byte[] location = new byte[4 * int_1M];
        System.out.println("run over");
        while (true) {
            byte[] lova = new byte[int_1M];
            System.out.println("while test");
        }
    }
}
