package dto;


public class SeniorEmployee {
    private String name;
    int age;
    public SeniorEmployee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
}
