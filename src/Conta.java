
public class Conta {

	private double saldo;
	private double limite;
	private int agencia;
	private int numero;
	//private Cliente titular;
	//...
	
	public Conta(double saldo){
		this.saldo = saldo;
	}
	
	public void saca(double valor){
		this.saldo -= valor;
	}
	
	public void deposita(double valor){
		//A thread em execução bloqueia seu objeto, impedindo que outro processo execute e interfira no valor final
		synchronized(this){
			this.saldo += valor;			
		}
	}
	
	/**OU :
	 * 
	 * public synchronized deposita(double valor){
	 * 	this.saldo += saldo;
	 * }
	 * 
	 */
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
