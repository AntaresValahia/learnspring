package cn.sm1234.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/requestMapping")
public class RequestMappingUsage {

	/*
	 * value的属性
	 */
	@RequestMapping(value = "test1")
	public ModelAndView test1() {
		System.out.println("RequestMappingUsage的test1");

		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "spring mvc test1");

		mv.setViewName("success");
		return mv;
	}

	/*
	 * method属性
	 */
	@RequestMapping(value = "methodTest", method = RequestMethod.POST)
	public ModelAndView methodTest() {
		System.out.println("RequestMappingUsage的method");

		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "spring mvc test1");

		mv.setViewName("success");
		return mv;
	}

	/*
	 * params属性
	 */
	@RequestMapping(value = "paramsTest", method = RequestMethod.GET, params = { "name" })
	public ModelAndView paramsTest() {
		System.out.println("RequestMappingUsage的params");

		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "spring mvc params test");

		mv.setViewName("success");
		return mv;
	}
}
