package com.example.test1.controller;

import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.test1.Util.SHA256;
import com.example.test1.dao.UserService;
import com.example.test1.model.User;
import com.example.test1.dao.WeatherImpl;
import com.google.gson.Gson;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/login.do") 
    public String login(Model model) throws Exception{

        return "/login";
    }

	@RequestMapping("/main.do") 
    public String main(Model model) throws Exception{
        return "/index";
    }
	
	@RequestMapping("/logout.do") 
    public String logout(Model model , final HttpServletRequest request) throws Exception{
		HttpSession session = request.getSession();

		session.removeAttribute("user_id");
		session.removeAttribute("user_name");
		return "/login";
    }
	
	@GetMapping("/weather")
    public void main() {
		WeatherImpl.getWeather();
	}


	
	@RequestMapping(value = "/login.dox", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String login(Model model, @RequestParam HashMap<String, Object> map, final HttpServletRequest request) throws Exception {
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
        
		SHA256 sha256 = new SHA256();
        
		String cryptogram = "";
		
		if ( !map.get("pwd").equals("") ) {	
			try {
				cryptogram = sha256.encrypt((String) map.get("pwd"));
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		map.replace("pwd",cryptogram);
		
		resultMap = userService.userLogin(map);
		
		if (resultMap.get("result").equals("success")) {
			HttpSession session = request.getSession();
			session.setAttribute("user_id", resultMap.get("uid"));   
			session.setAttribute("user_name", resultMap.get("uname")); 
			session.setMaxInactiveInterval(1800);
			
			String loginUserId = (String) session.getAttribute("user_id");
			
			//JSONParser parser = new JSONParser();
			//JSONObject object = (JSONObject) resultMap.get("user");
			
			User user = (User) resultMap.get("user");
			System.out.println(user.getName());
			System.out.println(loginUserId);
		}
		
		return new Gson().toJson(resultMap);
	}
	
	@RequestMapping(value = "/login.dox", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void login1(Model model, @RequestParam HashMap<String, Object> map) throws Exception {
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		resultMap = userService.userLogin(map);

		//return new Gson().toJson(resultMap);
	}
}
