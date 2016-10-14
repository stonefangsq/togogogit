package net.togogo.springmvcweb.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.togogo.springmvcweb.domain.Admin;

/**
 * 测试绑定参数
 * @author stone
 *
 */
@Controller
public class BindArgsController {

	/**
	 * 测试绑定HttpServletRequest,HttpServletResponse,HttpSession
	 * @return
	 */
	@RequestMapping("/bind_scope/{name}")
	public String bindScopeArgs(@PathVariable("name") String username,HttpServletRequest req,HttpServletResponse res,HttpSession session,Model model){
		req.setAttribute("scope", username);
		session.setAttribute("scope", "session");
		//将数据存放到request中
		model.addAttribute("model", "model");
		return "/index.jsp";
	}
	
	/**
	 * 测试绑定基本类型
	 */
	@RequestMapping("/bind_base/{time}/{flag}")
	public String bindBaseType(@PathVariable("time") int time,@PathVariable("flag") boolean flag){
		System.out.println("time==>"+time);
		System.out.println("flag==>"+flag);
		return "/index.jsp";
	}
	
	/**
	 * 测试绑定对象
	 * @return
	 * 
	 * <form action="bind_object.do">
	 * 	name:<input type="text" name="name"/> <br>
	 * 	password:<input type="text" name="password"/> <br>
	 * <input type="submit" value="submit"/> <br>
	 * </form>
	 */
	@RequestMapping("/bind_object")
	public String bindObject(Admin admin){
		System.out.println(admin);
		//
//		return "forward:/index.jsp";
		return "redirect:/index.jsp";
	}
	
	/**
	 * 测试绑定数组
	 * @param ids
	 * @return
	 */
	@RequestMapping("/bind_array")
	public String bindArray(String[] ids){
		System.out.println(Arrays.toString(ids));
		return "/index.jsp";
	}
	
	/**
	 * 测试绑定对象
	 * @return
	 * 
	 * <form action="bind_object.do">
	 * 	name:<input type="text" name="id"/> <br>
	 * 	password:<input type="text" name="name"/> <br>
	 * <input type="submit" value="submit"/> <br>
	 * </form>
	 */
	@RequestMapping("/bind_params")
	public String bindParams(@RequestParam(value="id",required=true) String userid,String name){
		return "/index.jsp";
	}
}
