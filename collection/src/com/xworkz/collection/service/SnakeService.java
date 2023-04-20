package com.xworkz.collection.service;

import java.util.Collection;
import java.util.Optional;

import com.xworkz.collection.constants.Type;
import com.xworkz.collection.dto.SnakeDTO;

public interface SnakeService {
	boolean validateAndThenSave(SnakeDTO dto);

	Optional<SnakeDTO> findById(double id);

	default Optional<SnakeDTO> findByName(String name) {
		return Optional.empty();
	}

	default Optional<SnakeDTO> findByNameAndPlace(String name, String place) {
		return Optional.empty();
	}

	default Optional<Collection<SnakeDTO>> findByType(Type type) {
		return Optional.empty();

	}

}
