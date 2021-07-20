package com.RMgX.kundansingh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.RMgX.kundansingh.service.AssetsEntityService;



@RestController
public class AssetsController {

    private static final String AssetsEntityService = null;
	@Autowired
    private AssetsEntityService assetsEntityService;

    @GetMapping("/Assets")
    public ResponseEntity < List < AssetsEntityService >> getAllAssets() {
        return ResponseEntity.ok().body(assetsEntityService.getAllAssets());
    }

    @GetMapping("/Assets/{id}")
    public ResponseEntity < AssetsEntityService > getAssetsById(@PathVariable long id) {
        return ResponseEntity.ok().body(AssetsEntityService.getAssetsById(id));
    }

    @PostMapping("/Assets")
    public ResponseEntity < AssetsEntityService > createAssets(@RequestBody AssetsEntityService assetsEntityService) {
        return ResponseEntity.ok().body(this.AssetsEntityService.createAssets(assetsEntityService));
    }

    @PutMapping("/Assets/{id}")
    public ResponseEntity < AssetsEntityService > updateAssets(@PathVariable long id, @RequestBody AssetsEntityService assetsEntityService) {
    	assetsEntityService.setId(id);
        return ResponseEntity.ok().body(this.assetsEntityService.updateassetsEntityService(assetsEntityService));
    }

    @DeleteMapping("/Assets/{id}")
    public HttpStatus deleteAssets(@PathVariable long id) {
        this.assetsEntityService.deleteassetsEntityService(id);
        return HttpStatus.OK;
    }
}