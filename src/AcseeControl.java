import java.util.HashMap;
import java.util.Map;

import debug.TestSameClass;

public class AcseeControl {
    public static void main(String[] args) {
        TestSameClass testSameClass = new TestSameClass();
        testSameClass.debug();
        Map<String, Object> map = new HashMap<String, Object>();
        int a = 3;
        map.put("int", a);
        int b = (int) map.get("int");
        System.out.println(b);
    }
}
