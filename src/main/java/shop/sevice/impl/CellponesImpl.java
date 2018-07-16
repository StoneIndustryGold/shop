package shop.sevice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.mapper.CellponesMapper;
import shop.pojo.Cellpones;
import shop.sevice.CellponesService;
@Service
public class CellponesImpl implements CellponesService {
	private CellponesMapper CellponesMapper;
	
	@Autowired
	public CellponesImpl(shop.mapper.CellponesMapper cellponesMapper) {
		CellponesMapper = cellponesMapper;
	}


	@Override
	public List<Cellpones> findAll() {
		// TODO Auto-generated method stub
		return CellponesMapper.findAll();
	}

}
