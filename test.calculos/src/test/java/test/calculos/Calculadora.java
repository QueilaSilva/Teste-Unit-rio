package test.calculos;

public class Calculadora {

	public static int main(String string) {

		int valorDesejado = 8500;

		int valorNegociado = 8000;

		int media = (valorDesejado + valorNegociado) / 2;

		if (media >= valorNegociado) {

			System.out.println("Parabens, objetivo concluido");
		

		}
		return media;

	}
}
