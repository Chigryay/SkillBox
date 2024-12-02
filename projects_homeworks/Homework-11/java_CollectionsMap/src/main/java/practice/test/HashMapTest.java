package practice.test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Clients, String> clientMap = new TreeMap<>(new ClientComparator());
        clientMap.put(new Clients(3, "Bob"), "Cat");
        clientMap.put(new Clients(2, "Alex"), "Cat");
        clientMap.put(new Clients(1, "Tanya"), "Cat");
        clientMap.put(new Clients(4, "John"), "Cat");
        clientMap.forEach((k, v) -> System.out.println(k + ", " + v));

    }

}
record Clients(int id, String name)  {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clients clients = (Clients) o;
        return id == clients.id && Objects.equals(name, clients.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
class ClientComparator implements Comparator<Clients> {


    @Override
    public int compare(Clients o1, Clients o2) {
        return o1.name().compareTo(o2.name());
    }
}
