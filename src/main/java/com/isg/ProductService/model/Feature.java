package com.isg.ProductService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.*;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Feature implements Serializable {
	@Id
	private String id;
	@NotNull
	private String name;
	@NotNull
	private String value;
	private String product;

	
}
