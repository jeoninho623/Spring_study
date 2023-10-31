package controllers.member;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
    /*@Autowired
    private HttpServletRequest request;
    @GetMapping("/member/login")
    public String login(RequestLogin form, HttpServletRequest request, HttpServletResponse response) {
        System.out.println(form);
        System.out.println(response);
        System.out.println(request.getParameter("userId"));
        return "member/login";
    }*/

    @GetMapping("/member/login")
    public String login() {

        return "member/login";  // login.html
    }
}