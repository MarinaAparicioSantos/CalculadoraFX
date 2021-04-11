package gui.viewsandcontrollers.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculadoraController {

	@FXML
	private TextField digitoPrimero;

	@FXML
	private TextField digitoSegundo;

	@FXML
	private TextField resultado;

	@FXML
	private Button botonSuma;

	@FXML
	private Button botonResta;

	@FXML
	private Button botonMultiplicacion;

	@FXML
	private Button botonDivision;

	double op1;
	double op2;

//	if (this.botonDivision.isPressed) {
//		
//	}
//	
//	
//	try {
//	this.botonDivision.isPressed();
//	
//	
//} catch (NumberFormatException e) {
//System.out.println("h");
//}

	@FXML
	void operacionDivision(ActionEvent event) {

		try {
			op1 = Double.parseDouble(this.digitoPrimero.getText());
			op2 = Double.parseDouble(this.digitoSegundo.getText());

			double resultadoDivision = op1 / op2;
			this.resultado.setText(resultadoDivision + "");

			if (op2 == 0) {
				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.setHeaderText(null);
				alert.setTitle("Error");
				alert.setContentText("No se puede dividir entre 0");
				alert.showAndWait();

			}
		} catch (NumberFormatException e) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setTitle("Error");
			alert.setContentText("Formato incorrecto.");
			alert.showAndWait();

		}
	}

	@FXML
	void operacionMultiplicacion(ActionEvent event) {
		try {
			op1 = Double.parseDouble(this.digitoPrimero.getText());
			op2 = Double.parseDouble(this.digitoSegundo.getText());

			double resultadoMultipliacion = op1 * op2;
			this.resultado.setText(resultadoMultipliacion + "");

		} catch (NumberFormatException e) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setTitle("Error");
			alert.setContentText("Formato incorrecto.");
			alert.showAndWait();
		}

	}

	@FXML
	void operacionResta(ActionEvent event) {
		try {
			op1 = Double.parseDouble(this.digitoPrimero.getText());
			op2 = Double.parseDouble(this.digitoSegundo.getText());

			double resultadoResta = op1 - op2;
			this.resultado.setText(resultadoResta + "");

		} catch (NumberFormatException e) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setTitle("Error");
			alert.setContentText("Formato incorrecto.");
			alert.showAndWait();
		}
	}

	@FXML
	void operacionSuma(ActionEvent event) {
		try {
			op1 = Double.parseDouble(this.digitoPrimero.getText());
			op2 = Double.parseDouble(this.digitoSegundo.getText());

			double resultadoSuma = op1 + op2;

			this.resultado.setText(resultadoSuma + "");

		} catch (NumberFormatException e) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setTitle("Error");
			alert.setContentText("Formato incorrecto.");
			alert.showAndWait();
		}
	}
}
