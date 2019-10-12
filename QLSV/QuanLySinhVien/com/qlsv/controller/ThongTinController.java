package com.qlsv.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qlsv.bean.SinhVien;


@Controller
public class ThongTinController {
	@RequestMapping(value="/xemdiem", method = RequestMethod.POST)
	public String xemdiem(HttpServletRequest req) {
		String masv = req.getParameter("txtMaSV");
		ApplicationContext app = new ClassPathXmlApplicationContext("bean-sv.xml");
		//	resources/bean-sv.xml
		SinhVien sv = (SinhVien)app.getBean(masv);
		
		req.setAttribute("hoten", sv.getHoTen());
		req.setAttribute("maSV", sv.getMaSV());
		req.setAttribute("soThich", sv.getSoThich());
		req.setAttribute("uocMo", sv.getUocMo());
		req.setAttribute("mucTieu", sv.getSoThich());
		return "danhsachsinhvien";
	}
}
