package model;

import java.util.Calendar;

import enums.UserStatusEnum;

/**
 * Entidade representativa de um Usuário 
 * @author Thiago Cabral (tkbral@gmail.com)
 *
 */
public class User extends AbstractModel {

	private String login;
	
	private String password;
	
	private Client client;
	
	private UserGroup group;
	
	private UserStatusEnum status;
	
	private Calendar creationDate;
	
	private Calendar modifiedPasswordDate;

	public User() {
		this.status = UserStatusEnum.INATIVE;
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
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * @return the group
	 */
	public UserGroup getGroup() {
		return group;
	}

	/**
	 * @param group the group to set
	 */
	public void setGroup(UserGroup group) {
		this.group = group;
	}

	/**
	 * @return the status
	 */
	public UserStatusEnum getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(UserStatusEnum status) {
		this.status = status;
	}

	/**
	 * @return the creationDate
	 */
	public Calendar getCreationDate() {
		return creationDate;
	}

	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Calendar creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * @return the modifiedPasswordDate
	 */
	public Calendar getModifiedPasswordDate() {
		return modifiedPasswordDate;
	}

	/**
	 * @param modifiedPasswordDate the modifiedPasswordDate to set
	 */
	public void setModifiedPasswordDate(Calendar modifiedPasswordDate) {
		this.modifiedPasswordDate = modifiedPasswordDate;
	}

}
