package com.xworkz.collection.service;

import java.util.Collection;
import java.util.Optional;
import static com.xworkz.collection.Util.SnakeValidation.*;
import com.xworkz.collection.constants.Type;
import com.xworkz.collection.dto.SnakeDTO;
import com.xworkz.collection.repository.SnakeRepository;

public class SnakeServiceImpl implements SnakeService {

	private SnakeRepository snakeRepository;

	public SnakeServiceImpl(SnakeRepository snakeRepository) {
		this.snakeRepository = snakeRepository;
	}

	@Override
	public boolean validateAndThenSave(SnakeDTO dto) throws IllegalArgumentException {
		if (dto != null) {
			System.out.println("dto is not null");

			double id = dto.getId();
			String name = dto.getName();
			Type type = dto.getType();
			String place = dto.getPlace();

			boolean validId = false;
			boolean validName = false;
			boolean validType = false;
			boolean validPlace = false;

			if (validId(id)) {
				System.out.println("id is valid");
			 validId = true;
			} else {
				System.err.println("id is invalid");
			}
			if (validString(name)) {
				System.out.println("name is valid");
				validName = true;
			} else {
				System.err.println("name is invalid");
			}
			if (type != null) {
				System.out.println("type is valid");
				 validType = true;
			} else {
				System.err.println("type is invalid");
			}
			if (validString(place)) {
				System.out.println("place is valid");
			 validPlace = true;
			} else {
				System.err.println("place is invalid");
			}

			if (validFlag(validId && validName && validType && validPlace)) {
				System.out.println("dto is valid and it can be saved");
				return this.snakeRepository.save(dto);
			} else {
				throw new IllegalArgumentException("invalid data");
			}

		} else {
			System.err.println("dto is null");
		}
		return false;
	}

	@Override
	public Optional<SnakeDTO> findById(double id) {

		return this.snakeRepository.findById(id);
	}

	@Override
	public Optional<SnakeDTO> findByName(String name) {

		return this.snakeRepository.findByName(name);
	}

	@Override
	public Optional<SnakeDTO> findByNameAndPlace(String name, String place) {
		return this.snakeRepository.findByNameAndPlace(name, place);
	}

	@Override
	public Optional<Collection<SnakeDTO>> findByType(Type type) {

		return this.snakeRepository.findByType(type);
	}

}
