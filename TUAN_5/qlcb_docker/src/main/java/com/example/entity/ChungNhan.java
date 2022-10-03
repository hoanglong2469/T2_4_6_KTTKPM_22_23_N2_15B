package com.example.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "chungnhan")
@Getter
@Setter
public class ChungNhan implements Serializable {
    @Id
    @JoinColumn(name = "maNV", columnDefinition = "varchar(9)")
    @ManyToOne(fetch = FetchType.EAGER)
    private NhanVien MaNV;

    @Id
    @JoinColumn(name = "maMB", columnDefinition = "int")
    @ManyToOne(fetch = FetchType.EAGER)
    private MayBay MaMB;

    public ChungNhan() {
    }

    public ChungNhan(NhanVien nhanVien, MayBay mayBay) {
        this.MaMB = mayBay;
        this.MaNV = nhanVien;
    }
}
