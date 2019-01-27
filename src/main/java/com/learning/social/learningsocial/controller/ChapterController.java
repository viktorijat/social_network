package com.learning.social.learningsocial.controller;

import com.learning.social.learningsocial.model.Chapter;
import com.learning.social.learningsocial.repository.ChapterRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/chapters")
public class ChapterController {

    private final ChapterRepository repository;

    public ChapterController(ChapterRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Flux<Chapter> listing() {
        return repository.findAll();
    }

}
