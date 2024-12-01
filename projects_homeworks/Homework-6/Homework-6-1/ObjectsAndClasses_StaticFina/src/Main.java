public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer(Type_CPU.Intel, Type_OZU.DDR4, Type_StorageDevice.SSD);

        System.out.println(computer);

        computer.setTypeCpu(Type_CPU.AMD);
        System.out.println(computer);
    }
}
