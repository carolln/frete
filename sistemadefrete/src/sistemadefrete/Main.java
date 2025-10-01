package sistemadefrete;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ServicoDeEntrega delivery = new ServicoDeEntrega();

		 // para uma entrega de 10 km feita por um funcionario com um carro
		 Funcionario funcionario = new Funcionario();
		 Carro carro = new Carro();
		 Scanner input = new Scanner(System.in);

		 System.out.println("Simulando uma entrega de 10km feita por um funcionario com um Carro");

		 delivery.append(funcionario);
		 delivery.append(carro);

		 System.out.println("Calculando uma entrega de 10km para:");
		 System.out.println("- Entregador funcionario");
		 System.out.println("- Carro da empresa");
		 System.out.println("        -     *              ,-----,");
		 System.out.println("    -     *    -    *    ,--'---:---\\--,");
		 System.out.println("       *       -   *     ==(o)-----(o)==J");
		 System.out.println();

		 System.out.println("Custo total: R$ " + delivery.CalcularCustoTotal(10));

		 System.out.println();
		 System.out.println("continuar? (press <enter>)");

		 input.nextLine();

		 delivery.clear();

		 Autonomo autonomo = new Autonomo();
		 Motocicleta moto = new Motocicleta();

		 delivery.append(autonomo);
		 delivery.append(moto);

		 System.out.println("Calculando uma entrega de 25 km para:");
		 System.out.println("- Entregador funcionario");
		 System.out.println("- Moto");
		 System.out.println("          _");
		 System.out.println("        D/_       -        *");
		 System.out.println("        /(_`._,-.     *              -");
		 System.out.println(" _____(o) `--'(o)_____   -    *");
		 System.out.println();

		 System.out.println("Custo total: R$ " + delivery.CalcularCustoTotal(25));


	}

}
