package models;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    private String name;
    private String address;
    private String phone;
    private String email;
    private List<Pet> pets;

    public Owner(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.pets = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void removePet(int petId) {
        pets.removeIf(pet -> pet.getId() == petId);
    }

    public List<Pet> getPets() {
        return pets;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", pets=" + pets +
                '}';
    }
}
