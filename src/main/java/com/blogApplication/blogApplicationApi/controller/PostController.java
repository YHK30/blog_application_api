package com.blogApplication.blogApplicationApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogApplication.blogApplicationApi.model.Post;
import com.blogApplication.blogApplicationApi.service.PostService;

@RestController
@RequestMapping("/blogapp/posts")
public class PostController {
	
	@Autowired
	private PostService postService;
	
	@GetMapping
	public List<Post> getAllPosts(){
		
		return postService.getAllPost();
	}
	
	@GetMapping("/{postId}")
	public Post getPostById(@PathVariable Long postId) {
		
		return postService.getPostById(postId);
	}
	
	@PostMapping
	public Post addPost(@RequestBody Post post) {
		
		return postService.addPost(post);
	}
	
	@DeleteMapping("/{postId}")
	public void deletePostById(@PathVariable Long postId) {
		
		postService.deletePostById(postId);
	}
	
	@PutMapping("/{postId}")
	public Post updatePostById(@RequestBody Post post, @PathVariable Long postId) {
		
		return postService.updatePostById(post, postId);
	}
}
