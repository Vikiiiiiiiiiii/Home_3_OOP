public class Test {
    
    String name;
    int id;
    
    public Test(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    @Override
    public String toString() {
        return String.format("тест: %s %d", name, id);
    }
}