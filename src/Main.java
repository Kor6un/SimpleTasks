import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task1");

        int size = 100;

        double[] array = RandomArray.createArray(size);

        Task1 task1 = new Task1(array);

        double max;
        max = task1.max(array);
        System.out.println("MAX = " + max);

        double min;
        min = task1.min(array);
        System.out.println("MIN = " + min);

        double avg;
        avg = task1.avg(array);
        System.out.println("AVG = " + avg);

    }

}