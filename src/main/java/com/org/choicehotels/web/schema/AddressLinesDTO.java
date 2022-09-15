package com.org.choicehotels.web.schema;

public class AddressLinesDTO {

    private final String exterior;

    private final String street;

    private AddressLinesDTO(String exterior, String street) {
        this.exterior = exterior;
        this.street = street;
    }

    public String getExterior() {
        return exterior;
    }

    public String getStreet() {
        return street;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {

        private String exterior;

        private String street;

        public Builder setExterior(String exterior) {
            this.exterior = exterior;
            return this;
        }


        public Builder setStreet(String street) {
            this.street = street;
            return this;
        }

        public AddressLinesDTO build(){
            return new AddressLinesDTO(this.exterior, this.street);
        }
    }
}
