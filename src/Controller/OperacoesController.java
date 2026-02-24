package Controller;
import javax.swing.JOptionPane;
public class OperacoesController {
	public void divide() {
		String x = JOptionPane.showInputDialog("Digite");
		String[] vetor = x.split(";");
		int c =0;
		for (String palavra : vetor) {
			System.out.println(palavra);
			c = c+1;
		}
		System.out.println("Possui "+ c + " partes.");
	}
}
