package com.example.demo.domain;

public class City {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column city.id
	 *
	 * @mbggenerated
	 */
	private Long id;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column city.province_id
	 *
	 * @mbggenerated
	 */
	private Long provinceId;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column city.city_name
	 *
	 * @mbggenerated
	 */
	private String cityName;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column city.description
	 *
	 * @mbggenerated
	 */
	private String description;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column city.id
	 *
	 * @return the value of city.id
	 *
	 * @mbggenerated
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column city.id
	 *
	 * @param id the value for city.id
	 *
	 * @mbggenerated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column city.province_id
	 *
	 * @return the value of city.province_id
	 *
	 * @mbggenerated
	 */
	public Long getProvinceId() {
		return provinceId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column city.province_id
	 *
	 * @param provinceId the value for city.province_id
	 *
	 * @mbggenerated
	 */
	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column city.city_name
	 *
	 * @return the value of city.city_name
	 *
	 * @mbggenerated
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column city.city_name
	 *
	 * @param cityName the value for city.city_name
	 *
	 * @mbggenerated
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName == null ? null : cityName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column city.description
	 *
	 * @return the value of city.description
	 *
	 * @mbggenerated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column city.description
	 *
	 * @param description the value for city.description
	 *
	 * @mbggenerated
	 */
	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}
}