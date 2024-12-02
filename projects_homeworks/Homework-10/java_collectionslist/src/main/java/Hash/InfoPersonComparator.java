package Hash;

import java.util.Comparator;

public class InfoPersonComparator implements Comparator<InfoPersona> {

    @Override
    public int compare(InfoPersona o1, InfoPersona o2) {
        return Integer.parseInt(String.valueOf(String.valueOf(o1.age()).compareTo(String.valueOf(o2.age()))));
    }
}
