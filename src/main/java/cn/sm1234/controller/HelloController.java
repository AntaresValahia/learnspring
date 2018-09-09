package cn.sm1234.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		System.out.println("执行HelloController的hello方法");
		// 保存数据到ModelAndView（就相当于保存到request域对象）；
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "spring mvc twice");
		mv.setViewName("/WEB-INF/JSP/success.jsp");
		return mv;
	}

	@RequestMapping("/view")
	public ModelAndView view() {
		System.out.println("执行HelloController的hello方法");
		// 保存数据到ModelAndView（就相当于保存到request域对象）；
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "spring mvc twice");
		
		// 返回逻辑路径
		mv.setViewName("success");
		return mv;
	}
}
