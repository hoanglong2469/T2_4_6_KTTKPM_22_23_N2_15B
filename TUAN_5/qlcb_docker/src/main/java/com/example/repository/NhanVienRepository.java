package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.MayBay;
import com.example.entity.NhanVien;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, String> {
	
	@Query(value = "select * from nhanvien where Luong < 10000", nativeQuery = true)
	public List<NhanVien> findNVCoLuongNhoHon10k();
	
	@Query(value = "SELECT sum(Luong) FROM nhanvien", nativeQuery = true)
	double sumLuong();
}
