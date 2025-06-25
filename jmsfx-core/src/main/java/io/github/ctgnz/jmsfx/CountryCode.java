package io.github.ctgnz.jmsfx;

public interface CountryCode extends AmplifierListItem {
    CountryCode UNDEFINED = new CountryCode() {

        @Override
        public String getLabel() {
            return "Undefined";
        }

        @Override
        public String getId() {
            return "UNDEFINED";
        }

        @Override
        public boolean isGraphicalIcon() {
            return false;
        }

        @Override
        public String getName() {
            return "Undefined";
        }

        @Override
        public String getGraphicLocation() {
            return null;
        }

        @Override
        public AmplifierList getAmplifierList() {
            return null;
        }

        @Override
        public String getCode() {
            return "000";
        }
    };

    String getCode();

}
