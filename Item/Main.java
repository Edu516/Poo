package Item;

public class Main {

	public static void main(String[] args) {
		Livro l= new Livro();
		CD cd = new CD();
		VHS vhs = new VHS();
		
		l.setAutor("reinaldo");
		l.setCodigo(1);
		l.setDescricao("Ranger");
		
		System.out.println(l);
		
		cd.setAlbum("Red");
		cd.setArtista("Luan");
		cd.setCodigo(2);
		cd.setDescricao("O amanha");
		cd.setDuracao(2.45f);
		cd.setFaixas(10);
		cd.setGravadora("Discos do amanhã");
		
		System.out.println(cd);
		
		vhs.setCodigo(3);
		vhs.setDescricao("Filme de terror");
		vhs.setGravadora("Discos do amanhã");
		vhs.setTitulo("Reds reds");
		
		System.out.println(vhs);

	}

}
