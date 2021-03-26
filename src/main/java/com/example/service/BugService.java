package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Bug;
import com.example.repo.BugRepository;

@Service

public class BugService { 
	@Autowired
	BugRepository bugRepository;

	public String createBug(Bug bug) {
		Bug savedbug = bugRepository.save(bug);
		return savedbug.getId();
	}

	public List<Bug> getbugs() {
		return bugRepository.findAll();
	}

	public void updateBug(Bug bug) {
		bugRepository.save(bug);

	}

	public void deletebug(String bugId) {
		bugRepository.deleteById(bugId);
	}

	public Optional<Bug> getbug(String bugId) {
		return bugRepository.findById(bugId);
	}
}
