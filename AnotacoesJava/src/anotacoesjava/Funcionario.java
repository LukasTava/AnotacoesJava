
package anotacoesjava;

public class Funcionario {
	protected double salario;

	@MinhaAnotacao("O salário total do funcionário = salário + bonus")
	public double getTotalSalario(double bonus) {
		return 0;
	}
}

