import java.util.ArrayList;
import java.util.Collections;

public class Elevador {
	
	private Disco disco;
	
	public Elevador(Disco disco){
		this.disco = disco;
	}

	public ArrayList<Integer> getMenores(ArrayList<Integer> requisicoes){
		ArrayList<Integer> resultadoMenores = new ArrayList<Integer>();
		for(int i=0; i < requisicoes.size(); i++){
			if(disco.getPosicao()> requisicoes.get(i)){
				resultadoMenores.add(requisicoes.get(i));
			}
		}
		return resultadoMenores;
		
	}
	
	public ArrayList<Integer> getMaiores(ArrayList<Integer> requisicoes){
		
		ArrayList<Integer> resultadoMaiores = new ArrayList<Integer>();
		for(int i=0; i < requisicoes.size(); i++){
			if(disco.getPosicao()<= requisicoes.get(i)){
				resultadoMaiores.add(requisicoes.get(i));
			}
		}
		return resultadoMaiores;
		
	}
	
	
	public void scan(ArrayList<Integer> requisicoes) throws InterruptedException{
		
		
		disco.imprimeScan(requisicoes, 750L, 40);
		
		for (int i = 0; i < requisicoes.size(); i++) {
			if(i == requisicoes.size()-1 ){
				disco.setPosicao(requisicoes.get(i));
			}
			
		}
		
		System.out.println(disco.getPosicao());

	
	}
	
	public void cScan(ArrayList<Integer> requisicoes) throws InterruptedException{

		
		
		
		disco.imprimeCSCAN(requisicoes, 750L,40);
		
		for (int i = 0; i < requisicoes.size(); i++) {
			if(i == requisicoes.size()-1 ){
				disco.setPosicao(requisicoes.get(0));
			}
			
		}
		
		System.out.println(disco.getPosicao());

	
	}
	
public void look(ArrayList<Integer> requisicoes) throws InterruptedException{

	ArrayList<Integer> cima = new ArrayList<Integer>();
	ArrayList<Integer> baixo = new ArrayList<Integer>();
	
	cima.addAll(getMaiores(requisicoes));
	baixo.addAll(getMenores(requisicoes));
	
	Collections.sort(cima);
	Collections.sort(baixo);
	Collections.reverse(baixo);
	
	requisicoes.clear();
	
	requisicoes.addAll(cima);
	requisicoes.addAll(baixo);
	
	for (int i = 0; i < requisicoes.size(); i++) {
		if(i == requisicoes.size()-1 ){
			disco.setPosicao(requisicoes.get(i));
		}
		
	}
	
//	requisicoes.get(requisicoes.size()-1);
	disco.imprimeLook(requisicoes, 750L, disco.getPosicao()+1);
	
	
	
	System.out.println(disco.getPosicao());


}

public void cLook(ArrayList<Integer> requisicoes) throws InterruptedException{
	ArrayList<Integer> cima = new ArrayList<Integer>();
	ArrayList<Integer> baixo = new ArrayList<Integer>();
	
	cima.addAll(getMaiores(requisicoes));
	baixo.addAll(getMenores(requisicoes));
	
	Collections.sort(cima);
	Collections.sort(baixo);
	Collections.reverse(baixo);
	
	requisicoes.clear();
	
	requisicoes.addAll(cima);
	requisicoes.addAll(baixo);

	
	for (int i = 0; i < requisicoes.size(); i++) {
		if(i == requisicoes.size()-1 ){
			disco.setPosicao(requisicoes.get(0));
		}
		
	}
	disco.imprimeLook(requisicoes, 750L, disco.getPosicao()+1);
	
	
	
	System.out.println(disco.getPosicao());


}

	
	}
	
	

