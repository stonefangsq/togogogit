package net.togogo.springmvcweb.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.togogo.springmvcweb.domain.Admin;

/**
 * 测试绑定参数
 * @author stone
 *
 */
@Controller
public class BodyController {

	
	
	@RequestMapping("/bind_request_body")
	public String bindObject(@RequestBody Admin admin){
		System.out.println(admin);
		return admin.toString();
	}
	
	
}
