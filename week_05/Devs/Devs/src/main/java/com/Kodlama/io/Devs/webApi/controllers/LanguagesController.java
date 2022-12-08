package com.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Kodlama.io.Devs.business.abstracts.LanguageService;
import com.Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import com.Kodlama.io.Devs.business.requests.DeleteLanguageRequest;
import com.Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import com.Kodlama.io.Devs.business.responses.GetAllLanguageResponse;
import com.Kodlama.io.Devs.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;
	
	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<GetAllLanguageResponse> getAll() {
		return languageService.getAll();
	}
	
	@PostMapping("/add")
	public void add(CreateLanguageRequest language) throws Exception {
		languageService.add(language);
	}
	
	@DeleteMapping("/delete")
	public void delete(DeleteLanguageRequest language) {
		languageService.delete(language);
	}
	
	@PutMapping("/update")
	public void update(UpdateLanguageRequest language) throws Exception{
		languageService.update(language);
	}
	
	@GetMapping("/fetcLanguageById")
	public Language fetcLanguageById(int id) {
		return ((LanguagesController) languageService).fetcLanguageById(id);
	}

}
