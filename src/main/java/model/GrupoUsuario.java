/**
 * 
 */
package model;

import java.util.List;

/**
 * @author Thiago Cabral (tkbral@gmail.com)
 *
 */
public class GrupoUsuario extends AbstractModel {

	private String nome;
	
	private List<String> permissoes;

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the permissoes
	 */
	public List<String> getPermissoes() {
		return permissoes;
	}

	/**
	 * @param permissoes the permissoes to set
	 */
	public void setPermissoes(List<String> permissoes) {
		this.permissoes = permissoes;
	}
	
}
