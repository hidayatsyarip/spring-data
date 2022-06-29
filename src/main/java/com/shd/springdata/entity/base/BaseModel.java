package com.shd.springdata.entity.base;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.shd.springdata.serializer.JsonDateTimeDeserializer;
import com.shd.springdata.serializer.JsonDateTimeSerializer;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public class BaseModel implements Serializable {

	private static final long serialVersionUID = 1L;
	@Temporal(TemporalType.TIMESTAMP)
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@JsonDeserialize(using = JsonDateTimeDeserializer.class)
	private Date createdAt;
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@JsonDeserialize(using = JsonDateTimeDeserializer.class)
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdatedAt;

	private String createdBy;
	private String lastUpdatedBy;
	
	@Column(name = "is_deleted")
	private boolean deleted;
}
