import java.lang.reflect.Method;

public class App {
    public static void main(String[]args) {
        Class<?> testClass = TestClass.class;
        if(testClass.isAnnotationPresent(Author.class)){
            Author author = testClass.getAnnotation(Author.class);
            System.out.println("Class Author:"+ author.name());
            System.out.println("Date:"+author.date());
        }


    }
}
