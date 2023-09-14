package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

    @Data
    @Entity
    @Getter
    @Setter
    @ToString
    @Table(name="system.tb_mkuCalisanList")
    public class Calisan {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long IdNo ;
        private String Ad;
        private String Soyad;
        private String Unvan;
        private String SICIL_NO;
        private String BANKAYABASLAMATARIHI;
        private String CALISMADURUM;



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
        public String getSICIL_NO() {
            return SICIL_NO;
        }
        public void setSICIL_NO(String sICIL_NO) {
            SICIL_NO = sICIL_NO;
        }
        public String getBANKAYABASLAMATARIHI() {
            return BANKAYABASLAMATARIHI;
        }
        public void setBANKAYABASLAMATARIHI(String bANKAYABASLAMATARIHI) {
            BANKAYABASLAMATARIHI = bANKAYABASLAMATARIHI;
        }
        public String getCALISMADURUM() {
            return CALISMADURUM;
        }
        public void setCALISMADURUM(String cALISMADURUM) {
            CALISMADURUM = cALISMADURUM;
        }
}
