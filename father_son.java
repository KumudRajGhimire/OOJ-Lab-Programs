import java.util.Scanner;
import static java.lang.System.exit;

// Custom exception class for age-related errors
class AgeException extends java.lang.Exception {
    public AgeException(String str) {
        super(str);
    }
}

// Father class
class Father {
    Scanner sc = new Scanner(System.in);
    int fatherAge;

    public Father() {
        try {
            System.out.println("Enter Father's age: ");
            fatherAge = sc.nextInt();
            if (fatherAge < 0) throw new AgeException("Father's age can't be negative.");
        } catch (AgeException e) {
            System.out.println(e);
            exit(0);
        }
    }

    public void fatherDetails() {
        System.out.println("Father's age is: " + fatherAge);
    }
}

// Son class extending Father
class Son extends Father {
    Scanner sc = new Scanner(System.in);
    int sonAge;

    public Son() {
        super();  // Call the parent class constructor
        try {
            System.out.println("Enter Son's age: ");
            sonAge = sc.nextInt();
            if (sonAge < 0) throw new AgeException("Son's age can't be negative.");  // Negative age check for son
            if (sonAge > fatherAge) throw new AgeException("Son's age can't be greater than Father's age.");
        } catch (AgeException e) {
            System.out.println(e);
            exit(0);
        }
    }

    public void sonDetails() {
        System.out.println("Son's age is: " + sonAge);
    }
}

// Main class
public class Exception {
    public static void main(String[] args) {
        Son sonObj = new Son();
        sonObj.sonDetails();
        sonObj.fatherDetails();
    }
}

