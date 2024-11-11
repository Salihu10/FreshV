package com.example.freshV.domainEntity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;

@Embeddable
public class CommentId {
	private User userComment;
	private Feature featurcomment;
	
	@ManyToOne
	public User getUserComment() {
		return userComment;
	}
	public void setUserComment(User userComment) {
		this.userComment = userComment;
	}
	@ManyToOne
	public Feature getFeaturcomment() {
		return featurcomment;
	}
	public void setFeaturcomment(Feature featurcomment) {
		this.featurcomment = featurcomment;
	}

}
