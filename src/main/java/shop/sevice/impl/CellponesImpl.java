package shop.sevice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shop.mapper.CellponesMapper;
import shop.pojo.Cellpones;
import shop.sevice.CellponesService;
@Service
@Transactional//获得事务的支持
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


	@Override
	public Cellpones findOne(int id) {
		// TODO Auto-generated method stub
		return CellponesMapper.findOne(id);
	}


	@Override
	public void update(Cellpones cellpones) {
		CellponesMapper.update(cellpones);
		
	}


	@Override
	public void insertinto(Cellpones cellpones) {
		CellponesMapper.insertinto(cellpones);
		
	}


	@Override
	public void detele(Integer id) {
		CellponesMapper.detele(id);
		
	}

}
