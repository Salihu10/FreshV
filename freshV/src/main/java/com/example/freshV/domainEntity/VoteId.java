package com.example.freshV.domainEntity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;

/**
 * This class will create the join table
 */

@Embeddable
public class VoteId implements Serializable {

	private static final long serialVersionUID = -427221729366246291L;
	private User user;
	private Feature feature;

	@ManyToOne
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne
	public Feature getFeature() {
		return feature;
	}
public void setFeature(Feature feature) {
	this.feature = feature;
}


}
