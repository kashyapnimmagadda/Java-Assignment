package com.hcl.pp.service;

import java.util.List;

import com.hcl.pp.model.Pet;

public interface PetService {
	public List getAllPets();

	public boolean savePet(Pet pet);
}
