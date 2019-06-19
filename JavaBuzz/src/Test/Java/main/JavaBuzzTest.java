package Test.Java.main;

        import com.happyday.JavaBuzz;
        import org.junit.jupiter.api.Assertions;
        import org.junit.jupiter.api.Test;

public class JavaBuzzTest {

    @Test
    public void replacesMultiplesOfThreeWithJava() {
        JavaBuzz j = new JavaBuzz();
        Assertions.assertEquals("Java", j.javabuzz(3));
    }

    @Test
    public void replacesMultiplesOfFiveWithBuzz() {
        JavaBuzz j = new JavaBuzz();
        Assertions.assertEquals("Buzz", j.javabuzz(5));
    }

    @Test
    public void replacesMultiplesOfFifteenWithJavaBuzz() {
        JavaBuzz j = new JavaBuzz();
        Assertions.assertEquals("Buzz", j.javabuzz(15));
    }
}
