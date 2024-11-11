package com.example.freshV.domainEntity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

/**
 * This table class creates the Join table. 
 * In a nutshell it creates an object of the join relationship 
 * between the the two tables  
 */

@Entity
public class Comment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1090151199901636584L;
	
	private String text;
	
	@Column(length = 500)
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	@EmbeddedId
	public CommentId getCommentId() {
		return commentId;
	}
	public void setCommentId(CommentId commentId) {
		this.commentId = commentId;
	}
	private CommentId commentId;
}
