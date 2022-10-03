package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.MayBay;

@Repository
public interface MayBayRepository extends JpaRepository<MayBay,Integer> {
	@Query(value = "select * from maybay where TamBay > 10000", nativeQuery = true)
	public List<MayBay> findMayBayCoTamBayLonHon10k();
	
	@Query(value = "SELECT count(*) FROM maybay  WHERE Loai > ?1", nativeQuery = true)
	int countLoaiMB(String loai);
}
