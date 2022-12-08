package com.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import com.Kodlama.io.Devs.business.requests.CreateFrameWorkRequest;
import com.Kodlama.io.Devs.business.requests.DeleteFrameWorkRequest;
import com.Kodlama.io.Devs.business.requests.UpdateFrameWorkRequest;
import com.Kodlama.io.Devs.business.responses.GetAllFrameWorkResponse;

public interface FrameWorkService {

	List<GetAllFrameWorkResponse> getAll();

	public void add(CreateFrameWorkRequest createFrameWorkRequest);

	public void delete(DeleteFrameWorkRequest deleteFrameWorkRequest);

	public void update(UpdateFrameWorkRequest updateFrameWorkRequest);

	

}


