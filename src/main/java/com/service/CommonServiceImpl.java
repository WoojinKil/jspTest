package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CommonDao;
import com.dto.CommonCode;

@Service
public class CommonServiceImpl implements CommonService{

	@Autowired
	private CommonDao commonDao;

	@Override
	public List<CommonCode> selecteCodelist() {
		// TODO Auto-generated method stub
		//List<CommonCode> codeList = commonDao.selectCodeList();
		CommonCode code1 = new CommonCode();
        code1.setCode("1번");
        code1.setCodeName("1이름");

        CommonCode code2 = new CommonCode();
        code2.setCode("2번");
        code2.setCodeName("2이름");

        // 여러 개의 코드를 리스트로 반환
        List<CommonCode> list = new ArrayList<CommonCode>();
        return list;
		
	}
	
}
