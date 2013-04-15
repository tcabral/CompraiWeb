/**
 * 
 */
package model;

/**
 * @author Thiago Cabral (tkbral@gmail.com)
 *
 */
public class ClientPJ extends Client {

	/**
	 * Razão Social
	 */
	private String companyName;
	
	/**
	 * Nome Fantasia
	 */
	private String tradingName;

	/**
	 * Inscrição Estadual
	 */
	private String stateRegistration;
	
	private String cnpj;

	public ClientPJ() {
		super();
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @return the tradingName
	 */
	public String getTradingName() {
		return tradingName;
	}

	/**
	 * @param tradingName the tradingName to set
	 */
	public void setTradingName(String tradingName) {
		this.tradingName = tradingName;
	}

	/**
	 * @return the stateRegistration
	 */
	public String getStateRegistration() {
		return stateRegistration;
	}

	/**
	 * @param stateRegistration the stateRegistration to set
	 */
	public void setStateRegistration(String stateRegistration) {
		this.stateRegistration = stateRegistration;
	}

	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
