package com.azampgw.Base;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
@JacksonXmlRootElement(localName="serviceProvider")
public class ServiceProvider{
	public String getSpId() {
		return spId;
	}
	public void setSpId(String spId) {
		this.spId = spId;
	}
	public String getSpPassword() {
		return spPassword;
	}
	public void setSpPassword(String spPassword) {
		this.spPassword = spPassword;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	@NotNull(message = "spId is required.")
    public String spId;
	@NotNull(message = "spPassword is required.")
    public String spPassword;
	@NotNull(message = "timeStamp is required.")
    public String timeStamp;
    

}