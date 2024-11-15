package entities;

import java.util.List;

public class Customer {

    private long id;
    private String name;
    private String email;
    private String address;

    private List<Order> orders;

    public Customer() {
    }

    public Customer(long id, String name, String email, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public void updateProfile(String name, String email) {
        if (!name.isBlank() && !email.isBlank()) {
            this.name = name;
            this.email = email;
            return;
        }

        System.err.println("Invalid credentials.");
    }

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
