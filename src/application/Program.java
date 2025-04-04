package application;

public class Program {

	public static void main(String[] args) {

		String[] vect = new String[] { "Maria", "Bob", "Alex" };

		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}

		// O MESMO EFEITO OCORRE COM O FOR EACH DA SEGUINTE FORMA:
		// DEFINE-SE O TIPO DA VARIÁVEL, NO CASO STRING
		// O APELIDO DA COLEÇÃO, NO CASO OBJ
		// A REFERENCIA AO VETOR
		// POR FIM, PERCORRE-SE O VETOR COMPLETO ATRAVÉS DA REFERÊNCIA AO APELIDO

		for (String obj : vect) {
			System.out.println(obj);
		}
	}

}
