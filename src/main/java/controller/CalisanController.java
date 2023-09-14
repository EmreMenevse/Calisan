package controller;

import entity.Calisan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import service.CalisanService;
import java.util.List;


@RestController
@RequestMapping(value = "/api")
public class CalisanController {

    @Autowired
    private CalisanService calisanService;

    @PostMapping("/save")
        public ResponseEntity<Calisan> addCalisan(@RequestBody Calisan calisan){
	        Calisan addcalisan = calisanService.addCalisan(calisan);
	        return new	 ResponseEntity<Calisan>(addcalisan,HttpStatus.OK);
    }


    @GetMapping("/all")
    public ResponseEntity<List<Calisan>> getAllCalisan() {
        List<Calisan> allCalisan = calisanService.findAllCalisan();
        return new ResponseEntity<List<Calisan>>(allCalisan, HttpStatus.OK);
    }



    @GetMapping("/{id}")
    public ResponseEntity<Calisan> getCalisanId(@PathVariable("id") Long id){
        Calisan calisanById = calisanService.geteCalisanById(id);
        return new ResponseEntity<Calisan>(calisanById, HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteCalisanById(@PathVariable ("id") Long id){
        calisanService.deleteCalisanById(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
