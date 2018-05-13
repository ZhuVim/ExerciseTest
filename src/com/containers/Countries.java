package com.containers;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Countries {
    public static final String[][] DATA = { { "AWEF", "ALAWAWIJ" }, { "ASDWQE", "SASDF" },
            { "BWEF", "BLAWAWIJ" }, { "BSDWQE", "BASDF" }, { "CWEF", "CLAWAWIJ" },
            { "CSDWQE", "CASDF" }, { "DWEF", "DLAWAWIJ" }, { "DSDWQE", "DASDF" },
            { "EWEF", "ELAWAWIJ" }, { "ESDWQE", "EASDF" }, { "FWEF", "FLAWAWIJ" },
            { "FSDWQE", "FASDF" }, { "GWEF", "GLAWAWIJ" }, { "GSDWQE", "GASDF" },
            { "HWEF", "HLAWAWIJ" }, { "HSDWQE", "HASDF" }, { "IWEF", "ILAWAWIJ" },
            { "ISDWQE", "IASDF" }, { "JWEF", "JLAWAWIJ" }, { "JSDWQE", "JASDF" },
            { "KWEF", "KLAWAWIJ" }, { "KSDWQE", "KASDF" }, { "LWEF", "LLAWAWIJ" },
            { "LSDWQE", "LASDF" }, { "MWEF", "MLAWAWIJ" }, { "MSDWQE", "MASDF" },

    };

    public static Set<String> namSet(int index) throws Exception {
        Set<String> names = new TreeSet<String>();
        if (index >= DATA.length) {
            throw new Exception("parament exception");
        }
        for (int i = 0; i < index; i++) {
            names.add(DATA[i][0]);
        }
        return names;
    }

    public static void namList(int index, List<String> name) throws Exception {

        if (index >= DATA.length) {
            throw new Exception("parament exception");
        }
        for (int i = 0; i < index; i++) {
            name.add(DATA[index][0]);
        }

    }

    public static Map<String, String> namesMap(int index) throws Exception {
        Map<String, String> map = new HashMap<String, String>();
        if (index >= DATA.length) {
            throw new Exception("parament exception");
        }
        for (int i = 0; i < index; i++) {
            map.put(DATA[i][0], DATA[i][1]);
        }
        return map;
    }

    private static class FlyweighMap extends AbstractMap<String, String> {
        private static class Entry implements Map.Entry<String, String> {
            int index;

            Entry(int index) {
                // TODO Auto-generated constructor stub
                this.index = index;
            }

            public boolean equals(Object o) {
                return DATA[index][0].equals(o);
            }

            public String getKey() {
                return DATA[index][0];
            }

            public String getValue() {
                return DATA[index][1];
            }

            public int hashCode() {
                return DATA[index][0].hashCode();
            }

            @Override
            public String setValue(String value) {
                // TODO Auto-generated method stub
                return null;
            }
        }

        @Override
        public Set<java.util.Map.Entry<String, String>> entrySet() {
            // TODO Auto-generated method stub
            return null;
        }
    }
}
