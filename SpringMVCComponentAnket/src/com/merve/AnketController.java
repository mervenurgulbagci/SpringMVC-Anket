package com.merve;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnketController {
	static Anket ank= new Anket();
	
	@RequestMapping("/")
	public String form1(Model m) {
		Anket ank= new Anket();
		m.addAttribute("anket", ank);
		return "form1";
	}

	@RequestMapping("/form2")
	public String form2(HttpServletRequest req, Model m) {
		
		ank.setAd(req.getParameter("ad"));
		ank.setSoyad(req.getParameter("soyad"));
		ank.setYas(Integer.parseInt(req.getParameter("yas")));
		ank.setMezuniyetYili(req.getParameter("mezuniyetYili"));
		ank.setOkul(req.getParameter("okul"));
		System.out.println(ank.toString());
		m.addAttribute("anket", ank);
		
		return "form2";
	}
	
	@RequestMapping("/saveform")
	public String savePersonel(HttpServletRequest req, Model m) {
		ank.setDogumYeri(req.getParameter("dogumYeri"));
		String hobiler2=req.getParameter("hobiler");
		
		
		ank.setYabanciDil("yabanciDil");
		ank.setMeslek(req.getParameter("meslek"));
		ank.setEhliyet(req.getParameter("ehliyet"));
		m.addAttribute("anket", ank);
		return "confirm";
	}
}


