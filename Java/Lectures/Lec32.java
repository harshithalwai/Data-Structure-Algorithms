// class A {
//     void showA() {
//         System.out.println("I'm show A");
//     }

//     void suckA() {
//         System.out.println("I'm suck A");
//     }

//     void show() {
//         System.out.println("I'm A " );
//     }

//     void show(int x) {
//         System.out.println("I'm A " + x);
//     }

// }

// class B extends A {
//     @Override
//     void show() {
//         System.out.println("I'm B");
//     }
//     void showB() {
//         super.show(2);
//         System.out.println("I'm showB");
//     }
// }

// public class Lec32 {
//     public static void showB() {
//         System.out.println("I'm showB");
//     }
//     public static void main(String[] args) {
//         // A obj1 = new A();
//         // obj1.show();
//         // System.out.println(obj1.toString());
//         // A obj2 = new A();
//         // obj2.showA();

//         // Runnable x=Lec32::showB;
//         // x.run();
//         // String str="12";
//         // System.out.println(Integer.valueOf(str));

//         Integer x=new Integer(9);

//     }
// }

class Message {

    public void printMessage(int message) {

        System.out.println("Message primitive: " + message);

    }

    public void printMessage(Integer message) {

        System.out.println("Message object: " + message);

    }

}

public class Lec32 {

    public static void main(String[] ars) {

        Message ob = new Message();

        ob.printMessage(5);

    }

}