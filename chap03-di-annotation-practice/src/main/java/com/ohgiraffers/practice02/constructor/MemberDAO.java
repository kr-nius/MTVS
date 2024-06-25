package com.ohgiraffers.practice02.constructor;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MemberDAO {
    private final Map<Long, MemberDTO> memberMap;

    public MemberDAO() {
        memberMap = new HashMap<>();
        memberMap.put(1L, new MemberDTO(1L, "ABC"));
        memberMap.put(2L, new MemberDTO(2L, "DEF"));
    }

    public Map<Long, MemberDTO> selectMember() {
        return memberMap;
    }

}
