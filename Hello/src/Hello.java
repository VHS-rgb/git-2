public class Hello {
private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void sayHello(){
        System.out.println("Hello " + getName() );
    }
}
