// package specifier; // javac -d . *.java //--->to create the pacakages
class Emp{
    public String name="Harshit";
    protected int id=2730717;
    private long salary=999999999999999999l;
    String comp="TCS";
    void sal(){
        System.out.println(salary);
    }
}

public class Lec12 {
    public static void main(String[] args) {
        Emp obj=new Emp();
        System.out.println(obj.name);
        System.out.println(obj.id);
        System.out.println(obj.comp);
        obj.sal();
    }
}
