package com.phuoc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.duy.TaiKhoan;

@Controller
public class HelloSpring {
	@RequestMapping("/duy")
	public String model(HttpServletRequest request)
	{	
		BeanFactory context = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		TaiKhoan tk = (TaiKhoan)context.getBean("taikhoan");
		
		String user = request.getParameter("user"); 
		String pass = request.getParameter("pass"); 
		String tb = ""; 
		if(user.equals(tk.getUsername()) && pass.equals(tk.getPassword())) { 
			request.setAttribute("username", tk.getUsername());
			request.setAttribute("password", tk.getPassword());
		}
		else
		{ 
			tb = "Tên đăng nhập hoặc mật khẩu không chính xác!";
		}
		request.setAttribute("tb", tb);
		
		return "duy";
	}
	
	@RequestMapping("/a")//sai request mapping
	public String dangKy(HttpServletRequest request) {
		
		return "singup";
	}
}
