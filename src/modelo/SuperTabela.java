package modelo;

import utils.ReflexaoTabela;

public abstract class SuperTabela<TypePK> {
	@SuppressWarnings("unchecked")
	public TypePK getPk() {
		return (TypePK) ReflexaoTabela.getPkValue(this);
	}
	public String getPkName() {
		return ReflexaoTabela.getPkName(this);
	}
	public void setPk(TypePK value) {
		ReflexaoTabela.setPkValue(this,value);
	}
	public String getTableName(){
		return ReflexaoTabela.getTableName(this);
	}
	public Boolean isCamposObrigatoriosPreenchidos(){return ReflexaoTabela.isCamposObrigatoriosPreenchidos(this);}
}
