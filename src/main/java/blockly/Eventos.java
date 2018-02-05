package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Eventos {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// Eventos
	public static Var AoObterDados() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				System.out.println(Var.valueOf("Chegou em Ao Obter Dados").getObjectAsString());
				return Var.VAR_NULL;
			}
		}.call();
	}

	/**
	 *
	 * @return Var
	 */
	// Eventos
	public static Var antesInserir() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				System.out.println(Var.valueOf("Chegou em Antes de Inserir\n").getObjectAsString());
				return Var.VAR_NULL;
			}
		}.call();
	}

	/**
	 *
	 * @return Var
	 */
	// Eventos
	public static Var antesdeatualizar() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				System.out.println(Var.valueOf("Chegou em Antes de Atualizar\n").getObjectAsString());
				return Var.VAR_NULL;
			}
		}.call();
	}

	/**
	 *
	 * @return Var
	 */
	// Eventos
	public static Var antesdedeletar() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				System.out.println(Var.valueOf("Chegou em Antes de Deletar\n").getObjectAsString());
				return Var.VAR_NULL;
			}
		}.call();
	}

	/**
	 *
	 * @return Var
	 */
	// Eventos
	public static Var aonavegar() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				System.out.println(Var.valueOf("Chegou em Ao navegar\n").getObjectAsString());
				return Var.VAR_NULL;
			}
		}.call();
	}

	/**
	 *
	 * @return Var
	 */
	// Eventos
	public static Var depoisInserir2() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				System.out.println(Var.valueOf("Chegou em Depois de Inserir\n").getObjectAsString());
				return Var.VAR_NULL;
			}
		}.call();
	}

	/**
	 *
	 * @return Var
	 */
	// Eventos
	public static Var depoisdeatualizar() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				System.out.println(Var.valueOf("Chegou em Depois de Atualizar\n").getObjectAsString());
				return Var.VAR_NULL;
			}
		}.call();
	}

	/**
	 *
	 * @return Var
	 */
	// Eventos
	public static Var depoisdedeletar() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				System.out.println(Var.valueOf("Chegou em Depois de Deletar\n").getObjectAsString());
				return Var.VAR_NULL;
			}
		}.call();
	}

}
