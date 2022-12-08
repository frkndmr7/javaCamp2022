package com.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Kodlama.io.Devs.entities.concretes.Language;
import com.Kodlama.io.Devs.entities.concretes.LanguageFramework;

//İnterface interfacei extend eder
public interface LanguageRepository extends JpaRepository<Language, Integer> {

	

	List<LanguageFramework> getName();
	
	// Repository veritabanı işleri yapacak sınıflara verilen isimler.
	//List<Language> getAll();// Dilleri listeler. 
	//!!Artık gerek kalmadı zaten jpadan alabiliriz metodları

	
	
	
	
	
	
	
	
	//	void add(Language language);
//	void delete(Language language);
//	void update(int id ,Language language);
//	Language fetchLanguageById(int id);
//	List<Language> getAll(); 
	

}
