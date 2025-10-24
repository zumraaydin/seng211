public class Student {
    String name;
    int age;
    Boolean isJunior;
    char gender;

    public Student(){
        name = "";
        age = 0;
        isJunior = false;
        gender = 'M';
    }

    public void info(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("junior : " + isJunior);
        System.out.println("gender : " +  gender);
    }
}
