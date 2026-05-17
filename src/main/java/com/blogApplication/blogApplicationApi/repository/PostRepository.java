package com.blogApplication.blogApplicationApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogApplication.blogApplicationApi.model.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

}
