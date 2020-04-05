import org.testng.annotations.Test;

public class FirstTest {


    @Test
    public void studentTest(){
        System.out.print("Hello student!\n");
    }

    @Test
    public void teacherTest(){
        System.out.print("Hello teacher!\n");
    }

    @Test
    public void lessonTest(){
        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        System.out.print(methodName + " for teacher & student");
    }


}
