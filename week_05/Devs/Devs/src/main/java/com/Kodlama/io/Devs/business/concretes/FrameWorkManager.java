package com.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Kodlama.io.Devs.business.abstracts.FrameWorkService;
import com.Kodlama.io.Devs.business.requests.CreateFrameWorkRequest;
import com.Kodlama.io.Devs.business.requests.DeleteFrameWorkRequest;
import com.Kodlama.io.Devs.business.requests.UpdateFrameWorkRequest;
import com.Kodlama.io.Devs.business.responses.GetAllFrameWorkResponse;
import com.Kodlama.io.Devs.dataAccess.abstracts.FrameWorkRepository;
import com.Kodlama.io.Devs.entities.concretes.LanguageFramework;

@Service
public class FrameWorkManager implements FrameWorkService {
	FrameWorkRepository frameWorkRepository;
	
	@Autowired
	public FrameWorkManager(FrameWorkRepository frameWorkRepository) {
		this.frameWorkRepository = frameWorkRepository;
		
	}
	
	@Override
	public List<GetAllFrameWorkResponse> getAll() {
		List<LanguageFramework> frameWork = frameWorkRepository.findAll();
		List<GetAllFrameWorkResponse> frameWorkResponse = new ArrayList<GetAllFrameWorkResponse>();
		for (LanguageFramework frame : frameWork) {
			GetAllFrameWorkResponse responseItem = new GetAllFrameWorkResponse();
			responseItem.setId(frame.getId());
			responseItem.setName(frame.getFrameworkName());
			frameWorkResponse.add(responseItem);
		}

		return frameWorkResponse;
	}
	
	@Override
	public void add(CreateFrameWorkRequest createFrameWorkRequest) {
		LanguageFramework frameWork = new LanguageFramework();
		frameWork.setFrameworkName(createFrameWorkRequest.getName());
		frameWorkRepository.save(frameWork);

	}
	
	@Override
	public void delete(DeleteFrameWorkRequest deleteFrameWorkRequest) {
		LanguageFramework frameWork = new LanguageFramework();

		frameWork.setId(deleteFrameWorkRequest.getId());
		frameWorkRepository.delete(frameWork);

	}
	
	@Override
	public void update(UpdateFrameWorkRequest updateFrameWorkRequest) {
		LanguageFramework frameWork = new LanguageFramework();
		frameWork.setFrameworkName(updateFrameWorkRequest.getName());
		frameWork.setId(updateFrameWorkRequest.getId());
		frameWorkRepository.save(frameWork);

	}
	
	
	

}
