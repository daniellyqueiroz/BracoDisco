import java.util.ArrayList;

public class Main {
	
public static void main(String[] args) throws InterruptedException {
	
	ArrayList<Integer> requisicoes = new ArrayList<Integer>();
	requisicoes.add(10);
	requisicoes.add(3);
	requisicoes.add(4);
	requisicoes.add(6);
	requisicoes.add(15);
	
	Disco disco = new Disco(50,0,requisicoes, 1000L);
	
	
	Elevador elevador = new Elevador(disco);
	
	String imprimeRequisicoes ="";
	for (int i = 0; i < requisicoes.size(); i++) {
		imprimeRequisicoes+= requisicoes.get(i) +",";
	}
	System.out.println("Lista de Requisicoes:" + imprimeRequisicoes);
	
	elevador.scan(requisicoes);
	
	
	
}
}
