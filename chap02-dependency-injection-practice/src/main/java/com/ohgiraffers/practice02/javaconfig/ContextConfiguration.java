package com.ohgiraffers.practice02.javaconfig;

import com.ohgiraffers.common.BoardDTO;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public MemberDTO memberGenerator() {

        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(1L);
        memberDTO.setNickname("개발자");

        return memberDTO;
    }

    @Bean
    public BoardDTO boardGenerator() {

        BoardDTO boardDTO = new BoardDTO();
        boardDTO.setId(1L);
        boardDTO.setTitle("의존성 주입 연습");
        boardDTO.setContent("게시글의 작성자 객체를 주입 받아볼게요!");
        boardDTO.setWriter(memberGenerator());

        return boardDTO;

    }

}
