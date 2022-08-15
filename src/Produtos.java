
public class Produtos {

	private double ID;
	private String nome;
	private CategoriaEnum categoria;
	private double preço;
	
	public double getID() {
		return ID;
	}
	public void setID(double iD) {
		ID = iD;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	public CategoriaEnum getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaEnum categoria) {
		this.categoria = categoria;
	}
	
	
}
