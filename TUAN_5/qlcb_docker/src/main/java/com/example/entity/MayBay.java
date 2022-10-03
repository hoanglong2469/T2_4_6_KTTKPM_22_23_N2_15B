package com.example.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "maybay")
@Getter
@Setter
public class MayBay implements Serializable {
    @Id
    @Column(name = "mamb")
    private int maMB;

    @Column(name = "loai", columnDefinition = "varchar(50)")
    private String loai;

    @Column(name = "tambay")
    private int tamBay;

    public MayBay(int maMB, String loai, int tamBay) {
        this.maMB = maMB;
        this.loai = loai;
        this.tamBay = tamBay;
    }

    public MayBay(String loai, int tamBay) {
        this.loai = loai;
        this.tamBay = tamBay;
    }

    public MayBay(int maMB) {
        this.maMB = maMB;
    }

    public MayBay() {
    }
}
