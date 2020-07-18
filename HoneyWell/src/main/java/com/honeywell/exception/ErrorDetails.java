package com.honeywell.exception;

 
import java.sql.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "error")

public class ErrorDetails {
	  private Date timestamp;
	  private String message;
	  private String details;

	  public ErrorDetails(Date timestamp, String message, String details) {
	    super();
	    this.timestamp = timestamp;
	    this.message = message;
	    this.details = details;
	  }
	  
} 