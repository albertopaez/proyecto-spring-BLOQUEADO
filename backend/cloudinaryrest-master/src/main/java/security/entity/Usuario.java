//package security.entity;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import javax.persistence.Column;
//import javax.persistence.JoinColumn;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.validation.constraints.NotNull;
//
//@Entity
//public class Usuario {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
//	@NotNull
//	@Column(unique = true)
//	private String userName;
//	@NotNull
//	private String password;
//	@NotNull
//	@ManyToMany
//	@JoinTable(name = "usuario_rol", joinColumns = @JoinColumn(name = "usuario_id"),
//	inverseJoinColumns = @JoinColumn(name = "rol_id"))
//	private Set<Rol> roles = new HashSet<>();
//	
//	
//	public Usuario() {
//		super();
//	}
//
//
//	public Usuario(@NotNull String userName, @NotNull String password) {
//		super();
//		this.userName = userName;
//		this.password = password;
//	}
//
//
//	public int getId() {
//		return id;
//	}
//
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//
//	public String getUserName() {
//		return userName;
//	}
//
//
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//
//
//	public String getPassword() {
//		return password;
//	}
//
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//
//	public Set<Rol> getRoles() {
//		return roles;
//	}
//
//
//	public void setRoles(Set<Rol> roles) {
//		this.roles = roles;
//	}
//	
//	
//	
//	
//
//}
