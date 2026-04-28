package com.fullstack19.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fullstack19.backend.model.FeedBack;

public interface FeedBackRepository extends JpaRepository<FeedBack, Long> {
}
