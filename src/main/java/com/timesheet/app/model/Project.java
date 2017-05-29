package com.timesheet.app.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the project database table.
 * 
 */
@Entity
@NamedQuery(name="Project.findAll", query="SELECT p FROM Project p")
public class Project implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="project_id")
	private long projectId;

	@Column(name="billing_method")
	private String billingMethod;

	private String color;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_datetime")
	private Date createdDatetime;

	@Column(name="created_user")
	private String createdUser;

	private String description;

	@Column(name="hours_estimate")
	private String hoursEstimate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="modified_datetime")
	private Date modifiedDatetime;

	@Column(name="modified_user")
	private String modifiedUser;

	@Column(name="project_name")
	private String projectName;

	@Column(name="project_template")
	private String projectTemplate;

	private String status;

	
	//bi-directional many-to-one association to Client
	@ManyToOne
	@JoinColumn(name="client_id")
	private Client client;
	
	
	
	
	public Project(long projectId, String billingMethod, String color, Date createdDatetime, String createdUser,
			String description, String hoursEstimate, Date modifiedDatetime, String modifiedUser, String projectName,
			String projectTemplate, String status, Client client) {
		super();
		this.projectId = projectId;
		this.billingMethod = billingMethod;
		this.color = color;
		this.createdDatetime = createdDatetime;
		this.createdUser = createdUser;
		this.description = description;
		this.hoursEstimate = hoursEstimate;
		this.modifiedDatetime = modifiedDatetime;
		this.modifiedUser = modifiedUser;
		this.projectName = projectName;
		this.projectTemplate = projectTemplate;
		this.status = status;
		this.client = client;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	public Project() {
	}

	public long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getBillingMethod() {
		return this.billingMethod;
	}

	public void setBillingMethod(String billingMethod) {
		this.billingMethod = billingMethod;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHoursEstimate() {
		return this.hoursEstimate;
	}

	public void setHoursEstimate(String hoursEstimate) {
		this.hoursEstimate = hoursEstimate;
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

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectTemplate() {
		return this.projectTemplate;
	}

	public void setProjectTemplate(String projectTemplate) {
		this.projectTemplate = projectTemplate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public long getClientId()
	{
		return this.client.getClientId();
	}
	
	
}