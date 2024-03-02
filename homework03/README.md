# Weather API

## Overview
This project aims to create a weather API that communicates with external free weather APIs to provide daily, weekly, and monthly weather reports based on user input of country and city.

### External API

- [OpenWeatherMap](https://openweathermap.org/api)

## Usage
To use this API, make a request with the desired country and city information. The API will then communicate with the external weather APIs, retrieve the weather data, and return it in the response.

### Endpoints
- `/weather`: Retrieves the current weather data for the specified city and country.

### Request Parameters
- `city`: The name of the city for which weather data is requested.
- `country`: The name of the country where the city is located.

### Response
The API responds with the following weather data:
- `city`: The name of the city.
- `temperature`: The current temperature in Celsius.
- `country`: The name of the country.
- `pressure`: The atmospheric pressure in hPa.
- `humidity`: The relative humidity as a percentage.
- `weatherType`: The description of the weather condition (e.g., cloudy, rainy, sunny).

## Setup
1. Clone this repository.
2. Obtain API keys from one of the external weather APIs mentioned above.
3. Replace `YOUR_API_KEY_HERE` in the code with your API key.
4. Build and run the project using Maven and Spring Boot.

## Technologies Used
- Java
- Spring Boot
- Feign Client
- Maven

## Credits
This project was created by Mehmet Genc.
