
public class E03_OutBoundsException {
    public static void main(String[] args) {
        int i;
        int[] array = { 1, 2, 3, 4 };
        try {
            for (i = 0; i < 5; i++)
                array[i] = i;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }

}
