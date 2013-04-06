package model;

import java.sql.Date;

import enums.StatusEnum;

public class Usuario extends AbstractModel {

	private String login;
	
	private String password;
	
	private Cliente cliente;
	
	private GrupoUsuario grupo;
	
	private StatusEnum status;
	
	private Date dataCriacao;
	
	private Date dataAlteracaoSenha;

	public Usuario() {
		this.status = StatusEnum.INATIVO;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the grupo
	 */
	public GrupoUsuario getGrupo() {
		return grupo;
	}

	/**
	 * @param grupo the grupo to set
	 */
	public void setGrupo(GrupoUsuario grupo) {
		this.grupo = grupo;
	}

	/**
	 * @return the status
	 */
	public StatusEnum getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	/**
	 * @return the dataCriacao
	 */
	public Date getDataCriacao() {
		return dataCriacao;
	}

	/**
	 * @param dataCriacao the dataCriacao to set
	 */
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	/**
	 * @return the dataAlteracaoSenha
	 */
	public Date getDataAlteracaoSenha() {
		return dataAlteracaoSenha;
	}

	/**
	 * @param dataAlteracaoSenha the dataAlteracaoSenha to set
	 */
	public void setDataAlteracaoSenha(Date dataAlteracaoSenha) {
		this.dataAlteracaoSenha = dataAlteracaoSenha;
	}
	
}
