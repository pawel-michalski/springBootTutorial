package anra.mojaapka.controllers;
/**
 * @author Andrzej Radziejewski
 * @since 0.1
 */


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainPageController {
	
	
	@RequestMapping(value="/g", method=RequestMethod.GET)
	public String showMainPage() {
		return "index";
	}

}
