package teste;

import modelo.Profissional;
import modelo.SuperTabela;
import modelo.Tabela;

public class TesteTabels {
	public static void main(String[] args) {
		Tabela tab = new Tabela();
		tab.setId(10);
		tab.setNome("coisa");
		printTableData(tab);
		tab.setPk(20);
		printTableData(tab);
		Profissional p = new Profissional();
		p.setNome("nome");
		p.setCpf(11122233345L);
		printTableData(p);
		p.setCpf(99922233345L);
		printTableData(p);
	}

	private static void printTableData(SuperTabela tab) {
		if(tab.isCamposObrigatoriosPreenchidos()){
			System.out.println("Campos obrigatórios preenchidos.");
		}
		System.out.println("Classe:"+tab.getClass().getName());
		System.out.println("Table Name:"+tab.getTableName());
		System.out.println("Tabela pknome:"+ tab.getPkName());
		System.out.println("Valor PK:"+ tab.getPk());
		System.out.println("------------------------------");
	}
}
