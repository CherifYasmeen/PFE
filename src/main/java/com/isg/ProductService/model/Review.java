package com.isg.ProductService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Review implements Serializable {
	@Id
	private String id;
	@NotNull
	private String customer;
	@NotNull
	private String product;
	@NotNull
	private String comment;
	@NotNull
	private int note;
	@NotNull
	private Date reviewDate;
	
	


}
