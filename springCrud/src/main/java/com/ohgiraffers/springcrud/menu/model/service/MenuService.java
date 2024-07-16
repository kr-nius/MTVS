package com.ohgiraffers.springcrud.menu.model.service;

import com.ohgiraffers.springcrud.menu.model.dao.MenuMapper;
import com.ohgiraffers.springcrud.menu.model.dto.CategoryDTO;
import com.ohgiraffers.springcrud.menu.model.dto.MenuDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MenuService {

    private final MenuMapper menuMapper;

    // 인자로 받는 MenuMapper = 인터페이스 MenuMapper
    public MenuService(MenuMapper menuMapper) { this.menuMapper = menuMapper; }


    public List<MenuDTO> findAllMenu() { return menuMapper.findAllMenu(); }

    public List<CategoryDTO> findAllCategory() { return menuMapper.findAllCategory(); }

    @Transactional
    public void registNewMenu(MenuDTO newMenu) { menuMapper.registNewMenu(newMenu); };
}

