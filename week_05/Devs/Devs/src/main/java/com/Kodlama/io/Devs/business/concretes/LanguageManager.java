package com.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Kodlama.io.Devs.business.abstracts.LanguageService;
import com.Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import com.Kodlama.io.Devs.business.requests.DeleteLanguageRequest;
import com.Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import com.Kodlama.io.Devs.business.responses.GetAllLanguageResponse;
import com.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import com.Kodlama.io.Devs.entities.concretes.Language;
import com.Kodlama.io.Devs.entities.concretes.LanguageFramework;

@Service
public class LanguageManager implements LanguageService{
	private LanguageRepository languageRepository;
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	public void add(Language language) throws Exception {
		if(language.getName().isEmpty()) {
			throw new Exception("Programming language cannot be empty");
		}
		if(language.getName().equals(language.getName())) {
			throw new Exception("Programming name cannot be repeated");
		}
		
	}
	
	public void delete(Language language) {
		languageRepository.delete(language);
	}
	
	public void update(int id ,Language language) throws Exception {
		if(language.getName().equals(language.getName())) {
			throw new Exception("Programming name cannot be repeated");
		}
	}
	

	
	
	public List<LanguageFramework> getFrameWorks() {
		return languageRepository.getName();
	}

	@Override
	public List<GetAllLanguageResponse> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(CreateLanguageRequest createLanguageRequest) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(DeleteLanguageRequest deleteLanguageRequest) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(UpdateLanguageRequest updateLanguageRequest) {
		// TODO Auto-generated method stub
		
	}

	

}
