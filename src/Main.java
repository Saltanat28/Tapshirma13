import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] array={"Technical lesson, Technical English"};
        MyClass myClass = new MyClass(" Saltanat", " Nematilla kyzy", 20,array ," Dymdama");

        System.out.println(" Name:"+myClass.getName());
        System.out.println(" Surname:"+ myClass.getSurname() );
        System.out.println(" Age:"+ myClass.getAgef());
        System.out.println(" Courses that you visit: "+ Arrays.toString(array));
        System.out.println(" Favorite food: "+myClass.getFood());
        System.out.println();

        MyClass myClass1 = new MyClass("Nuriza", "Muratova", 20, array, "Manty ");
        System.out.println("Name:"+myClass1.getName());
        System.out.println("Surname: "+myClass1.getSurname());
        System.out.println("Age: "+myClass1.getAgef());
        System.out.println("Courses that she visit: "+Arrays.toString(array));
        System.out.println("Favorite food:  "+myClass1.getFood());

    }
}