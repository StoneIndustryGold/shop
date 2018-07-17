package shop.sevice;

import java.util.List;

import shop.pojo.Cellpones;

public interface CellponesService {
	List<Cellpones> findAll();

	Cellpones findOne(int id);
	
	void update(Cellpones cellpones);
	
	void insertinto(Cellpones cellpones);
}
