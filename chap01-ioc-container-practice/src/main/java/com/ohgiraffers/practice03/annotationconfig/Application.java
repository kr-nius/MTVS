package com.ohgiraffers.practice03.annotationconfig;

import com.ohgiraffers.common.BoardDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        String[] beanNames = context.getBeanDefinitionNames();
        for(String beanName : beanNames) {
            System.out.println(beanName);
        }

        BoardDAO boardDAO = context.getBean("boardDAO", BoardDAO.class);

        System.out.println(boardDAO.selectBoard(1L));
        System.out.println(boardDAO.selectBoard(3L));
        System.out.println(boardDAO.insertBoard(new BoardDTO(5L, "스프링 수업", "적응 중", "개발자")));
        System.out.println(boardDAO.selectBoard(5L));

    }

}
