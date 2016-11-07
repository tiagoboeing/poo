package atividade_prova;

public class Perfumaria extends Produto {

	@Override
	public boolean vender(Cliente c, double qtdd, Produto p) {
		if (c.getSaldo() >= 200)
			return super.vender(c, qtdd, p);
		return false;
	}
}