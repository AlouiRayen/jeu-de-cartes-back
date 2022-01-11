package com.example.jeudecartes.Resources;

import com.example.jeudecartes.Models.Card;
import com.example.jeudecartes.Services.CardService;
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
}
