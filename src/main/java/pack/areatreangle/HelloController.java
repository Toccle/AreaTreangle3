package pack.areatreangle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import java.awt.*;

public class HelloController {
    @FXML
    Button calc;

    @FXML
    TextField params;

    @FXML
    Label result;

    @FXML
    VBox treangle;

    @FXML
    private void calcArea() {
        String[] sidesStr = params.getText().replaceAll("\\s", "").split(";");
        if (sidesStr.length > 3) {
            result.setText("Введено больше трех сторон");
        } else if (sidesStr.length < 3) {
            result.setText("Введено меньше трех сторон");
        } else {
            try {
                float[] sidesFlt = new float[sidesStr.length];
                int i = 0;
                for (String s : sidesStr) {
                    sidesFlt[i] = Float.parseFloat(s);
                    i++;
                }
                for (int j = 0; j < sidesFlt.length; j++) {
                    System.out.println(sidesFlt[j]);
                }
                if (sidesFlt[0] + sidesFlt[1] < sidesFlt[2] || sidesFlt[1] + sidesFlt[2] < sidesFlt[0] || sidesFlt[2] + sidesFlt[0] < sidesFlt[1]
                        || sidesFlt[0] <= 0 || sidesFlt[1] <= 0 || sidesFlt[2] <= 0) {
                    result.setText("Такого треугольника не существует");
                } else {
                    float p = sidesFlt[0] + sidesFlt[1] + sidesFlt[2];
                    float area = (float) Math.sqrt(p * (p - sidesFlt[0]) * (p - sidesFlt[1]) * (p - sidesFlt[2]));
                    result.setText("Площадь треугольника равна " + String.format("%.2f", area));
                }
            } catch (NumberFormatException e) {
                result.setText("Неверный формат чисел!");
            }
        }
    }
}
