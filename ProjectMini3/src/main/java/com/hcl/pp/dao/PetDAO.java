package com.hcl.pp.dao;

import java.util.List;

import com.hcl.pp.model.Pet;

public interface PetDAO {
	public List fetchAll();

	public boolean savePet(Pet pet);
}
