package inc.john.belajar.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class Role implements Serializable {

	private static final long serialVersionUID = 6529450806034254865L;
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long id;
	@Column(name="ROLE_NAME")
	private String roleName;
	@ManyToMany(mappedBy="roles") // Liat field private di user.
	private List<User> users;
	
	/*
	 * Constructor
	 */
	public Role() { }
	
	public Role(Long id, String roleName, List<User> users) {
		super();
		this.id = id;
		this.roleName = roleName;
		this.users = users;
	}


	/*
	 * Getter And Setter
	 */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
}
