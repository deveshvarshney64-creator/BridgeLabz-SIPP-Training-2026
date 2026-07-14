SELECT country, vaccinated_people AS population, 'Vaccinated' AS type
FROM covid_vaccination

UNION

SELECT country, (total_population - vaccinated_people) AS population, 'Unvaccinated' AS type
FROM covid_vaccination;