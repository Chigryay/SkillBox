public class Customer {
    private final String name;
    private final String phone;
<<<<<<< HEAD
=======

    private final String email;
>>>>>>> a255d836086bf4fcfb02663b17a52b6a3165b24c

    private final String email;
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public Customer(String name, String phone, String email) {
        this.phone = phone;
        this.name = name;
        this.email = email;
    }

    public String toString() {
        return name + " - " + email + " - " + phone;
    }
}
