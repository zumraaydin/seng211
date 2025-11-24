import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("name " + s1.name );
        System.out.println("gender " + s1.gender);
        System.out.println("age " + s1.age);
        s1.age =15;
        s1.name= "Ayşe";
        s1.isJunior = true;
        s1.gender = 'f';
        s1.info();

    }
}
