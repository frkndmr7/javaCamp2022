package com.kodlama.io.rentACar.business.abstracts;

import java.util.List;

import com.kodlama.io.rentACar.business.requests.CreateBrandRequest;
import com.kodlama.io.rentACar.business.responses.GetAllBrandsResponse;

public interface BrandService {
	List<GetAllBrandsResponse> getAll();
	void add(CreateBrandRequest createBrandRequest );

}
