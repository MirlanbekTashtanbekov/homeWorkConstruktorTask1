public class MyClass {
    String firstName;
    String lastName;
    int age;
    String[] Lessons;
    String food;


    public MyClass(){
    }

    public MyClass(String firstName, String lastName,int age,String[]lessons,String food){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.Lessons=lessons;
        this.food=food;

    }

    public MyClass(String firstName,String lastName,int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }


}
