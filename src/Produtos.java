
public class Produtos {

	private double id;
	private String nome;
	private CategoriaEnum categoria;
	private int preco;
	
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public CategoriaEnum getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaEnum categoria) {
		this.categoria = categoria;
	}
	
	
}
