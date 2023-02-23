/**
 * 
 */
package com.tokio.cotizador.paso4.bean;

/**
 * @author jonathanfviverosmoreno
 *
 */
public enum ModoAuxiliar {
	esCotizacion (1),
	esEndoso (2),
	esRenovacion (3);
	
private int mov;
	
	private ModoAuxiliar(int mov){
		this.mov = mov;
	}
	
	public int getModoCotizacion(){
		return mov;
	}
}
