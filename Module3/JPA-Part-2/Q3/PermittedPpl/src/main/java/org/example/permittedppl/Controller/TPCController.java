package org.example.permittedppl.Controller;

import org.example.permittedppl.Service.TPCService;
import org.example.permittedppl.TablePerClassEnity.TPCAudience;
import org.example.permittedppl.TablePerClassEnity.TPCPerformer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Q3 (3) - Implement and demonstrate Table Per Class strategy.

@RestController
@RequestMapping("/tpc")
public class TPCController {

    private final TPCService tpcService;

    public TPCController(TPCService tpcService) {
        this.tpcService = tpcService;
    }


    @PostMapping("/performer")
    public TPCPerformer addPerformer(@RequestBody TPCPerformer performer) {
        return tpcService.savePerformer(performer);
    }

    @PostMapping("/audience")
    public TPCAudience addAudience(@RequestBody TPCAudience audience) {
        return tpcService.saveAudience(audience);
    }

    @GetMapping("/performers")
    public List<TPCPerformer> getAllPerformers() {
        return tpcService.getAllPerformers();
    }

    @GetMapping("/audience")
    public List<TPCAudience> getAllAudience() {
        return tpcService.getAllAudience();
    }
}