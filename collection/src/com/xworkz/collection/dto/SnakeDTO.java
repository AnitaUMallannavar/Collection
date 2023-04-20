package com.xworkz.collection.dto;

import java.io.Serializable;

import com.xworkz.collection.constants.Type;

public class SnakeDTO implements Serializable,Comparable<SnakeDTO>{

	private double id;
	private String name;
	private Type type;
	private String place;
	
	public SnakeDTO() {
		// TODO Auto-generated constructor stub
	}

	public SnakeDTO(double id, String name, Type type, String place) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.place = place;
	}

	@Override
	public String toString() {
		return "SnakeDTO [id=" + id + ", name=" + name + ", type=" + type + ", place=" + place + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(id);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((place == null) ? 0 : place.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SnakeDTO other = (SnakeDTO) obj;
		if (Double.doubleToLongBits(id) != Double.doubleToLongBits(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (place == null) {
			if (other.place != null)
				return false;
		} else if (!place.equals(other.place))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public int compareTo(SnakeDTO o) {
		if(this.place!=null) {
			return this.getPlace().compareTo(o.getPlace());
		}
		return 0;
	}
	
}
