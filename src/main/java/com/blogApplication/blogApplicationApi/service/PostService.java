package com.blogApplication.blogApplicationApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogApplication.blogApplicationApi.model.Post;
import com.blogApplication.blogApplicationApi.repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepository;
	
	public List<Post> getAllPost(){
		
		return postRepository.findAll();
	}
	
	public Post getPostById(Long postId) {
		
		return postRepository.findById(postId).orElseThrow();
	}
	
	public Post addPost(Post post) {
		
		return postRepository.save(post);
	}
	
	public void deletePostById(Long postId) {
		
		postRepository.deleteById(postId);
		
	}
	
	public Post updatePostById(Post post, Long postId) {
		
		Post prePost= postRepository.findById(postId).orElseThrow();
		
		prePost.setTitle(post.getTitle());
		prePost.setContent(post.getContent());
		prePost.setAuthor(post.getAuthor());

		return postRepository.save(prePost);
		
	}
}
