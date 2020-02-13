package com.adaming.accueil.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	DataSource datasourceBean;

//	public DataSource getDatasourceBean() {
//		return datasourceBean;
//	}
//
//	public void setDatasourceBean(DataSource datasourceBean) {
//		this.datasourceBean = datasourceBean;
//	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(datasourceBean)
				.usersByUsernameQuery("select username,password, activated from users where username=?")
				.authoritiesByUsernameQuery(
						"select u.userName, r.roleName from users u, roles r where u.idUsers = r.idUsers and u.userName =?");
//		super.configure(auth);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.httpBasic().and().authorizeRequests().antMatchers("/Etudiant/Ajout").hasAuthority("ADMINETD");
		http.httpBasic().and().authorizeRequests().antMatchers("/Matiere/Ajout").hasAuthority("ADMINMTR");
		http.formLogin().loginPage("/login").passwordParameter("j_password").usernameParameter("j_username")
				.defaultSuccessUrl("/").failureUrl("/erreur"); // 'j_password' et 'j_username' dans login.jsp, '/' dans
																// HomeController, 'erreur' pour erreur.jsp
//		super.configure(http);
	}

}
