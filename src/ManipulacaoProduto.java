import java.util.List;
import java.util.Optional;

public class ManipulacaoProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Produtos p1 = new Produtos();
		p1.setID(1);
		p1.setNome("presunto");
		p1.setCategoria(CategoriaEnum.frios);
		p1.setPreço(15);
		
		Produtos p2 = new Produtos();
		p2.setID(2);
		p2.setNome("coca-cola");
		p2.setCategoria(CategoriaEnum.bebida);
		p2.setPreço(20);
		
		Produtos p3 = new Produtos();
		p3.setID(3);
		p3.setNome("maça");
		p3.setCategoria(CategoriaEnum.hortifruti);
		p3.setPreço(9);
		
		Produtos p4 = new Produtos();
		p4.setID(4);
		p4.setNome("papel higienico");
		p4.setCategoria(CategoriaEnum.higiene);
		p4.setPreço(14);
		
		Produtos p5 = new Produtos();
		p5.setID(5);
		p5.setNome("PÃO");
		p5.setCategoria(CategoriaEnum.padaria);
		p5.setPreço(600);
		
		List<Produtos> lista = List.of(p1, p2, p3, p4, p5);
		
		Optional <Produtos> exist =
				lista.stream().filter(e -> e.getCategoria() == CategoriaEnum.bebida).findFirst();
				if(exist.isPresent())
				{
					System.out.println("Bebida acima de 50: "+ e.getPreço());
				}	
			
	}
}	
	


