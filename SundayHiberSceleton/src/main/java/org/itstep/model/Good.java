package org.itstep.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table( name="goods" )
public class Good {

	@Id
	@Column( name="article_id")
	private String articleId;
	
	@Column( name="good_name", length=300, nullable=false)
	private String name;
	
	@Column( name="price" )
	private Integer price;
	
	public Good() {
	}

	public Good(String articleId, String name, Integer price) {
		this.articleId = articleId;
		this.name = name;
		this.price = price;
	}
	
	
}
