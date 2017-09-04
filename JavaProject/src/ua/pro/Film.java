package ua.pro;

import java.io.Serializable;

public class Film implements Serializable {

	private String filmName;
	private String studion;
	private String genre;
	private String country;
	private int year;
	Actor cast;

	public Film() {

	}

	public Film(String filmName, String studion, Actor cast, String country, int year, String genre) {
		this.filmName = filmName;
		this.studion = studion;
		this.cast = cast;
		this.genre = genre;
		this.country = country;
		this.year = year;
	}

	public String getFilmName() {
		return filmName;
	}

	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}

	public String getStudion() {
		return studion;
	}

	public void setStudion(String studion) {
		this.studion = studion;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Actor getCast() {
		return cast;
	}

	public void setCast(Actor cast) {
		this.cast = cast;
	}

	@Override
	public String toString() {
		return "\tFilm [filmName=" + filmName + ", studion=" + studion + ", cast=" + cast + ", genre=" + genre
				+ ", country=" + country + ", year=" + year + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((filmName == null) ? 0 : filmName.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + year;
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
		Film other = (Film) obj;
		if (filmName == null) {
			if (other.filmName != null)
				return false;
		} else if (!filmName.equals(other.filmName))
			return false;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

}
