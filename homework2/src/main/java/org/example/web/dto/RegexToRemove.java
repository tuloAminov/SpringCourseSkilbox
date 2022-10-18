package org.example.web.dto;

import javax.validation.constraints.NotBlank;

public class RegexToRemove {

    @NotBlank
    private String regex;

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }
}
