package com.timesheet.app.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the client database table.
 * 
 */
@Entity
@Table(name="client")
@NamedQuery(name="Client.findAll", query="SELECT c FROM Client c")
public class Client {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="client_id")
	private long clientId;

	@Column(name="client_address")
	private String clientAddress;

	@Column(name="client_city")
	private String clientCity;

	@Column(name="client_country")
	private String clientCountry;

	@Column(name="client_email")
	private String clientEmail;

	@Column(name="client_fax")
	private String clientFax;

	@Column(name="client_name")
	private String clientName;

	@Column(name="client_phone")
	private String clientPhone;

	@Column(name="client_postalcode")
	private String clientPostalcode;

	@Column(name="client_state")
	private String clientState;

	@Column(name="client_website")
	private String clientWebsite;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_datetime")
	private Date createdDatetime;

	@Column(name="created_user")
	private String createdUser;

	@Column(name="fiscal_information")
	private String fiscalInformation;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="modified_datetime")
	private Date modifiedDatetime;

	@Column(name="modified_user")
	private String modifiedUser;

	private String status;

	//bi-directional many-to-one association to Project
	@OneToMany(mappedBy="client")
	private List<Project> projects;

	public Client() {
	}
	
	

	public Client(int clientId, String clientAddress, String clientCity, String clientCountry, String clientEmail,
			String clientFax, String clientName, String clientPhone, String clientPostalcode, String clientState,
			String clientWebsite, Date createdDatetime, String createdUser, String fiscalInformation,
			Date modifiedDatetime, String modifiedUser, String status) {
		super();
		this.clientId = clientId;
		this.clientAddress = clientAddress;
		this.clientCity = clientCity;
		this.clientCountry = clientCountry;
		this.clientEmail = clientEmail;
		this.clientFax = clientFax;
		this.clientName = clientName;
		this.clientPhone = clientPhone;
		this.clientPostalcode = clientPostalcode;
		this.clientState = clientState;
		this.clientWebsite = clientWebsite;
		this.createdDatetime = createdDatetime;
		this.createdUser = createdUser;
		this.fiscalInformation = fiscalInformation;
		this.modifiedDatetime = modifiedDatetime;
		this.modifiedUser = modifiedUser;
		this.status = status;
		
	}



	public long getClientId() {
		return this.clientId;
	}

	public void setClientId(long clientId) {
		this.clientId = clientId;
	}

	public String getClientAddress() {
		return this.clientAddress;
	}

	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}

	public String getClientCity() {
		return this.clientCity;
	}

	public void setClientCity(String clientCity) {
		this.clientCity = clientCity;
	}

	public String getClientCountry() {
		return this.clientCountry;
	}

	public void setClientCountry(String clientCountry) {
		this.clientCountry = clientCountry;
	}

	public String getClientEmail() {
		return this.clientEmail;
	}

	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}

	public String getClientFax() {
		return this.clientFax;
	}

	public void setClientFax(String clientFax) {
		this.clientFax = clientFax;
	}

	public String getClientName() {
		return this.clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientPhone() {
		return this.clientPhone;
	}

	public void setClientPhone(String clientPhone) {
		this.clientPhone = clientPhone;
	}

	public String getClientPostalcode() {
		return this.clientPostalcode;
	}

	public void setClientPostalcode(String clientPostalcode) {
		this.clientPostalcode = clientPostalcode;
	}

	public String getClientState() {
		return this.clientState;
	}

	public void setClientState(String clientState) {
		this.clientState = clientState;
	}

	public String getClientWebsite() {
		return this.clientWebsite;
	}

	public void setClientWebsite(String clientWebsite) {
		this.clientWebsite = clientWebsite;
	}

	public Date getCreatedDatetime() {
		return this.createdDatetime;
	}

	public void setCreatedDatetime(Date createdDatetime) {
		this.createdDatetime = createdDatetime;
	}

	public String getCreatedUser() {
		return this.createdUser;
	}

	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}

	public String getFiscalInformation() {
		return this.fiscalInformation;
	}

	public void setFiscalInformation(String fiscalInformation) {
		this.fiscalInformation = fiscalInformation;
	}

	public Date getModifiedDatetime() {
		return this.modifiedDatetime;
	}

	public void setModifiedDatetime(Date modifiedDatetime) {
		this.modifiedDatetime = modifiedDatetime;
	}

	public String getModifiedUser() {
		return this.modifiedUser;
	}

	public void setModifiedUser(String modifiedUser) {
		this.modifiedUser = modifiedUser;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}





	
	
}