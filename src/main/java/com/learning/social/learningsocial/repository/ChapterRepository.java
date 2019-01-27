package com.learning.social.learningsocial.repository;

import com.learning.social.learningsocial.model.Chapter;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ChapterRepository extends ReactiveCrudRepository<Chapter, String> {
}
