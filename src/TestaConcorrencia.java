
public class TestaConcorrencia {

	public static void main(String[] args) throws InterruptedException {
		/*
		BarraProgresso barra = new BarraProgresso();
		Thread t1 = new Thread(barra);
		t1.start();
		
		CopiadorArquivo copiador = new CopiadorArquivo();
		Thread t2 = new Thread(copiador);
		t2.start();
		*/
		
		//--Exemplo com Semáforos------------
		Conta c1 = new Conta(500.0);
		FazDeposito acao = new FazDeposito(c1);
		Thread thread1 = new Thread(acao);
		Thread thread2 = new Thread(acao);
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		System.out.println(c1.getSaldo());
		
	}

}
