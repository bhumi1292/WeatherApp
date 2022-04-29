package com.statista.weather.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Demonstrate javaFx application which retrieve the weather information for
 * today and also forecast the weather information for next six days on given
 * location.
 * 
 * @author bhumi Domadiya
 *
 */
public class App extends Application {

	public static void main(String[] args) {
		launch();

	}

	@Override
	public void start(Stage primarystage) {

		primarystage.setTitle("Weather");

		GridPane gitter = new GridPane();
		gitter.setVgap(15);
		gitter.setHgap(5);
		gitter.setAlignment(Pos.CENTER);

		Label title = new Label("Let's check Weather");

		gitter.add(title, 0, 0, 3, 1);
		title.setStyle("-fx-font-family: 'Anton', sans-serif;" + "-fx-font-size: 22;");
		
		//In the Map we have collection of key and value.
		//the required cityId we get from the value and pass to the link for getting the correct Location.
		Map<String, Integer> list = new HashMap<String, Integer>();
		list.put("Krefeld", 48403);
		list.put("Berlin", 44358);
		list.put("Hamburg", 46998);
		list.put("Duseldorf", 26750);
		ComboBox<String> nameofcity = new ComboBox<String>();
		nameofcity.getItems().addAll("Berlin", "Hamburg", "Krefeld", "Duseldorf");
		nameofcity.setValue("Choose the City");
		
		//Functional Interface SetOnAction retrieve the data when we click on the element of the ComboBox 
		nameofcity.setOnAction(test -> {

			int key = list.get(nameofcity.getValue());
			System.out.println(key);

			Day[] weekdays = new SevenDayWeather(String.valueOf(key)).getWeekdays();

			for (int i = 0; i < weekdays.length; i++) {
				int goal = i + 1;
				String date = weekdays[i].getDate();
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-M-d");
				LocalDate jdate = LocalDate.parse(date, dtf);

				Locale here = Locale.ENGLISH;
				String dayOfWeek = jdate.getDayOfWeek().getDisplayName(TextStyle.FULL, here);
				Label displayDay = new Label(dayOfWeek);

				gitter.add(displayDay, 0, goal);

			}

			for (int i = 0; i < weekdays.length; i++) {
				int goal = i + 1;
				String icon = weekdays[i].getIcon();
				ImageView pic = new ImageView(new Image("https://v5i.tutiempo.net/wi/03/40/" + icon + ".png"));
				gitter.add(pic, 1, goal);

			}
			for (int i = 0; i < weekdays.length; i++) {
				int goal = i + 1;
				String icon = weekdays[i].getIconwind();
				ImageView pic = new ImageView(new Image("https://v5i.tutiempo.net/wd/big/black/" + icon + ".png"));
				gitter.add(pic, 2, goal);
			}
			for (int i = 0; i < weekdays.length; i++) {
				int goal = i + 1;
				String icon = weekdays[i].getMoonIcon();
				ImageView pic = new ImageView(new Image("https://v5i.tutiempo.net/wmi/02/" + icon + ".png"));
				gitter.add(pic, 3, goal);
			}

			for (int i = 0; i < weekdays.length; i++) {
				int goal = i + 1;
				int tem = weekdays[i].getTemprature_max();
				Label tempLabel = new Label(String.valueOf(tem));// covert int to String
				gitter.add(tempLabel, 4, goal);
			}
			primarystage.hide();
			primarystage.show();
		});

		gitter.add(nameofcity, 3, 0, 2, 1);
		Scene weatherScene = new Scene(gitter, 500, 800);

		primarystage.setScene(weatherScene);
		primarystage.show();

	}

}
