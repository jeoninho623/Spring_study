package controllers.member;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.member.Member;
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
    public String login(Model model) {

        model.addAttribute("userId","user99");
        model.addAttribute("userPw","비밀번호");

        return "member/login";  // login.html
    }

    @GetMapping("/member/info")
    public String info(Model model) {

        Member member = Member.builder()
                .userNo(1L)
                .userId("<h1>user01</h1>")      // th:text 인식못함  th:utext 인식가능
                .userPw("123456")
                .userNm("사용자01")
                .email("user01@test.org")
                .mobile("010-0000-0000")
                .build();

        model.addAttribute("member", member);

        return "/member/info";
    }
}