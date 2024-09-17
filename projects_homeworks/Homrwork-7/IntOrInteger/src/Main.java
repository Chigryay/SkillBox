public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        for (int i = 0; i < (int)Character.MAX_VALUE; i++) {
            if ((char) i == 'Ё' || (char) i == 'ё' ) {
                System.out.println(i + " - " + (char)i);
            }
            if (i >= 1040 && i <= 1103)
                System.out.println(i + " - " + (char)i);
        }

    }
}
