CREATE TABLE countries (
    country_id INT PRIMARY KEY,
    country_name VARCHAR(100),
    continent VARCHAR(50),
    population BIGINT
);

CREATE TABLE covid_cases (
    case_id INT PRIMARY KEY,
    country_id INT,
    date DATE,
    confirmed_cases INT,
    deaths INT,
    FOREIGN KEY (country_id) REFERENCES countries(country_id)
);

CREATE TABLE covid_deaths (
    death_id INT PRIMARY KEY,
    country_id INT,
    date DATE,
    total_deaths INT,
    FOREIGN KEY (country_id) REFERENCES countries(country_id)
);

CREATE TABLE covid_vaccines (
    vaccine_id INT PRIMARY KEY,
    country_id INT,
    date DATE,
    vaccinated_people INT,
    FOREIGN KEY (country_id) REFERENCES countries(country_id)
);