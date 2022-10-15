package mouse;

public class Mouse {
    private  String name;
    private  int age;

    public void Mosss (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public  void  setName(){
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public  void  setAge(){
        this.age = age;
    }
    public void printMosss(){
        System.out.println("Мышь " + getName() + " возрастом " + getAge());
    }
}

