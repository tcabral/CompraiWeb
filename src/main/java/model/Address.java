/**
 * 
 */
package model;

import enums.AddressTypeEnum;

/**
 * @author Thiago Cabral (tkbral@gmail.com)
 *
 */
public class Address extends AbstractModel {

	private AddressTypeEnum addressType;
	
	private String description;
	
	private Integer number;
	
	private String complement;

	/**
	 * @return the addressType
	 */
	public AddressTypeEnum getAddressType() {
		return addressType;
	}

	/**
	 * @param addressType the addressType to set
	 */
	public void setAddressType(AddressTypeEnum addressType) {
		this.addressType = addressType;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the number
	 */
	public Integer getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(Integer number) {
		this.number = number;
	}

	/**
	 * @return the complement
	 */
	public String getComplement() {
		return complement;
	}

	/**
	 * @param complement the complement to set
	 */
	public void setComplement(String complement) {
		this.complement = complement;
	}
	
}
