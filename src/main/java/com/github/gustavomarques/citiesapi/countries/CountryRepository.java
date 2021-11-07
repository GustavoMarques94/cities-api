package com.github.gustavomarques.citiesapi.countries;

import com.github.gustavomarques.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
