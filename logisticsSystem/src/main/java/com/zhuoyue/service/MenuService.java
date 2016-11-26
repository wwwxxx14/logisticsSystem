package com.zhuoyue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Service;

import com.zhuoyue.dao.MenuDAO;
import com.zhuoyue.model.MenuInfo;

@Service
public class MenuService {
	@Autowired   
	MenuDAO menuDAO;   
	
	//检索顶部导航标题
    public List<MenuInfo> getTopMenu(){
   	 List<MenuInfo> menulist=menuDAO.getTopMenu();
   	 return menulist;
    }
    
    //检索侧面标题
    public List<MenuInfo> getSecondMenu(int parentMenu_id){
   	 List<MenuInfo> siderlist=menuDAO.getSecondMenu(parentMenu_id);
   	 return siderlist;
    }
    
    //根据菜单路径检索菜单id
    public int getMenuId(String menuPath){
    	return menuDAO.getMenuId(menuPath);
    }
    
    //根据菜单路径检索parentMenu_id
    public int getParentMenu_id(String menuPath){
    	return menuDAO.getParentMenu_id(menuPath);
    }
    

}
