package com.ohgiraffers.practice03.annotationconfig;

import com.ohgiraffers.common.BoardDTO;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class BoardDAO {

    private final Map<Long, BoardDTO> boardMap;

    public BoardDAO() {

        boardMap = new HashMap<>();

        boardMap.put(1L, new BoardDTO(3L, "스프링", "수업 중", "개발자"));
        boardMap.put(2L, new BoardDTO(4L, "썸머", "더웡", "개발자"));

    }

    public BoardDTO selectBoard(Long id) {
        return boardMap.get(id);
    }

    public boolean insertBoard(BoardDTO newBoard) {

        int before = boardMap.size();

        boardMap.put(newBoard.getId(), newBoard);

        int after = boardMap.size();

        return after > before ? true : false;

    }



}
