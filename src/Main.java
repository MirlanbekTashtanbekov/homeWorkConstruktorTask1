import java.util.Arrays;

public class Main {
    public static void main(String[] args) {



        String[] lessons={"English","Java","Practice"};
        MyClass myClass= new MyClass("Mirlan","Tashtanbekov",32,lessons,"Homemade food");
        System.out.println("~~~~~~~ 1-Person ~~~~~~~");
        System.out.println("Name: "+myClass.firstName+"\nLast Name: "+myClass.lastName+"\nAge: "+myClass.age);
        for(String lesson:lessons){
            System.out.println("Peaksoft lesson: "+lesson);
        }
        System.out.println("Favorite food: "+myClass.food);

        System.out.println("\n~~~~~~~ 2 - Person ~~~~~~~");

        MyClass myClass1=new MyClass("Mikki","Mouse",18);
        System.out.println("Name: "+myClass1.firstName+"\nLast Name: "+myClass1.lastName+"\nAge: "+myClass1.age);





    }
}