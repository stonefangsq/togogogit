package net.togogo.springmvcweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("hello")
public class HelloController {

	//指定一个访问路径
	@RequestMapping(value="hello_sayHello")
	public String sayHello(String name){
		System.out.println("hello,"+name);
		return "index.jsp";
	}
	
	//根据模板映射
	//http://localhost:8080/springmvcweb1238/login/stone/123.do
	@RequestMapping("/login/{username}/{password}")
	public String login(@PathVariable("username") String name,@PathVariable("password")String pwd){
		System.out.println("login,name==>"+name+",pwd==>"+pwd);
		return "index.jsp";
	}
	
	/**
	 * 测试访问方法限定
	 * @return
	 */
	@RequestMapping(value="/do_post",method={RequestMethod.POST,RequestMethod.GET})
//	@PostMapping("/do_post")
//	@GetMapping
//	@DeleteMapping
//	@PutMapping
	public String doPost(){
		System.out.println("****doPost()*****");
		return "index.jsp";
	}
	
}
