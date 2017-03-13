package com.chaokunyang;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author yangck
 */
@JsonIgnoreProperties(ignoreUnknown=true)  // signals that  any other attributes are to be ignored.
public class Quote {

    Long id;
    String quote;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

}