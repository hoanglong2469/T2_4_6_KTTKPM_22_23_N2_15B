package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.NhanVien;
import com.example.repository.MayBayRepository;
import com.example.repository.NhanVienRepository;

@RestController()
@RequestMapping("/")
public class NhanVienController {
	@Autowired
	private NhanVienRepository nhanVienRepository ;
	
	//Cau3	
	@GetMapping("/3")
	public List<NhanVien> findNhanVienLuongNhoHon10k(){
		List<NhanVien> dsNhanVien = nhanVienRepository.findNVCoLuongNhoHon10k();
		return dsNhanVien;	
	}
	
	//Cau8
	@GetMapping("/8")
	public String sumLuong() {
        return "Tổng số lương phải trả cho các nhân viên: " +nhanVienRepository.sumLuong();
    }
    
}
