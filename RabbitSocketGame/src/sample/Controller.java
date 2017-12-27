package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

import java.util.Random;

public class Controller {
    private Player playerOne;
    private Player playerTwo;
    @FXML
    private static Button button00;
    @FXML
    private static Button button01;
    @FXML
    private static Button button02;
    @FXML
    private static Button button10;
    @FXML
    private static Button button11;
    @FXML
    private static Button button12;
    @FXML
    private static Button button20;
    @FXML
    private static Button button21;
    @FXML
    private static Button button22;
    @FXML
    private Label playerName;
    @FXML
    private Label player1;
    @FXML
    private Label player2;
    @FXML
    private Label score1;
    @FXML
    private Label score2;

    public static void randomRabbit() {
        Random random = new Random();
        int x = random.nextInt(2);
        int y = random.nextInt(2);
        if (x == 0) {
            switch (y) {
                case 0: button00.setText("Зайка");
                case 1: button01.setText("Зайка");
                case 2: button02.setText("Зайка");
            }
        }
        else {
            if (x == 1) {
                switch (y) {
                    case 0: button10.setText("Зайка");
                    case 1: button11.setText("Зайка");
                    case 2: button12.setText("Зайка");
                }
            }
            else {
                switch (y) {
                    case 0: button20.setText("Зайка");
                    case 1: button21.setText("Зайка");
                    case 2: button22.setText("Зайка");
                }
            }
        }
    }

    public void sendPlayer1Info(Player player) {
        player1.setText(player.getName());
        score1.setText("0");
    }

    public void sendPlayer2Info(Player player) {
        player2.setText(player.getName());
        score2.setText("0");
    }

    public int button00(ActionEvent actionEvent) {
        int count = 0;
        if (button00.getText().equals("Зайка")) {
            count++;
        }
        return count;
    }

    public int button01(ActionEvent actionEvent) {
        int count = 0;
        if (button01.getText().equals("Зайка")) {
            count++;
        }
        return count;
    }

    public int button02(ActionEvent actionEvent) {
        int count = 0;
        if (button02.getText().equals("Зайка")) {
            count++;
        }
        return count;
    }

    public int button10(ActionEvent actionEvent) {
        int count = 0;
        if (button10.getText().equals("Зайка")) {
            count++;
        }
        return count;
    }

    public int button11(ActionEvent actionEvent) {
        int count = 0;
        if (button11.getText().equals("Зайка")) {
            count++;
        }
        return count;
    }

    public int button12(ActionEvent actionEvent) {
        int count = 0;
        if (button12.getText().equals("Зайка")) {
            count++;
        }
        return count;
    }

    public int button20(ActionEvent actionEvent) {
        int count = 0;
        if (button20.getText().equals("Зайка")) {
            count++;
        }
        return count;
    }

    public int button21(ActionEvent actionEvent) {
        int count = 0;
        if (button21.getText().equals("Зайка")) {
            count++;
        }
        return count;
    }

    public int button22(ActionEvent actionEvent) {
        int count = 0;
        if (button22.getText().equals("Зайка")) {
            count++;
        }
        return count;
    }

    public void setPlayerNameToLabel(Player player) {
        playerName.setText(player.getName());
    }

    public void main(String[] args) {


        //randomRabbit();
    }

}
