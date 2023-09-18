package controller;

import entity.Calisan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.CalisanService;

import java.util.List;


@RestController
@RequestMapping( "/api")
public class CalisanController {

    @Autowired
    CalisanService calisanService;

    @GetMapping ("/all")
    public ResponseEntity<List<Calisan>> getAllCalisan(){


        List<Calisan> allCalisan = calisanService.findAllCalisan();
        return new ResponseEntity<List<Calisan>>(allCalisan, HttpStatus.OK);
    }


}
