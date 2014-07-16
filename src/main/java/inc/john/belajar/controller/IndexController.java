package inc.john.belajar.controller;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
//@Scope("view")
public class IndexController implements Serializable {

	private static final long serialVersionUID = -8645107805701400666L;
	
	public String hello = "Hello World";
	
}
