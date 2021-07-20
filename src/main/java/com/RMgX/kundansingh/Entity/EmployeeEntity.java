package com.RMgX.kundansingh.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Table(name = "employees")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "first_name")
	private String firstname;

	@Column(name = "last_name")
	private String last_name;

	@Column(name = "designation")
	private String designation;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_record_entity_id", nullable = false, updatable = false)
	private List<AssetsEntity> Assets = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public List<AssetsEntity> getAssets() {
		return Assets;
	}

	public void setAssets(List<AssetsEntity> assets) {
		Assets = assets;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", firstname=" + firstname + ", last_name=" + last_name + ", designation="
				+ designation + ", Assets=" + Assets + "]";
	}

	public EmployeeEntity(int id, String firstname, String last_name, String designation, List<AssetsEntity> assets) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.last_name = last_name;
		this.designation = designation;
		Assets = assets;
	}

	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static boolean isPresent() {
		// TODO Auto-generated method stub
		return false;
	}

	public static Object get() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Optional<EmployeeEntity> findById(int id2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable<EmployeeEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
