/**
 * 
 */
package model;

import java.util.Calendar;

/**
 * @author Thiago Cabral (tkbral@gmail.com)
 *
 */
public class BuyOffer extends AbstractModel {

	private Client client;
	
	private Product product;
	
	private Calendar offerDate;
	
	private Calendar initialLimitDate;
	
	private Calendar finalLimitDate;
	
	private Integer productQuantity;
	
	private Double offerValue;
	
	private String observation;

	
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
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
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
	 * @return the initialLimitDate
	 */
	public Calendar getInitialLimitDate() {
		return initialLimitDate;
	}

	/**
	 * @param initialLimitDate the initialLimitDate to set
	 */
	public void setInitialLimitDate(Calendar initialLimitDate) {
		this.initialLimitDate = initialLimitDate;
	}

	/**
	 * @return the finalLimitDate
	 */
	public Calendar getFinalLimitDate() {
		return finalLimitDate;
	}

	/**
	 * @param finalLimitDate the finalLimitDate to set
	 */
	public void setFinalLimitDate(Calendar finalLimitDate) {
		this.finalLimitDate = finalLimitDate;
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
