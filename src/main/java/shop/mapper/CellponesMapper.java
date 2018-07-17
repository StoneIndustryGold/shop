package shop.mapper;

import java.util.List;

import shop.pojo.Cellpones;

public interface CellponesMapper {
	List<Cellpones> findAll();
	
	Cellpones findOne(int id);
	
	void update(Cellpones cellpones);
	
	void insertinto(Cellpones cellpones);
	
	void detele(Integer id);
}
