package com.orastays.authserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "master_identity")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class IdentityEntity extends CommonEntity {

	private static final long serialVersionUID = -7368788269931727804L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "identity_id")
	@JsonProperty("identityId")
	private Long identityId;
	
	@Column(name = "name")
	@JsonProperty("name")
	private String name;

	@Override
	public String toString() {
		return Long.toString(identityId);
	}
}
