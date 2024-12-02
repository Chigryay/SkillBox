public class Computer {
    private Type_CPU typeCpu;
    private Type_OZU typeOzu;
    private Type_StorageDevice typeStorageDevice;

    public Computer(Type_CPU typeCpu, Type_OZU typeOzu, Type_StorageDevice typeStorageDevice) {
        this.typeCpu = typeCpu;
        this.typeOzu = typeOzu;
        this.typeStorageDevice = typeStorageDevice;
    }

    public Type_CPU getTypeCpu() {
        return typeCpu;
    }

    public void setTypeCpu(Type_CPU typeCpu) {
        this.typeCpu = typeCpu;
    }

    public Type_OZU getTypeOzu() {
        return typeOzu;
    }

    public void setTypeOzu(Type_OZU typeOzu) {
        this.typeOzu = typeOzu;
    }

    public Type_StorageDevice getTypeStorageDevice() {
        return typeStorageDevice;
    }

    public void setTypeStorageDevice(Type_StorageDevice typeStorageDevice) {
        this.typeStorageDevice = typeStorageDevice;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "typeCpu=" + typeCpu +
                ", typeOzu=" + typeOzu +
                ", typeStorageDevice=" + typeStorageDevice +
                '}';
    }
}
