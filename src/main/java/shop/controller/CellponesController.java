package shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import shop.pojo.Cellpones;
import shop.sevice.CellponesService;

@Controller
public class CellponesController {
	private CellponesService cellponesService;
	
	
	@Autowired
	public CellponesController(CellponesService cellponesService) {
		this.cellponesService = cellponesService;
	}



	@RequestMapping(method=RequestMethod.GET,value="/Cellpones/list")
	public String cellponesFind(Model model) {
		System.out.println("测试");
		List<Cellpones> cellpones=cellponesService.findAll();
		
		model.addAttribute("cellpones", cellpones);
		return "Cellpones-list";
	}
	@RequestMapping(method=RequestMethod.GET,value="/cellpones/{id}/details")
	public String cellponesDetails(@PathVariable int id,Model model) {
		Cellpones  cellpones=cellponesService.findOne(id);
		model.addAttribute("cellpones", cellpones);
		return "cellpones-details";
	}
	@RequestMapping(method=RequestMethod.GET,value="/cellpones/{id}/update")
	public String cellponesUpdate(@PathVariable int id) {
		
		return"cellpones-update";
	}
}
