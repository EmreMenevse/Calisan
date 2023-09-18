package entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

    @Data
    @Entity
    @Table(name="system.tb_mkuCalisanList1")
    public class Calisan {

        @Id
        @Column(name="IdNo")
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long IdNo ;
        private String Ad;
        private String Soyad;
        private String Unvan;
        private int SICIL_NO;



        public Long getIdNo() {
            return IdNo;
        }
        public void setIdNo(Long idNo) {
            IdNo = idNo;
        }
        public String getAd() {
            return Ad;
        }
        public void setAd(String ad) {
            Ad = ad;
        }
        public String getSoyad() {
            return Soyad;
        }
        public void setSoyad(String soyad) {
            Soyad = soyad;
        }
        public String getUnvan() {
            return Unvan;
        }
        public void setUnvan(String unvan) {
            Unvan = unvan;
        }
        public int getSICIL_NO() {
            return SICIL_NO;
        }
        public void setSICIL_NO(int sICIL_NO) {
            SICIL_NO = sICIL_NO;
        }

}
