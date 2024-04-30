package Exception;

public class Throwexception {
    static void checkAge(int age) throws ArithmeticException{
        if(age<18){
            throw new ArithmeticException("you must be 18 years old");
        }else{
            System.out.println("you are old enough");
        }
    }
    public static void main(String[] args) {
        checkAge(15);
    }
}
