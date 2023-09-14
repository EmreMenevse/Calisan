package service;

import entity.Calisan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CalisanRepository;

import java.util.List;

@Service
public class CalisanService {

    @Autowired
    private CalisanRepository calisanRepository;


    public Calisan addCalisan(Calisan calisan){
        return calisanRepository.save(calisan);
    }

    public List<Calisan> findAllCalisan(){
        return calisanRepository.findAll();
    }

    public Calisan geteCalisanById(Long calisanId){
        return calisanRepository.findById(calisanId).get();
    }

    public void deleteCalisanById(Long calisanId){
        calisanRepository.deleteById((calisanId));
    }

}
