import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Optional;
import javafx.scene.control.TextInputDialog;

public class Print1 extends Application {


    public void start (Stage primaryStage) {
        TextInputDialog textInputDialog = new TextInputDialog("1");
        textInputDialog.setContentText("Select option 1 for println or option 2 for printf");
        Optional<String> input = textInputDialog.showAndWait();
        String option = input.get();

        if(option.equals("1")) {
            System.out.println("You chose to println, get hip!");
        } else if (option.equals("2")) {

            System.out.printf("Good choice %s \n" , "brave one");
            System.out.printf("Character: %c, %c \n",'a', 65);
            System.out.printf("Decimal: %d \n" , 5, 4321);
            System.out.printf("Exponents : %12.3e \n", 45.6);
            System.out.printf("float: %f \n" , 7.8910);






        }
    }
}
