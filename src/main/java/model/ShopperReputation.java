/**
 * 
 */
package model;

/**
 * @author Thiago Cabral (tkbral@gmail.com)
 *
 */
public class ShopperReputation extends AbstractModel {

	private ReputationLevelEnum reputationLevel;
	
	private Client client;

	/**
	 * @return the reputationLevel
	 */
	public ReputationLevelEnum getReputationLevel() {
		return reputationLevel;
	}

	/**
	 * @param reputationLevel the reputationLevel to set
	 */
	public void setReputationLevel(ReputationLevelEnum reputationLevel) {
		this.reputationLevel = reputationLevel;
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
}
