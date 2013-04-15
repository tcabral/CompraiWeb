/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Thiago Cabral (tkbral@gmail.com)
 *
 */
public class UserGroup extends AbstractModel {

	private String name;
	
	private List<String> permissionList;

	public UserGroup() {
		this.permissionList = new ArrayList<String>();
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
	 * @return the permissionList
	 */
	public List<String> getPermissionList() {
		return permissionList;
	}

	/**
	 * @param permissionList the permissionList to set
	 */
	public void setPermissionList(List<String> permissionList) {
		this.permissionList = permissionList;
	}

}
