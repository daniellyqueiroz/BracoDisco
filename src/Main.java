import java.security.Principal;
import java.util.ArrayList;

public class Main {
	
	public static ArrayList<Integer> listaRequisicoes(ArrayList<Integer> requisicoes){
		
		
		return requisicoes;
	}
	
public static void main(String[] args) throws InterruptedException {
	
	ArrayList<Integer> requisicoes = new ArrayList<Integer>();
	 
	 
	requisicoes.add(1);
	requisicoes.add(34);
	requisicoes.add(9);
	requisicoes.add(36);
	requisicoes.add(16);
	requisicoes.add(12);
	
	System.out.println(requisicoes +" Elevador Scan\n");

	
	Disco disco = new Disco(40,0,requisicoes, 1000L);

	
	Elevador elevador = new Elevador(disco);
	
	elevador.scan(requisicoes);
	
	requisicoes.clear();
	
	
	
	requisicoes.add(1);
	requisicoes.add(34);
	requisicoes.add(9);
	requisicoes.add(36);
	requisicoes.add(16);
	requisicoes.add(12);
	System.out.println(requisicoes +" Elevador Scan\n");
	

	elevador.scan(requisicoes);
	
	requisicoes.clear();
	
	requisicoes.add(1);
	requisicoes.add(34);
	requisicoes.add(9);
	requisicoes.add(36);
	requisicoes.add(16);
	requisicoes.add(12);
	

	System.out.println(requisicoes +" Elevador scan\n");
	
	elevador.scan(requisicoes);
	
	requisicoes.clear();
	
	requisicoes.add(10);
	requisicoes.add(3);
	requisicoes.add(4);
	requisicoes.add(6);
	requisicoes.add(15);
	requisicoes.add(1);
	
	Disco disco2 = new Disco(50,0,requisicoes, 1000L);

	
	Elevador elevador2 = new Elevador(disco2);
	

	System.out.println(requisicoes +" Elevador Look\n");
	

	elevador2.look(requisicoes);
	
	requisicoes.clear();
	
	requisicoes.add(10);
	requisicoes.add(3);
	requisicoes.add(4);
	requisicoes.add(6);
	requisicoes.add(15);
	requisicoes.add(1);
	

	System.out.println(requisicoes +" Elevador Look\n");
	
	elevador2.look(requisicoes);
	
	requisicoes.clear();
	
	
	
}
}
