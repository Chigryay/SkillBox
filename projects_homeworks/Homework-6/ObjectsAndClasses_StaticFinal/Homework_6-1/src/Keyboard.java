record Keyboard(TypeKeyboard typeKeyboard, double weight) {
    @Override
    public String toString() {
        return "typeKeyboard=" + typeKeyboard +
                ", weight=" + weight;
    }
}
enum TypeKeyboard {
    RUBBER,
    MEMBRANE
}
