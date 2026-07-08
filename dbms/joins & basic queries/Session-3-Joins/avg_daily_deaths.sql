SELECT date,
       AVG(deaths) AS avg_daily_deaths
FROM covid_cases
GROUP BY date
ORDER BY date;