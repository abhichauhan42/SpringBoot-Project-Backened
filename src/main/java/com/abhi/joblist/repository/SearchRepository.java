package com.abhi.joblist.repository;

import com.abhi.joblist.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}
