package app;

import entities.Funcionario;
import entities.Horista;
import entities.Terceiro;

public class TesteFun {

	public static void main(String[] args) {
		
		
		Funcionario func1 = new Funcionario("001","EPAMINONDAS");
		Terceiro ter1 = new Terceiro("010","MARIA",80.00);
		
		Horista colab1 = new Horista("111","MARCOS");
		
		System.out.println("Pagamento horista "+colab1.getNome()+" R$ "+colab1.pagamentoHorista(4, 20.55));

		func1.setHorasTrabalhadas(40);
		func1.setValorHora(10.00);
		
		ter1.setHorasTrabalhadas(40);
		ter1.setValorHora(10.00);
		
		System.out.println("Salario do funcionario "+func1.getNome()+" R$ "+func1.calcularSalario()+" ferias R$ "+func1.calcularSalarioFerias());
		System.out.println("Salario do funcionario "+ter1.getNome()+" R$ "+ter1.calcularSalario()+" ferias R$ "+ter1.calcularSalarioFerias());

	}

}
