package com.vfdiaz.springboot.springbootjparest.rest;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.vfdiaz.springboot.springbootjparest.model.Province;

@RepositoryRestResource
public interface ProvinceService extends PagingAndSortingRepository<Province, Long> {

	List<Province> findByCapital(@Param("capital") String capital);

	@Query("select t.province from Town t where t.zipCode=?1")
	public Province findByZipCode(@Param("zipCode") String zipCode);

}
