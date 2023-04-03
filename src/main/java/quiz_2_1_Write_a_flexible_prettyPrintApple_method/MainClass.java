package quiz_2_1_Write_a_flexible_prettyPrintApple_method;

import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Apple apple1 = new Apple(0.25, "Green", 0.07);
        Apple apple2 = new Apple(0.20, "Red", 0.05);
        Apple apple3 = new Apple(0.22, "Yellow", 0.06);
        List<Apple> appleList = Arrays.asList(apple1, apple2, apple3);
        FilterApples filterApples = new FilterApples();
        for (Apple a: appleList) {
            System.out.println(filterApples.prettyPrintApple(a));
        }
    }
}
