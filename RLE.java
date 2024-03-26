package compressioni;

import java.util.Hashtable;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RLE extends Application{
TextField tPesoNcompr=new TextField("Peso immagine non compressa");
TextField tPesoCompr=new TextField("Peso immagine compressa");
TextField tComprRate=new TextField("Compression rate");

Button bComprimi =new Button ("comprimi");

int matrice[][]=new int[3][3];
public void start(Stage finestra) {
	GridPane griglia=new GridPane();
	griglia.add(tPesoNcompr, 0, 0);
	griglia.add(tPesoCompr, 0, 1);
	griglia.add(tComprRate, 0, 2);
	griglia.add(bComprimi, 1, 2);
	bComprimi.setOnAction(e -> comprimi());
	Scene scena = new Scene(griglia);
	finestra.setTitle("Immagine");
	finestra.setScene(scena);
	finestra.show();
}
public void comprimi() {
	for (int i=0;i<3;i++) {
		Hashtable<Integer, String> my_dict= new Hashtable<Integer,String>();
		my_dict.put(1, "V");
		my_dict.put(2, "G");
		my_dict.put(3, "B");
		for(int e=0;e<3;e++) {
			if(my_dict.containsKey(matrice[i][e]));
		}
	}
}
public static void main(String[] args) {
	launch(args);

}
}
