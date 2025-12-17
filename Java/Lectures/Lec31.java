
class stu {

    static int count=0;

    public stu() {
        count++;
    }
    
}public class Lec31 {
    public static void main(String[] args) {
        stu obj1=new stu();
        System.out.println(stu.count);
        obj1.count=5;
        System.out.println(obj1.count);
        stu obj2 =new stu();
        stu obj3 =new stu();
        stu obj4 =new stu();

        System.out.println(stu.count);
    }
}
