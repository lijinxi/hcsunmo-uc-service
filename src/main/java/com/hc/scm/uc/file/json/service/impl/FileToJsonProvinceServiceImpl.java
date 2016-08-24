package com.hc.scm.uc.file.json.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hc.scm.common.base.dal.BaseCrudDao;
import com.hc.scm.common.base.service.BaseCrudServiceImpl;
import com.hc.scm.uc.dao.file.json.model.Province;
import com.hc.scm.uc.file.json.service.FileToJsonProvinceService;


@Service("fileToJsonProvinceService")
public class FileToJsonProvinceServiceImpl extends BaseCrudServiceImpl implements FileToJsonProvinceService {

	@Override
	public BaseCrudDao init() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Province> getProvinceList() {
		// TODO Auto-generated method stub
		return null;
	}

}
