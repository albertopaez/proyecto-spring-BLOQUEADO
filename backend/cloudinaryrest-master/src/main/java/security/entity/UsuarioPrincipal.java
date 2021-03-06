//package security.entity;
//
//import java.util.Collection;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.validation.constraints.NotNull;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//public class UsuarioPrincipal implements UserDetails {
//	
//	private String userName;
//	private String password;
//	private Collection<? extends GrantedAuthority> authorities;
//	
//	public UsuarioPrincipal(String userName, String password, Collection<? extends GrantedAuthority> authorities) {
//		super();
//		this.userName = userName;
//		this.password = password;
//		this.authorities = authorities;
//	}
//	
//	public static UsuarioPrincipal build(Usuario usuario) {
//		List<GrantedAuthority> authorities = 
//				usuario.getRoles().stream().map(rol -> new SimpleGrantedAuthority(
//						rol.getRolNombre().name())).collect(Collectors.toList());
//		return new UsuarioPrincipal(usuario.getUserName(), usuario.getPassword(), authorities);
//	}
//	
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		// TODO Auto-generated method stub
//		return authorities;
//	}
//	@Override
//	public String getPassword() {
//		// TODO Auto-generated method stub
//		return password;
//	}
//	@Override
//	public String getUsername() {
//		// TODO Auto-generated method stub
//		return userName;
//	}
//	@Override
//	public boolean isAccountNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//	@Override
//	public boolean isAccountNonLocked() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//	@Override
//	public boolean isCredentialsNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//	@Override
//	public boolean isEnabled() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//}
