package models.member;

import lombok.*;

import java.time.LocalDateTime;

@Builder @Data
@NoArgsConstructor @AllArgsConstructor          // 완벽한 AM은 FM이다 -- 편법으로 기본생성자 생성하기
public class Member {
    private long userNo;
    private String userId;
    private String userPw;
    private String userNm;
    private String email;
    private String mobile;
    private LocalDateTime regDt;    // 가입일시
    private LocalDateTime modDt;
}
