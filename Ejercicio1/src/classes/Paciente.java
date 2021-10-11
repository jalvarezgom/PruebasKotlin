package classes;

public class Paciente {
    private String dni;
    private String name;
    private int age;
    private int weight;
    //...



    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

}
