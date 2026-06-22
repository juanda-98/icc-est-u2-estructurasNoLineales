package models;

public class Persona implements Comparable<Persona>{
    private String name;
    private int age;

    public Persona() {
    }
    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Persona [name=" + name + ", age=" + age + "]";
    }
    @Override
    public int compareTo(Persona o) {
        int compAge = Integer.compare(this.age, o.getAge());
        
        if(compAge != 0) 
            return compAge;
            
        int compName = this.name.compareTo(o.getName());
        return compName;
        
    }
    
}
