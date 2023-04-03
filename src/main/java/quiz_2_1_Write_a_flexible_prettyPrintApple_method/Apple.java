package quiz_2_1_Write_a_flexible_prettyPrintApple_method;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Apple {
    public Apple(double weight, String color, double diameter) {
        this.weight = weight;
        this.color = color;
        this.diameter = diameter;
    }

    private double weight;
    private String color;
    private double diameter;
}
