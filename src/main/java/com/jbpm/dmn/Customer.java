package com.jbpm.dmn;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Customer implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String name;
	private java.lang.String email;
	private java.lang.String level;
	private java.lang.String supportPriority;

	public Customer() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getEmail() {
		return this.email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.lang.String getLevel() {
		return this.level;
	}

	public void setLevel(java.lang.String level) {
		this.level = level;
	}

	public java.lang.String getSupportPriority() {
		return this.supportPriority;
	}

	public void setSupportPriority(java.lang.String supportPriority) {
		this.supportPriority = supportPriority;
	}

	public Customer(java.lang.String name, java.lang.String email,
			java.lang.String level, java.lang.String supportPriority) {
		this.name = name;
		this.email = email;
		this.level = level;
		this.supportPriority = supportPriority;
	}

}