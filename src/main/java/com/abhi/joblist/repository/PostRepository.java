package com.abhi.joblist.repository;

import com.abhi.joblist.model.Post;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String>
{

}