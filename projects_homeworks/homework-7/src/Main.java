public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < Character.MAX_VALUE; i++) {
            System.out.println(i + " - " + (char) i);
        }

        int numberA = 0;
        int numberB= 0;
        int numberYO = 0;
        int numberYOU = 0;
        for (int i = 0; i < Character.MAX_VALUE; i++) {
            numberA = (char) i == 'А' ?
                   i :
                   numberA;
            numberB = (char) i == 'я' ?
                    i :
                    numberB;
            numberYO = (char) i == 'ё' ?
                    i :
                    numberYO;
            numberYOU = (char) i == 'Ё' ?
                    i :
                    numberYOU;
        }
        for (int i = numberA; i <= numberB; i++) {
            System.out.println((char) i);
            System.out.println((char) numberYO + "\n" + (char) numberYOU);
        }
    }
}
