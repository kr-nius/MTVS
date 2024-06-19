package com.ohgiraffers.practice02.javaconfig;

import com.ohgiraffers.common.BoardDTO;
import org.springframework.context.annotation.Bean;

public class ContextConfiguration {

    @Bean("board")
    public BoardDTO getBoard() {

        System.out.println("getBoard 호출!");

        return new BoardDTO(1L, "test1", "testContent", "testWriter");

    }

}
