package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.ChuyenBay;
import com.example.entity.MayBay;
import com.example.repository.ChuyenBayRepository;
import com.example.repository.MayBayRepository;

@RestController()
@RequestMapping("/")
public class MayBayController {
	@Autowired
	private MayBayRepository mayBayRepository ;
	
	//Cau2
	@GetMapping("/2")
    public List<MayBay> findMayBayCoTamBayLonHon10k() {
        List<MayBay> dsMayBay = mayBayRepository.findMayBayCoTamBayLonHon10k();
		return dsMayBay;      
    }
	
	//Cau7
	@GetMapping("/7")
    public String countMayBay() {
        return "Số loại máy báy Boeing: " +mayBayRepository.countLoaiMB("Boeing");
    }
    
}
