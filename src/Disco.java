import java.util.ArrayList;

public class Disco {
	private int posicao;
	private int tamanho;
	private ArrayList<Integer> requisicao = new ArrayList<Integer>();
	private long tempoBusca;
	
	public Disco(int tamanho, int posicao, ArrayList<Integer> requisicao, long tempoBusca){
		this.posicao = posicao;
		this.requisicao = requisicao;
		this.tempoBusca = tempoBusca;
		this.tamanho = tamanho;
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public ArrayList<Integer> getRequisicao() {
		return requisicao;
	}

	public void setRequisicao(ArrayList<Integer> requisicao) {
		this.requisicao = requisicao;
	}

	public long getTempoBusca() {
		return tempoBusca;
	}

	public void setTempoBusca(int tempoBusca) {
		this.tempoBusca = tempoBusca;
	}
	
public void imprimePosicao(ArrayList<Integer> requisicoes, long tempoBusca, int tamanho) throws InterruptedException {
		
		String imprimeRequisicoes ="";
		for (int i = 0; i < requisicoes.size(); i++) {
			imprimeRequisicoes+= requisicoes.get(i) +",";
		}
		System.out.println("Lista de Requisicoes:" + imprimeRequisicoes);
		
		for (Integer posicao : requisicoes) {
			System.out.println("posicao do braco: "+posicao);
			Thread.sleep(tempoBusca);
		}
		
	}
	public void imprimeScan(ArrayList<Integer> requisicoes, long tempoBusca, int tamanho) throws InterruptedException {
		
		String imprimeRequisicoes ="";
		
		for (int i = 0; i < requisicoes.size(); i++) {
			imprimeRequisicoes+= requisicoes.get(i) +",";
		}
		System.out.println("Lista de Requisicoes:" + imprimeRequisicoes);
		
		for(int i = 0; i < tamanho; i++){
			
			if(!requisicoes.contains(i)){
				System.out.println("Posicao do braco " +i+" : Sem Requicoes");
				
			}else{
				System.out.println("Posicao do braco "+ i+ " : Requisicao Atendida") ;
				
			}
			Thread.sleep(tempoBusca);
			
		}
		
		System.err.println("voltando\n");
		
		for(int i = tamanho-1; i>= 0; i --){
		
				System.out.println("Posicao do braco "+ i+ " : Sem Requisicao") ;
				
		
			
			Thread.sleep(tempoBusca);
			
		}
		
		
		
		
		
		
	}

public void imprimeCSCAN(ArrayList<Integer> requisicoes, long tempoBusca, int tamanho) throws InterruptedException {
		
		String imprimeRequisicoes ="";
		
		for (int i = 0; i < requisicoes.size(); i++) {
			imprimeRequisicoes+= requisicoes.get(i) +",";
		}
		System.out.println("Lista de Requisicoes:" + imprimeRequisicoes);
		
		
		for(int i = 0; i < tamanho; i++){
			
			if(!requisicoes.contains(i)){
				System.out.println("Posicao do braco " +i+" : Sem Requicoes");
				
			}else{
				System.out.println("Posicao do braco "+ i+ " : Requisicao Atendida") ;
				
			}
			Thread.sleep(tempoBusca);
			
		}
		System.err.println("voltando\n");
		for(int i = tamanho-1; i>= 0; i --){
			System.out.println("Posicao do braco " +i+" : NAO ATENDE");
			Thread.sleep(tempoBusca);
			
		}
			
		
}
	
public void imprimeLook(ArrayList<Integer> requisicoes, long tempoBusca, int tamanho) throws InterruptedException {
		
		String imprimeRequisicoes ="";
		
		for (int i = 0; i < requisicoes.size(); i++) {
			imprimeRequisicoes+= requisicoes.get(i) +",";
		}
		System.out.println("Lista de Requisicoes:" + imprimeRequisicoes);
		
		for(int i = 0; i < tamanho; i++){
			
			if(!requisicoes.contains(i)){
				System.out.println("Posicao do braco " +i+ " : Sem Requicoes");
				
			}else{
				System.out.println("Posicao do braco "+ i+ " : Requisicao Atendida") ;
				
			}
			Thread.sleep(tempoBusca);
			
		}
		System.err.println("voltando\n");
		for(int i = tamanho-1; i>= 0; i --){
	
				System.out.println("Posicao do braco " +i+ " : Sem Requicoes");
				
			
			Thread.sleep(tempoBusca);
			
		}
	
			
		
	}
}
