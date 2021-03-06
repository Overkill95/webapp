package it.hibernate;
// Generated 22-feb-2019 8.27.08 by Hibernate Tools 5.0.6.Final

import java.sql.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 * Titles generated by hbm2java
 */
@Entity
@Table(name = "titles", catalog = "employees")
public class Titles implements java.io.Serializable {

	private TitlesId id;
	private Employees employees;
	private Date toDate;

	public Titles() {
	}

	public Titles(TitlesId id, Employees employees) {
		this.id = id;
		this.employees = employees;
	}

	public Titles(TitlesId id, Employees employees, Date toDate) {
		this.id = id;
		this.employees = employees;
		this.toDate = toDate;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "empNo", column = @Column(name = "emp_no", nullable = false)),
			@AttributeOverride(name = "title", column = @Column(name = "title", nullable = false, length = 50)),
			@AttributeOverride(name = "fromDate", column = @Column(name = "from_date", nullable = false, length = 10)) })
	public TitlesId getId() {
		return this.id;
	}

	public void setId(TitlesId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_no", nullable = false, insertable = false, updatable = false)
	//@XmlInverseReference(mappedBy ="titleses")
	public Employees getEmployees() {
		return this.employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	@Column(name="to_date")
	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

}
