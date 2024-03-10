package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.dto.CommonCode;
import com.service.CommonService;

@RestController
@RequestMapping("/common")
public class CommonController {
	private static final Logger log = Logger.getLogger(CommonController.class.getName());
	
	@Autowired
	private CommonService commonService;
	
	@RequestMapping(value = "/code.do", method = RequestMethod.GET)
	public ModelAndView CodePage(Model model) {
		ModelAndView mav = new ModelAndView();

		mav.setViewName("code");
	return mav;
	
	}
	
	
    @RequestMapping(value = "/selectcode.do", method = RequestMethod.POST)
    public ResponseEntity<Map<String, Object>> commonCode() {
        Map<String, Object> map = new HashMap<>();
        List<CommonCode> list = commonService.selecteCodelist();
        map.put("result", list);
        return null;
    }
}
