package br.com.fiap.si;
import javax.swing.JOptionPane;

public class variavel {
  public static void main (String[]args)
  {  
	  int Escolha;
	  double valor1, valor2, res = 0 ;

	  Escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha\n"+"1- Soma\n" + 
	  "2- Subtração\n"+"3- Multiplicação\n" + "4- Divisão"));
	  valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
	  valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
	  
	  if (Escolha ==1) {
		  res = valor1 + valor2;
		  JOptionPane.showMessageDialog(null,res);
	  } else if (Escolha ==2) {
		  res = valor1 - valor2;
		  JOptionPane.showMessageDialog(null,res);
	  }else if (Escolha ==3) {
		  res = valor1 * valor2;
		  JOptionPane.showMessageDialog(null,res);
		  System.out.print("O resultado é: " + res);
	  }else {
		  res = valor1/valor2;
		  JOptionPane.showMessageDialog(null,res);
	  }
  }
}