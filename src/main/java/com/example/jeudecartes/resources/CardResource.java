package com.example.jeudecartes.resources;

import com.example.jeudecartes.models.Card;
import com.example.jeudecartes.models.Order;
import com.example.jeudecartes.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController()
@RequestMapping("/cards")
public class CardResource {

    @Autowired
    private CardService cardService;

    @GetMapping("/deal")
    public ResponseEntity<List<Card>> dealCards(){
        return ResponseEntity.ok(cardService.CreateDeck());
    }
    @PostMapping("/sort")
    public ResponseEntity<List<Card>> sortCards(@RequestBody Order order){
        return ResponseEntity.ok(cardService.sortCards(order));
    }

}
