package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.api.response.WeatherResponse;
import net.engineeringdigest.journalApp.cache.AppCache;
import net.engineeringdigest.journalApp.constants.Placeholders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Value("${weather.api.key:adcf08d87cbef9ff0bc6953e74e2b98a}") // 👈 hardcoded default
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private AppCache appCache;

    public WeatherResponse getWeather(String city) {
        try {
            String finalAPI = appCache.appCache.get(AppCache.keys.WEATHER_API.toString())
                    .replace(Placeholders.CITY, city)
                    .replace(Placeholders.API_KEY, apiKey);

            ResponseEntity<WeatherResponse> response = restTemplate.exchange(
                    finalAPI,
                    HttpMethod.GET,  // 👈 GET not POST
                    null,
                    WeatherResponse.class
            );
            return response.getBody();
        } catch (Exception e) {
            return null;
        }
    }
}