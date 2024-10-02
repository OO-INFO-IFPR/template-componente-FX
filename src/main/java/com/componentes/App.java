package com.componentes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private VBox root;

    @Override
    public void start(Stage stage) throws IOException {
        root = new VBox();

        // cria o componente sozinho iniciando o valor
        Label label = new Label("_Nome:");

        TextField textField = new TextField("INFO23");
        textField.setPromptText("Digite o seu nome..");

        TextArea textArea = new TextArea();
        textArea.setPromptText("Campo de texto grande");

        RadioButton rSim = new RadioButton("Sim");
        RadioButton rNao = new RadioButton("Não");
        ToggleGroup grupoBotoes = new ToggleGroup();
        rSim.setToggleGroup(grupoBotoes);
        rNao.setToggleGroup(grupoBotoes);

        CheckBox checkBox = new CheckBox("Java!");
        CheckBox checkBoxC = new CheckBox("C!");

        ComboBox<String> cb = new ComboBox<>();
        cb.getItems().add("Opção 1");
        cb.getItems().add("Opção 2");
        cb.getItems().add("Opção 3");

        // root é a tela que eu adicionei ao cena, ela estava vazia e adicionei o label
        // agora
        root.getChildren().add(label);
        root.getChildren().add(textField);
        root.getChildren().add(textArea);
        root.getChildren().add(rSim);
        root.getChildren().add(rNao);
        root.getChildren().add(checkBox);
        root.getChildren().add(checkBoxC);
        root.getChildren().add(cb);

        // aqui criou a cena adicionando a tela com o componente
        scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}