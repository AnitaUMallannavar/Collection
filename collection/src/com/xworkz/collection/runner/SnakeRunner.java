package com.xworkz.collection.runner;

import java.util.Optional;

import com.xworkz.collection.constants.Type;
import com.xworkz.collection.dto.SnakeDTO;
import com.xworkz.collection.repository.SnakeRepository;
import com.xworkz.collection.repository.SnakeRepositoryImpl;
import com.xworkz.collection.service.SnakeService;
import com.xworkz.collection.service.SnakeServiceImpl;

public class SnakeRunner {

	public static void main(String[] args) {
		SnakeDTO snakeDTO = new SnakeDTO(1, "Shubhangi", Type.ANAKONDA, "Mudhol");
		SnakeDTO snakeDTO1 = new SnakeDTO(2, "Akshata", Type.PYTHON, "Dharvad");
		SnakeDTO snakeDTO2 = new SnakeDTO(2, "BasuAnna", Type.ANAKONDA, "Dharvad");

		SnakeRepository snakeRepository = new SnakeRepositoryImpl();
		SnakeService snakeService = new SnakeServiceImpl(snakeRepository);

		try {
			boolean saved = snakeService.validateAndThenSave(snakeDTO);
			System.out.println(saved);

			boolean saved1 = snakeService.validateAndThenSave(snakeDTO1);
			System.out.println(saved1);

			boolean saved2 = snakeService.validateAndThenSave(snakeDTO2);
			System.out.println(saved2);

		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		Optional<SnakeDTO> optionalById = snakeService.findById(1);
		if (optionalById.isPresent()) {
			System.out.println("snake cantaince id");
			SnakeDTO ids = optionalById.get();
			System.out.println(ids);
		} else {
			System.out.println("Snake does not exist");
		}

		Optional<SnakeDTO> optionalByname = snakeService.findByName("Akshata");
		if (optionalByname.isPresent()) {
			System.out.println("snake cataince name");
			SnakeDTO name = optionalByname.get();
			System.out.println(name);
		} else {
			System.out.println("snake does not exist");
		}

		Optional<SnakeDTO> optionalByNameAndPlace = snakeService.findByNameAndPlace("Shubhangi", "Mudhol");
		if (optionalByNameAndPlace.isPresent()) {
			System.out.println("snake cantaince name & place");
			SnakeDTO nAndP = optionalByNameAndPlace.get();
			System.out.println(nAndP);
		} else {
			System.out.println("snake does not exist");
		}
	}

}
