package com.Kodlama.io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Kodlama.io.Devs.entities.concretes.LanguageFramework;

public interface FrameWorkRepository extends JpaRepository<LanguageFramework, Integer>{

}
