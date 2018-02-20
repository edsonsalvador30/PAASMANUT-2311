package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Teste {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @param Entidade
	 * @return Var
	 */
	// teste
	public static Var Executar(Var Entidade) throws Exception {
		return new Callable<Var>() {

			private Var item = Var.VAR_NULL;

			public Var call() throws Exception {
				item = cronapi.database.Operations.query(Var.valueOf("app.entity.Role"),
						Var.valueOf("select r from Role r"));
				cronapi.database.Operations.updateField(item, Var.VAR_NULL, Var.VAR_NULL);
				return cronapi.database.Operations.getField(item, Var.valueOf("this[0].useid"));
			}
		}.call();
	}

}
