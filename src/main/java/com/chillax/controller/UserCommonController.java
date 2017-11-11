package com.chillax.controller;  
  
import java.util.List;  
  
import javax.annotation.Resource;  
import javax.servlet.http.HttpServletRequest;  
  
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
  
import com.chillax.dto.User;
import com.chillax.dto.UserCommon;
import com.chillax.service.IUserCommonService;
import com.chillax.service.IUserService;  
  
@Controller  
@RequestMapping("/usercommon")  
public class UserCommonController {  
    @Resource  
    private IUserCommonService userCommonService;  
       
    
    
    @RequestMapping("/loginMethod")  
    public String loginUser(HttpServletRequest request,Model model){  
        String name = request.getParameter("name");  
        String password = request.getParameter("password");  
        UserCommon user = userCommonService.login(name, password);  
        if(user == null){
        	model.addAttribute("error", "未找到用户");
        	return "";
        }
        model.addAttribute("user", user);
        request.getSession().putValue("user", user);
        model.addAttribute("user", user);  
        return "showUser";  
    }  
    
    @RequestMapping("/showUser")  
    public String showUser(HttpServletRequest request,Model model){  
        int userId = Integer.parseInt(request.getParameter("id"));
        UserCommon user = userCommonService.getUserById(userId);  
        model.addAttribute("user", user);
        return "showUser";  
    }  
      
    @RequestMapping("/logoutMethod")  
    public String logoutUser(HttpServletRequest request,Model model){
    	request.getSession().setMaxInactiveInterval(-1);
        return "login";  
    }  
    
    @RequestMapping("/loginJsp")  
    public String fowardLoginJsp(){  
        return "login";  
    }  
    
    @RequestMapping("/regiestJsp")  
    public String fowardRegiestJsp(){  
        return "regiest";  
    } 
    
    @RequestMapping("/forgetJsp")  
    public String fowardforgetJsp(){  
        return "forget";  
    }
    
    
    @RequestMapping("/regiestMethod")  
    public String registdUser(HttpServletRequest request,Model model){  
        String name = request.getParameter("name");  
        String password = request.getParameter("password");  
        String passwordConfirm = request.getParameter("passwordConfirm");  
        UserCommon user = new UserCommon();
        user.setAccout_num(name);
        user.setPassword(password);
        userCommonService.registered(user); 
        return "login";  
    }
    
    @RequestMapping("/updateMethod")  
    public String updateUser(HttpServletRequest request,Model model){ 
    	UserCommon user = (UserCommon) request.getSession().getAttribute("user");
    	user.setNick(request.getParameter("name"));
    	user.setGender(request.getParameter("sex"));
    	user.setBirthday(request.getParameter("brith"));
    	user.setAccount_city(request.getParameter("identents"));
    	user.setNumber(request.getParameter("mobile"));
    	user.setSay(request.getParameter("say"));
    	user.setSchool(request.getParameter("school"));
    	user.setLike(request.getParameter("like"));
    	user.setIntroduction(request.getParameter("intro"));
        userCommonService.updateUser(user); 
        return "login";  
    }
    
    
    @RequestMapping("/userList")  
    public String userList(HttpServletRequest request,Model model){  
        List<UserCommon> uList = userCommonService.getHotUser();  
        model.addAttribute("uList", uList);  
        return "userList";  
    }  
      
    
    
    
}  