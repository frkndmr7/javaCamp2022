package com.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import com.Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import com.Kodlama.io.Devs.business.requests.DeleteLanguageRequest;
import com.Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import com.Kodlama.io.Devs.business.responses.GetAllLanguageResponse;
import com.Kodlama.io.Devs.entities.concretes.LanguageFramework;

public interface LanguageService {
	List<GetAllLanguageResponse> getAll();

	void add(CreateLanguageRequest createLanguageRequest);

	void delete(DeleteLanguageRequest deleteLanguageRequest) ;

	void update(UpdateLanguageRequest updateLanguageRequest) ;

	List<LanguageFramework> getFrameWorks();


	
}













//import java.util.List;
//
//import com.Kodlama.io.Devs.entities.concretes.Language;
//
//public interface LanguageService {
//	List<Language> getAll();
//
//	void add(Language language) throws Exception;
//
//	void delete(Language language);
//
//	void update(int id, Language language) throws Exception;
//	
//	Language fetcLanguageById( int id);




