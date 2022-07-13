package questao2;

public class Aviao {
	
	private int passageiros;
	private boolean piloto;
	private int assentos;
	
	
	public int getPassageiros() {
		return passageiros;
	}
	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	
	}
	
	public void setPiloto(boolean piloto) {
		this.piloto = piloto;
	}
	public int getAssentos() {
		return assentos;
	}
	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	
	public void presenca() {
		if(this.piloto == true)
			System.out.println("piloto está");
		
		else {
			System.out.println("piloto não está");
	}
		
		
	}
	

}
