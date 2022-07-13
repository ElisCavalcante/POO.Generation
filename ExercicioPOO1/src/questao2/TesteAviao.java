package questao2;

public class TesteAviao {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao();
		
		aviao1.setAssentos(300);
		aviao1.setPassageiros(280);
		aviao1.setPiloto(false);
		
		
		System.out.println("O aviao tem: " + aviao1.getAssentos()+ " assentos");
		System.out.println("O avião está com: " + aviao1.getPassageiros()+ " passageiros");
		aviao1.presenca();
	}

}
