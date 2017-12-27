package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javax.xml.bind.annotation.XmlList;

public class Controller {
    private static Player playerOne;
    private static Player playerTwo;
    @FXML
    private Button button00;
    @FXML
    private Button button01;
    @FXML
    private Button button02;
    @FXML
    private Button button10;
    @FXML
    private Button button11;
    @FXML
    private Button button12;
    @FXML
    private Button button20;
    @FXML
    private Button button21;
    @FXML
    private Button button22;
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

    public void randomRabbit() {
        int x = (int) ( Math.random() * 3 );
        int y = (int) ( Math.random() * 3 );
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

    public void button00(ActionEvent actionEvent, Player player) {
        int count = player.getCount();
        if (button00.getText().equals("Зайка")) {
            count++;
            player.setCount(count);
            if (player1.getText().equals(player.getName())) {
                score1.setText("" + count);
            }
            else {
                score2.setText("" + count);
            }
        }
    }

    public void button01(ActionEvent actionEvent, Player player) {
        int count = player.getCount();
        if (button01.getText().equals("Зайка")) {
            count++;
            player.setCount(count);
            if (player1.getText().equals(player.getName())) {
                score1.setText("" + count);
            }
            else {
                score2.setText("" + count);
            }
        }
    }

    public void button02(ActionEvent actionEvent, Player player) {
        int count = player.getCount();
        if (button02.getText().equals("Зайка")) {
            count++;
            player.setCount(count);
            if (player1.getText().equals(player.getName())) {
                score1.setText("" + count);
            }
            else {
                score2.setText("" + count);
            }
        }
    }

    public void button10(ActionEvent actionEvent, Player player) {
        int count = player.getCount();
        if (button10.getText().equals("Зайка")) {
            count++;
            player.setCount(count);
            if (player1.getText().equals(player.getName())) {
                score1.setText("" + count);
            }
            else {
                score2.setText("" + count);
            }
        }
    }

    public void button11(ActionEvent actionEvent, Player player) {
        int count = player.getCount();
        if (button11.getText().equals("Зайка")) {
            count++;
            player.setCount(count);
            if (player1.getText().equals(player.getName())) {
                score1.setText("" + count);
            }
            else {
                score2.setText("" + count);
            }
        }
    }

    public void button12(ActionEvent actionEvent, Player player) {
        int count = player.getCount();
        if (button12.getText().equals("Зайка")) {
            count++;
            player.setCount(count);
            if (player1.getText().equals(player.getName())) {
                score1.setText("" + count);
            }
            else {
                score2.setText("" + count);
            }
        }
    }

    public void button20(ActionEvent actionEvent, Player player) {
        int count = player.getCount();
        if (button20.getText().equals("Зайка")) {
            count++;
            player.setCount(count);
            if (player1.getText().equals(player.getName())) {
                score1.setText("" + count);
            }
            else {
                score2.setText("" + count);
            }
        }
    }

    public void button21(ActionEvent actionEvent, Player player) {
        int count = player.getCount();
        if (button21.getText().equals("Зайка")) {
            count++;
            player.setCount(count);
            if (player1.getText().equals(player.getName())) {
                score1.setText("" + count);
            }
            else {
                score2.setText("" + count);
            }
        }
    }

    public void button22(ActionEvent actionEvent, Player player) {
        int count = player.getCount();
        if (button22.getText().equals("Зайка")) {
            count++;
            player.setCount(count);
            if (player1.getText().equals(player.getName())) {
                score1.setText("" + count);
            }
            else {
                score2.setText("" + count);
            }
        }
    }

    public void setPlayerNameToLabel(Player player) {
        playerName.setText(player.getName());
    }

    public void main(String[] args) {
        playerOne.setName("A");
        playerTwo.setName("B");
        //Вместо PlayerOne нужно будет поставить пользователя, который играет
        setPlayerNameToLabel(playerOne);

        sendPlayer1Info(playerOne);
        sendPlayer2Info(playerTwo);

        randomRabbit();
    }

}
