package com.pliniosalazar.blog.repository;

import com.pliniosalazar.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Post, Long> {
}
