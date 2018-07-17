package shop.sevice;

import java.util.List;

import shop.pojo.Cellpones;

public interface CellponesService {
	List<Cellpones> findAll();

	Cellpones findOne(int id);
}
