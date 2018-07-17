package shop.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.annotation.RequestScope;

import shop.pojo.Cellpones;
import shop.sevice.CellponesService;

@Controller
public class CellponesController {
	private CellponesService cellponesService;
	
	
	@Autowired
	public CellponesController(CellponesService cellponesService) {
		this.cellponesService = cellponesService;
	}


	//手机集合页面
	@RequestMapping(method=RequestMethod.GET,value="/Cellpones/list")
	public String cellponesFind(Model model) {
		System.out.println("测试");	
		List<Cellpones> cellpones=cellponesService.findAll();
		model.addAttribute("cellpones", cellpones);
		return "Cellpones-list";
	}//详情页


	
	@RequestMapping(method=RequestMethod.GET,value="/cellpones/{id}/details")
	public String cellponesDetails(@PathVariable int id,Model model) {
		Cellpones  cellpones=cellponesService.findOne(id);
		model.addAttribute("cellpones", cellpones);
		return "cellpones-details";
	}
	//更新页面先往数据库在往页走
	@RequestMapping(method=RequestMethod.GET,value="/cellpones/{id}/update")
	public String cellponesUpdate(@PathVariable int id,Model model) {
		Cellpones  cellpones=cellponesService.findOne(id);
		model.addAttribute("cellpones", cellpones);
		return"cellpones-update";		
	}
	//更新页面网数据库走
	@RequestMapping(method=RequestMethod.POST,value="/cellpones/{id}/update")
	public String update(@ModelAttribute Cellpones cellpones) {
		
		cellponesService.update(cellpones);
		return "redirect:/Cellpones/list";
	}
	@RequestMapping(method=RequestMethod.GET,value="/cellpones/add")
	public String cellponesAdd(@ModelAttribute Cellpones cellpones ,Model model) {
		
		return"cellpones-update";
	}
	@RequestMapping(method=RequestMethod.POST,value="/cellpones/add")
	public String add(@ModelAttribute @Valid Cellpones cellpones,
									BindingResult bindingResult,
									Model model) {
		if(bindingResult.hasErrors()) {
			
			return"cellpones-update";
		}
		return"redirect:/Cellpones/list";
	}
}
