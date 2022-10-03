package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.ChuyenBay;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {
	
	@Query(value = "select * from chuyenbay where GaDen = 'DAD'", nativeQuery = true)
	public List<ChuyenBay> findChuyenBaystoGaDiDAD();

	@Query(value = "select * from chuyenbay where DoDai>8000 and DoDai<10000 ", nativeQuery = true)
	public List<ChuyenBay> findDoDaiChuyenBay();
	
	@Query(value = "select * from chuyenbay where GaDi='SGN' and GaDen='BMV' ", nativeQuery = true)
	public List<ChuyenBay> findChuyenBaySG_BMV();
	
	@Query(value = "SELECT COUNT(*) FROM chuyenbay where GaDi = ?1", nativeQuery = true)
	int countChuyenBay(String gadi);
}
