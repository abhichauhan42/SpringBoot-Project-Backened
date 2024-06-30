package com.abhi.joblist.controller;

import java.util.List;

import com.abhi.joblist.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.abhi.joblist.model.Post;
import com.abhi.joblist.repository.PostRepository;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class PostController 
{
	@Autowired
    PostRepository repo;

	@Autowired
	SearchRepository srepo;

	  @GetMapping("/allPosts")
	  @CrossOrigin
	    public List<Post> getAllPosts()
	    {
	        return repo.findAll();
	    }

		@PostMapping("/post")
		@CrossOrigin
		public Post addPost(@RequestBody Post post){

		  return repo.save(post);
		}

		@GetMapping("/posts/{text}")
		@CrossOrigin
		public List<Post> search(@PathVariable String text)
		{
			return srepo.findByText(text);
		}
}
