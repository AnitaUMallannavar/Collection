package com.xworkz.collection.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import com.xworkz.collection.constants.Type;
import com.xworkz.collection.dto.SnakeDTO;

public class SnakeRepositoryImpl implements SnakeRepository {
	private Collection<SnakeDTO> snakeDTOs=new ArrayList<SnakeDTO>();
	
	
	
	public SnakeRepositoryImpl() {
		
	}
	
	public SnakeRepositoryImpl(Collection<SnakeDTO> snakeDTOs) {
		this.snakeDTOs=snakeDTOs;
	}

	@Override
	public boolean save(SnakeDTO dto) {
		System.out.println("Running Save :"+dto);
		
		return this.snakeDTOs.add(dto);
	}

	@Override
	public Optional<SnakeDTO> findById(double id) {
		for (SnakeDTO snakeDTO : snakeDTOs) {
			if(snakeDTO.getId()==id) {
				System.out.println("Snake  id is exist :"+snakeDTO);
				return Optional.of(snakeDTO);
			}
		}
		return Optional.empty();
	}
	
	@Override
	public Optional<SnakeDTO> findByName(String name) {
		for (SnakeDTO snakeDTO : snakeDTOs) {
			if(snakeDTO.getName().equals(name)) {
				System.out.println("Snake name is exist:"+snakeDTO);
				return Optional.of(snakeDTO);
			}else {
				System.out.println("sanke name is not exist");
			}
		}
		return SnakeRepository.super.findByName(name);
	}
	
	
	@Override
	public Optional<SnakeDTO> findByNameAndPlace(String name, String place) {
		for (SnakeDTO snakeDTO : snakeDTOs) {
			if(snakeDTO.getName().equals(name) && snakeDTO.getPlace().equals(place)) {
				System.out.println("Snake name & place exist"+snakeDTO);
				return Optional.of(snakeDTO);
			}else {
				System.out.println("snake name & place is not exist");
			}
		}
		return SnakeRepository.super.findByNameAndPlace(name, place);
	}
	
	@Override
	public Optional<Collection<SnakeDTO>> findByType(Type type) {
		
		return SnakeRepository.super.findByType(type);
	}
}
