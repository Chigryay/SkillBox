package Hash;

import java.util.Objects;

record InfoPersona(String firstName, int age, Sex isSex) implements Comparable<InfoPersona>{

    @Override
    public String toString() {
        return "InfoPersona{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                ", isSex=" + isSex +
                "}\n";
    }

    @Override
    public int compareTo(InfoPersona infoPersona) {
        return Integer.parseInt(String.valueOf(String.valueOf(this.age).compareTo(String.valueOf(infoPersona.age))));
    }
}
