package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public void printGreatest(int first, int second) {
       if(first > second) {
            System.out.println(String.valueOf(first));
        }
        else { 
            System.out.println(String.valueOf(second));
        }
    }
}
