package quiz_2_1_Write_a_flexible_prettyPrintApple_method;

public class FilterApples implements AppleCheck{
    @Override
    public String prettyPrintApple(Apple apple) {
        return "weight of apple is: " + apple.getWeight() + " and color of apple is: " + apple.getColor();
    }
}
