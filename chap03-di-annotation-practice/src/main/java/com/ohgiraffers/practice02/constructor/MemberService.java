package com.ohgiraffers.practice02.constructor;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("memberServiceConstructor")
public class MemberService {

    private MemberDAO memberDAO;

    public Map<Long, MemberDTO> selectMember() {
        return memberDAO.selectMember();
    }

}
