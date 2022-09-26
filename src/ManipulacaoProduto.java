import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ManipulacaoProduto {

	public static void main(String[] args) {

		Produtos p1 = new Produtos();
		p1.setId(1);
		p1.setNome("presunto");
		p1.setCategoria(CategoriaEnum.frios);
		p1.setPreco(15);
		
		Produtos p2 = new Produtos();
		p2.setId(2);
		p2.setNome("coca-cola");
		p2.setCategoria(CategoriaEnum.bebida);
		p2.setPreco(20);
		
		Produtos p3 = new Produtos();
		p3.setId(3);
		p3.setNome("maça");
		p3.setCategoria(CategoriaEnum.hortifruti);
		p3.setPreco(9);
		
		Produtos p4 = new Produtos();
		p4.setId(4);
		p4.setNome("papel higienico");
		p4.setCategoria(CategoriaEnum.higiene);
		p4.setPreco(14);
		
		Produtos p5 = new Produtos();
		p5.setId(5);
		p5.setNome("PÃO");
		p5.setCategoria(CategoriaEnum.padaria);
		p5.setPreco(600);
		
		List<Produtos> lista = List.of(p1, p2, p3, p4, p5);
		
		Optional <Produtos> existe =
				lista.stream().filter(e -> e.getCategoria() == CategoriaEnum.bebida).findFirst();
				if(existe.isPresent()){
					if(existe.get().getPreco() > 50)
					System.out.println("Bebida acima de 50 reais: " + existe.get().getNome());
				}
				
		List<Produtos> bebidas = 
				lista.stream().filter(e -> e.getCategoria() == CategoriaEnum.bebida).collect(Collectors.toList());
		bebidas.forEach(e -> {
			System.out.println("Bebidas: " + e.getNome());
		});
		
		List<Produtos> padaria = 
				lista.stream().filter(e -> e.getCategoria() == CategoriaEnum.padaria).collect(Collectors.toList());
		padaria.forEach(e -> {
			System.out.println("Produtos na Padaria: " + padaria.size());
		});
			
	}
}	
	


