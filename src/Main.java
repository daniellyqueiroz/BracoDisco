
import java.util.ArrayList;

public class Main {
	
	public static ArrayList<Integer> listaRequisicoes(ArrayList<Integer> requisicoes){
		
		
		return requisicoes;
	}
	
public static void main(String[] args) throws InterruptedException {
	
	ArrayList<Integer> requisicoes = new ArrayList<Integer>();
	 
	//Exemplo SCAN
	requisicoes.add(1);
	requisicoes.add(34);
	requisicoes.add(9);
	requisicoes.add(36);
	requisicoes.add(16);
	requisicoes.add(12);
	
	System.out.println(requisicoes +"\n");
	System.err.println("Scan");

	
	Disco disco = new Disco(40,0,requisicoes, 10L);

	
	Elevador elevador = new Elevador(disco);
	
	elevador.scan(requisicoes);
	
	requisicoes.clear();

	
	// CSCAN
	requisicoes.add(1);
	requisicoes.add(34);
	requisicoes.add(9);
	requisicoes.add(36);
	requisicoes.add(16);
	requisicoes.add(12);
	
	System.out.println(requisicoes +"\n");
	System.err.println("C-scan");
	

	
	Disco disco3 = new Disco(40,0,requisicoes, 10L);

	
	Elevador elevador3 = new Elevador(disco3);
	
	elevador3.cScan(requisicoes);
	
	

	
	requisicoes.clear();
	
	requisicoes.add(1);
	requisicoes.add(34);
	requisicoes.add(9);
	requisicoes.add(36);
	requisicoes.add(16);
	requisicoes.add(12);
	
	Disco disco2 = new Disco(40,0,requisicoes, 10L);


	Elevador elevador2 = new Elevador(disco2);
	

  System.out.println(requisicoes +"\n");
  System.err.println("Look");

   elevador2.look(requisicoes);
   
  
   requisicoes.clear();

   	requisicoes.add(1);
	requisicoes.add(34);
	requisicoes.add(9);
	requisicoes.add(36);
	requisicoes.add(16);
	requisicoes.add(12);
	
	Disco disco4 = new Disco(40,0,requisicoes, 10L);
	
	Elevador elevador4 = new Elevador(disco4);
	
	

  System.out.println(requisicoes +"\n");
  System.err.println("C-look");

  elevador4.cLook(requisicoes);

	
}
}

