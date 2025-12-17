class Emp {
    int id;
    String name;
    long salary = 18410;

    public void printDetails() {
        System.out.println("Id : " + id + "\nName : " + name + "\nSalary : " + salary);
        System.out.println("-----------------------------------------------------------------------------------");
    }
    public long getSal(){
        return salary;
    }
}

public class Lec4 {
    public static void main(String[] args) {
        Emp obj1 = new Emp();
        obj1.id = 1;
        obj1.name = "Harshit";
        obj1.salary = 9999999999L;
        obj1.printDetails();

        Emp obj2 = new Emp();
        obj2.id = 2;
        obj2.name = "Ayush";
        obj2.printDetails();
    }
}
