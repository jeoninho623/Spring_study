package controllers.member;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class JoinValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(RequestJoin.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        RequestJoin form = (RequestJoin) target;
        // 필수 항목 검증(userId, userPw, confirmUserPw, userNm, email)
        String userId = form.getUserId();
        String userPw = form.getUserPw();
        String confirmUserPw = form.getConfirmUserPw();
        String userNm = form.getUserNm();
        String email = form.getEmail();

        if(userId == null || userId.isBlank()) {
            errors.rejectValue("userId", "Required","아이디를 입력하세요ㅡㅡ;");
        }

        if(userPw == null || userPw.isBlank()) {
            errors.rejectValue("userPw","Required","비밀번호를 입력하세요ㅡㅡ;");
        }

        if(confirmUserPw == null || confirmUserPw.isBlank()) {
            errors.rejectValue("confirmUserPw","Required","비밀번호를 확인하세요;;");
        }

        if(userNm == null || userNm.isBlank()) {
            errors.rejectValue("userNm", "Required","이름을 입력하세요;;");
        }

        if (email == null || email.isBlank()) {
            errors.rejectValue("email","Required","이메일 좀 입력하세요");
        }
    }
}
