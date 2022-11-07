public class MyClass {
    private String name;
    private String surname;
    private int age;
    private String[] courses;
    private String food;

    public MyClass(String name, String surname, int age, String [] courses,String dymdama){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.courses = courses;
        this.food = dymdama;

    }
    public MyClass (){

    }


    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    void setSurname(String surname){
        this.surname = surname;
    }
    String getSurname(){
        return surname ;
    }
    void setAge(int age){
        this.age = age;
    }
    int getAgef(){
        return age;
    }
    void setCourses(String[] courses){

        this.courses = courses;
    }
    void setFood(String food){
        this.food = food;
    }

    String getFood(){
        return food;
    }
}
