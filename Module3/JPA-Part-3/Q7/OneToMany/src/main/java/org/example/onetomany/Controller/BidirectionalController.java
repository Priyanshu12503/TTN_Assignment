package org.example.onetomany.Controller;

import org.example.onetomany.BiDirectinalEnity.BiAuthor;
import org.example.onetomany.Service.BidirectinalService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/biDir")
public class BidirectionalController {

    private final BidirectinalService bidirectinalService;

    public BidirectionalController(BidirectinalService bidirectinalService) {
        this.bidirectinalService = bidirectinalService;
    }
    @PostMapping
    public ResponseEntity<BiAuthor> create(@RequestBody BiAuthor biAuthor) {
        return ResponseEntity.ok(bidirectinalService.saveAuthor(biAuthor));
    }

    @GetMapping
    public List<BiAuthor> list() {
        return bidirectinalService.getAll();
    }


}
