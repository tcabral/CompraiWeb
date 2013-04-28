/**
 * 
 */
package model;

import java.util.Calendar;

/**
 * @author Thiago Cabral (tkbral@gmail.com)
 *
 */
public class SellOffer extends AbstractModel {

	private BuyOffer buyOffer;
	
	private Client client;
	
	private Calendar offerDate;
	
	private Integer productQuantity;
	
	private Double offerValue;
	
	private String observation;

	/**
	 * @return the buyOffer
	 */
	public BuyOffer getBuyOffer() {
		return buyOffer;
	}

	/**
	 * @param buyOffer the buyOffer to set
	 */
	public void setBuyOffer(BuyOffer buyOffer) {
		this.buyOffer = buyOffer;
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
	 * @return the offerDate
	 */
	public Calendar getOfferDate() {
		return offerDate;
	}

	/**
	 * @param offerDate the offerDate to set
	 */
	public void setOfferDate(Calendar offerDate) {
		this.offerDate = offerDate;
	}

	/**
	 * @return the productQuantity
	 */
	public Integer getProductQuantity() {
		return productQuantity;
	}

	/**
	 * @param productQuantity the productQuantity to set
	 */
	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}

	/**
	 * @return the offerValue
	 */
	public Double getOfferValue() {
		return offerValue;
	}

	/**
	 * @param offerValue the offerValue to set
	 */
	public void setOfferValue(Double offerValue) {
		this.offerValue = offerValue;
	}

	/**
	 * @return the observation
	 */
	public String getObservation() {
		return observation;
	}

	/**
	 * @param observation the observation to set
	 */
	public void setObservation(String observation) {
		this.observation = observation;
	}
}
