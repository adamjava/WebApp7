package service;

import javax.ejb.Stateless;


@Stateless
public class HelloBean {
	public String getHello(){
		return "Hello World from EJB Bean";
	}

}
