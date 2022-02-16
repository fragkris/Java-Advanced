package groomingSalon;
//created by J.M.

import java.util.*;

public class GroomingSalon {

    private List<Pet> data;
    private int capacity;

    public GroomingSalon(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Pet pet) {
        if (data.size() < capacity) {
            this.data.add(pet);
        }
    }

    public boolean remove(String name) {
        return this.data.removeIf(pet -> pet.getName().equals(name));
    }

    public Pet getPet(String name, String owner) {
        return data.stream().filter(e -> e.getName().equals(name) && e.getOwner().equals(owner)).findFirst().orElse(null);
    }

    public Pet getOldestPet() {
        return this.data.stream().min((p1, p2) -> Integer.compare(p2.getAge(), p1.getAge())).orElse(null);
    }

    public int getCount() {
        return this.data.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append("The grooming salon has the following clients:\n");
        data.forEach(e -> sb.append((e.getName() + " " + e.getOwner() + "\n")));
        return sb.toString();
    }

    public List<Pet> getData() {
        return data;
    }

    public void setData(List<Pet> data) {
        this.data = data;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}