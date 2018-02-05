package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class EventoDepoisInserir {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @param Entidade
	 * @return Var
	 */
	// Evento_depois_Inserir
	public static Var Executar(Var Entidade) throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				System.out.println(Var.valueOf("Chegou aqui\n").getObjectAsString());
				return Var.VAR_NULL;
			}
		}.call();
	}

}
