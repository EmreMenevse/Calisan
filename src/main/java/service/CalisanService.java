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


    public List<Calisan> findAllCalisan(){

        return calisanRepository.findAll();
    }

}
