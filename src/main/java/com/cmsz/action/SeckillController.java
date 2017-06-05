package com.cmsz.action;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cmsz.bean.Seckill;
import com.cmsz.service.SeckillService;



@Component
@RequestMapping("/cmsz") 
public class SeckillController {
	@Autowired
	private SeckillService seckillService;
	

	@RequestMapping(value = "/{seckillId}/detail", method = RequestMethod.GET)
	public String detail(@PathVariable("seckillId") Long seckillId, Model model) {
		Seckill seckill = seckillService.getById(seckillId);
		System.out.println(seckill.toString());
		
		model.addAttribute("seckill", seckill);
		return "detail";
	}

}