package Hash;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<InfoPersona> list = new TreeSet<>(new InfoPersonComparator());
        list.add(new InfoPersona("alex", 14, Sex.MAN));
        list.add(new InfoPersona("alex", 13, Sex.MAN));
        list.add(new InfoPersona("misha", 44, Sex.MAN));
        list.add(new InfoPersona("Anna", 11, Sex.WOMAN));
        list.add(new InfoPersona("robert", 12, Sex.MAN));
        list.add(new InfoPersona("tanya", 10, Sex.WOMAN));
        list.add(new InfoPersona("goga", 14, Sex.MAN));
        list.add(new InfoPersona("pidor", 22, Sex.MAN));

        System.out.println(list.size());
        System.out.println(list);
    }
}
