package application;
	

//Importaciones 

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.beans.binding.NumberBinding;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.TextField;
import java.io.*; 


public class Main extends Application {
	
	@Override
	public void init() {
		System.out.println("metodo init()");
	}
	
	@Override
	 public void start(Stage primaryStage) {
       
		
		// Crea el button

        Label label = new Label("BOTON: ");
        Button btn = new Button("Clickea");
        
        
        // Crea el checkbox
        Label label1 = new Label("CHECKBOX: ");
        CheckBox checkbx = new CheckBox ("CHEXBOX");
        
        // Crea el Hiperlink
        Label label2 = new Label("HYPERLINK: ");
        Hyperlink link = new Hyperlink ("HYPERLINK:");
        
        // Crea el ToggleButton
        Label label3 = new Label("TOGGLEBUTTON: :");
        ToggleButton toggbutton = new ToggleButton ("ToggleButton: ");
        
        
        // Crea el RadioButton
        Label label4 = new Label("RADIOBUTTON: :");
        RadioButton rdbutton = new RadioButton ("RADIOBUTTON");
        
        // Crea el Label    
        Label label5 = new Label("LABEL: :");
    
        Label Lb = new Label ("LABEL");
        
     // Crea el TextField 
        Label label6 = new Label ("TEXTFIELD: ");
        TextField textf = new TextField ("some text");
        
        // Crea el Passwordfield
        Label label7 = new Label ("PASSWORDFIELD: ");
        PasswordField contra  = new PasswordField ();
        
        
        // Crea el TextArea
        Label lbl = new Label ("TEXTarea: ");
        TextArea areaTexto  = new TextArea ();
        
        // Crea el ProgressIndicator
        Label label8 = new Label ("PROGRESSindicator: ");
        double i = 0.27;
		ProgressIndicator prossindicador  = new ProgressIndicator ( i);
        
		
		// Crea el ProgressBar
        Label label9 = new Label ("PROGRESSBAR: ");
       
		ProgressBar prossbar  = new ProgressBar (i);
        
		
		// Crea el ProgressBar
        Label lbl1 = new Label ("SLIDER: ");
        
		Slider slider  = new Slider();
        
        
        // Crea los HBox 
        HBox botonBox = new HBox(100);
        botonBox.setAlignment(Pos.CENTER_LEFT);
        botonBox.getChildren().addAll(label, btn);

        
        
        HBox checkBox = new HBox(80);
        checkBox.setAlignment(Pos.CENTER_LEFT);
        checkBox.getChildren().addAll(label1, checkbx);
        
        
        HBox hyperlink = new HBox(80);
        hyperlink.setAlignment(Pos.CENTER_LEFT);
        hyperlink.getChildren().addAll(label2, link);

        
        
        
        HBox togglebtn = new HBox(50);
        togglebtn.setAlignment(Pos.CENTER_LEFT);
        togglebtn.getChildren().addAll(label3, toggbutton);
        
        
        
       
       


        HBox radioButton = new HBox(60);
        radioButton.setAlignment(Pos.CENTER_LEFT);
        radioButton.getChildren().addAll(label4, rdbutton);

        
        HBox lab = new HBox(110);
        lab.setAlignment(Pos.CENTER_LEFT);
        lab.getChildren().addAll(label5, Lb);
        
        
        HBox textfield = new HBox(85);
        textfield.setAlignment(Pos.CENTER_LEFT);
        textfield.getChildren().addAll(label6, textf);
        
        HBox passwordfield = new HBox(50);
        passwordfield.setAlignment(Pos.CENTER_LEFT);
        passwordfield.getChildren().addAll(label7, contra);
        
        
        HBox textArea = new HBox(95);
        textArea.setAlignment(Pos.CENTER_LEFT);
        textArea.getChildren().addAll(lbl, areaTexto);
        
        
        HBox ProgressIndicator = new HBox(120);
        ProgressIndicator.setAlignment(Pos.CENTER_LEFT);
        ProgressIndicator.getChildren().addAll(label8, prossindicador);
        
        
        HBox ProgressBar = new HBox(60);
        ProgressBar.setAlignment(Pos.CENTER_LEFT);
        ProgressBar.getChildren().addAll(label9, prossbar);
        
        
        
        HBox Slider = new HBox(100);
        Slider.setAlignment(Pos.CENTER_LEFT);
        Slider.getChildren().addAll(lbl1, slider);
        
        // Crea un Vbox
        
        VBox vbox = new VBox(10);
        
     
        vbox.setAlignment(Pos.TOP_LEFT);
        
        vbox.setPadding(new Insets(20)); 
        // Establece varios estilos para el Vbox
        vbox.setStyle("-fx-border-style: solid inside;"
                + "-fx-border-width: 2;"
                + "-fx-border-insets: 5;"
                + "-fx-border-radius: 5;"
                + "-fx-border-color: red;");
       
        vbox.setPrefSize(700, 200);
       
        vbox.getChildren().addAll(botonBox, checkBox, hyperlink, togglebtn, radioButton, lab,textfield, passwordfield, textArea, ProgressIndicator,ProgressBar, Slider);

        // Crea  Scene
        Scene scene = new Scene(vbox, 700, 700);
        // Agrega  scene en Stage
        primaryStage.setScene(scene);
        
        // Titulo del Stage
        primaryStage.setTitle("FORMULARIO");
        
        //  Muestra Stage
        primaryStage.show();
    }

    

	    
	
	@Override
	public void stop() {
		System.out.println("metodo stop()");
		
	}
	
	public static void main (String[] args){
		launch(args);
	
	}
	
}


	