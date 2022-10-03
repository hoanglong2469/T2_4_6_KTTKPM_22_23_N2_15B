package com.example.controller;

import com.example.entity.ChuyenBay;
import com.example.repository.ChuyenBayRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/")
public class ChuyenBayController {
   
	@Autowired
	private ChuyenBayRepository chuyenBayRepository ;

    //Cau1
	@GetMapping("/1")
    public List<ChuyenBay> getChuyenBayDiDaLat() {
        String maGaDen = "DAD";
        List<ChuyenBay> dsChuyenBay = chuyenBayRepository.findChuyenBaystoGaDiDAD();
		return dsChuyenBay;      
    }
    
	//Cau4
	@GetMapping("/4")
    public List<ChuyenBay> getDoDaiChuyenBay() {
        List<ChuyenBay> dsChuyenBay = chuyenBayRepository.findDoDaiChuyenBay();
		return dsChuyenBay;      
    }
	
	//Cau5
	@GetMapping("/5")
    public List<ChuyenBay> getChuyenBaySG_BMV() {
        List<ChuyenBay> dsChuyenBay = chuyenBayRepository.findChuyenBaySG_BMV();
		return dsChuyenBay;      
    }
	
	@GetMapping("/6")
    public String countChuyenBay() {
        return "Số chuyến bay xuất phát từ Sài Gòn (SGN): " +chuyenBayRepository.countChuyenBay("SGN");
    }
}
