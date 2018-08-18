package pl.coderslab.web;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CountryDto {

    @JsonProperty("country_id")
    long apiCountryId;
    @JsonProperty("country_name")
    String name;

    @Override
    public String toString() {
        return "Country id: " + apiCountryId +
                " country name: " + name;
    }

    public long getApiCountryId() {
        return apiCountryId;
    }

    public void setApiCountryId(long apiCountryId) {
        this.apiCountryId = apiCountryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}