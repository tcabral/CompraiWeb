/**
 * 
 */
package model;

import enums.ProductTypeEnum;

/**
 * @author Thiago Cabral (tkbral@gmail.com)
 *
 */
public class Product extends AbstractModel {
	
	private String code;
	
	private String name;
	
	private ProductTypeEnum type;

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the type
	 */
	public ProductTypeEnum getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(ProductTypeEnum type) {
		this.type = type;
	}
}
