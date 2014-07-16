package inc.john.belajar.bean;

import inc.john.belajar.bean.enumeration.Religion;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer implements Serializable {

	private static final long serialVersionUID = -6807418216390164757L;
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String name;
	@Column
	private String handphone;
	@Column
	@Enumerated(EnumType.STRING)
	private Religion religion;
	
	public Customer(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Customer(String name) {
		super();
		this.name = name;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Religion getReligion() {
		return religion;
	}
	public void setReligion(Religion religion) {
		this.religion = religion;
	}
	public String getHandphone() {
		return handphone;
	}
	public void setHandphone(String handphone) {
		this.handphone = handphone;
	}
	
}
