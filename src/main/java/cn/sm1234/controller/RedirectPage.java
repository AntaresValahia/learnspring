package cn.sm1234.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/view")
public class RedirectPage {

	/*
	 * 转发
	 */
	@RequestMapping(value = "forward")
	public void forward(HttpServletRequest request, HttpServletResponse response, HttpSession session)
			throws ServletException, IOException {
		System.out.println("forward test 1");

		request.getRequestDispatcher("/WEB-INF/JSP/success.jsp").forward(request, response);
	}

	/*
	 * 重定向
	 */
	@RequestMapping(value = "redirect")
	public void redirect(HttpServletRequest request, HttpServletResponse response, HttpSession session)
			throws ServletException, IOException {
		System.out.println("redirect test 1");

		response.sendRedirect(request.getContextPath() + "/index.jsp");//只能到index.jsp;

	}

	/*
	 * 通过model and view；
	 */
	@RequestMapping("forwardbymad")
	public ModelAndView forwardbyMAD() {
		ModelAndView mv = new ModelAndView("success");
		// mv.setViewName("success");

		return mv;
	}

	/*
	 * 字符串形式转发
	 */
	@RequestMapping("forwardbysting")
	public String forwardByString() {
		System.out.println("通过字符串跳转");
		return "success";
	}

	/*
	 * 推荐此种方式，转发
	 */
	@RequestMapping("forwardbystingandmodel")
	public String forwardbystingandmodel(Model model) {
		System.out.println("通过字符串跳转");
		model.addAttribute("name", "通过字符串转发，推荐使用");
		return "success";
	}

	/*
	 * 推荐此种方式，重定向
	 */
	@RequestMapping("redirectbystingandmodel")
	public String redirectbystingandmodel(Model model) {
		System.out.println("通过字符串跳转，重定向");
		model.addAttribute("name", "推荐使用，重定向");
		return "redirect:/index.jsp";

	}
}
