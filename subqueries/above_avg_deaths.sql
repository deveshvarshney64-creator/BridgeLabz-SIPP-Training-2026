SELECT country, SUM(total_deaths) AS total_deaths
FROM covid_deaths
GROUP BY country
HAVING SUM(total_deaths) > (
    SELECT AVG(total_deaths)
    FROM covid_deaths
);