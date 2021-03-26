package com.example.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.entity.Bug;

public interface BugRepository extends MongoRepository<Bug , String> {

}
