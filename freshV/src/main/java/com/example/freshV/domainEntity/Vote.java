package com.example.freshV.domainEntity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Vote {
	@EmbeddedId
	public VoteId getVoteId() {
		return voteId;
	}
	public void setVoteId(VoteId voteId) {
		this.voteId = voteId;
	}
	public boolean isUpvote() {
		return upvote;
	}
	public void setUpvote(boolean upvote) {
		this.upvote = upvote;
	}
	VoteId voteId;
	private boolean upvote;
	
}
