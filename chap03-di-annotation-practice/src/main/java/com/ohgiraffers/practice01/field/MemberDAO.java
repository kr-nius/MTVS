package com.ohgiraffers.practice01.field;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MemberDAO {

    private final Map<Long, MemberDTO> memberMap;

    public MemberDAO(){
        memberMap = new HashMap<>();
        memberMap.put(1L, new MemberDTO(1L, "가나다"));
        memberMap.put(2L, new MemberDTO(2L, "라마바"));
    }

    public Map<Long, MemberDTO> selectMember() {
        return memberMap;
    }

}
