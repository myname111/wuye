package com.wuye.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wuye.bean.Test;
import com.wuye.test.ITestService;

@Controller
@RequestMapping("/test")
public class TestAction {
   @Autowired
   private ITestService testService;
   
   @RequestMapping("/selectTest")
   public String selectTest(HttpServletRequest request,HttpServletResponse response,ModelMap modelMap,int id){
	   Test test = testService.getTestById(id);
	   modelMap.addAttribute("test", test);
	   return "test/selectTest";
   }
}
