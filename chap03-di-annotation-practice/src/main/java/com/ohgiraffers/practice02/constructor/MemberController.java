package com.ohgiraffers.practice02.constructor;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.stereotype.Controller;

import java.util.Map;

@Controller
public class MemberController {
    private MemberService memberService;

    public Map<Long, MemberDTO> selectMember() {
        return memberService.selectMember();
    }
}
