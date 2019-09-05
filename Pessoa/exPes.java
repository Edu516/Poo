package Pessoa;

public class exPes {

	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		
		pf.setCpf("000.000.000-01");
		pf.setEndereco("Rua dos bons");
		pf.setEstadoCivil("Solteiro");
		pf.setNome("Red Lok");
		
		System.out.println(pf);
		
		pj.setCnpj("0000.000.000.1");
		pj.setEndereco("Rua dos touros");
		pj.setTipoEmpresa("LTA");
		pj.setNome("Boi na chapa");
		
		System.out.println(pj);

	}

}
