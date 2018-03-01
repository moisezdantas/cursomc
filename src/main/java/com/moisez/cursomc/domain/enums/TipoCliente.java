package com.moisez.cursomc.domain.enums;

public enum TipoCliente {
	
	PESSOAFISICA(1, "Pessoa Fisica"),
	PESSOAJURIDICA(2, "Pesssoa Juridica");
	
	private int cod;
	private String descricao;
	
	private TipoCliente(int cod, String descricao){
		this.cod = cod;
		this.descricao = descricao;
	}

	/**
	 * @return the cod
	 */
	public int getCod() {
		return cod;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoCliente toEnum(Integer cod){
		
		if(cod == null){
			return null;
		}
		
		for (TipoCliente tipo: TipoCliente.values()) {
			if(cod.equals(cod)){
				return tipo;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
	
}
