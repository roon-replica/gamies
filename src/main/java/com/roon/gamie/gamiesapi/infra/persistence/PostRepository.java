package com.roon.gamie.gamiesapi.infra.persistence;

import com.roon.gamie.gamiesapi.domain.post.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
