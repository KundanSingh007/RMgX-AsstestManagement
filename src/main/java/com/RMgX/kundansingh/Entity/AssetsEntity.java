package com.RMgX.kundansingh.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

public class AssetsEntity {

	@Entity
	@Table(name = "Employee")
	@Data
	@JsonIgnoreProperties(ignoreUnknown = true)
	public class Employee {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;

		@Column(name = "Name")
		private String name;

		@Column(name = "purchase_date")
		private String purchase_date;

		@Column(name = "condition_note")
		private String condition_note;

		@Column(name = "assignment_state")
		private String assignment_state;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPurchase_date() {
			return purchase_date;
		}

		public void setPurchase_date(String purchase_date) {
			this.purchase_date = purchase_date;
		}

		public String getCondition_noe() {
			return condition_note;
		}

		public void setCondition_noe(String condition_noe) {
			this.condition_note = condition_noe;
		}

		public String getAssignment_state() {
			return assignment_state;
		}

		public void setAssignment_state(String assignment_state) {
			this.assignment_state = assignment_state;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", purchase_date=" + purchase_date + ", condition_note="
					+ condition_note + ", assignment_state=" + assignment_state + "]";
		}

		public Employee(int id, String name, String purchase_date, String condition_note, String assignment_state) {
			super();
			this.id = id;
			this.name = name;
			this.purchase_date = purchase_date;
			this.condition_note = condition_note;
			this.assignment_state = assignment_state;
		}

		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

	}

	public static void save(AssetsEntity assetsServiceUpdate) {
		// TODO Auto-generated method stub
		
	}

	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setId(Object id) {
		// TODO Auto-generated method stub
		
	}

	public void setName(Object name) {
		// TODO Auto-generated method stub
		
	}

	public Object purchase_date() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object condition_note() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object assignment_state() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setpurchase_date(Object purchase_date) {
		// TODO Auto-generated method stub
		
	}

	public void setcondition_note(Object condition_note) {
		// TODO Auto-generated method stub
		
	}

	public void setassignment_state(Object assignment_state) {
		// TODO Auto-generated method stub
		
	}

}
