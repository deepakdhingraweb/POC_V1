package com.mypack.parser;

public  class inputReference {
    public  SystemInformation systemInformation;
    public  MatchtRquirements matchtRquirements;
    public  Personal personal;
    public  AddressDetails addressDetails;
   // public  IdentityDocuments identityDocuments;

    public inputReference(SystemInformation systemInformation, MatchtRquirements matchtRquirements, Personal personal, AddressDetails addressDetails){
        this.systemInformation = systemInformation;
        this.matchtRquirements = matchtRquirements;
        this.personal = personal;
        this.addressDetails = addressDetails;
   //     this.identityDocuments = identityDocuments;
    }

    public  class SystemInformation {
        public  String refernceId;

        public SystemInformation(String refernceId){
            this.refernceId = refernceId;
        }
    }

    public  class MatchtRquirements {
        public  long numberOfNameMatches;
        public  long numberOfDOBMatches;
        public  long numberOfAddressatches;

        public MatchtRquirements(long numberOfNameMatches, long numberOfDOBMatches, long numberOfAddressatches){
            this.numberOfNameMatches = numberOfNameMatches;
            this.numberOfDOBMatches = numberOfDOBMatches;
            this.numberOfAddressatches = numberOfAddressatches;
        }
    }

    public  class Personal {
        public  String title;
        public  String foreName;
        public  String middleName;
        public  String surname;
        public  String gender;
        public  long birthDate;

        public Personal(String title, String foreName, String middleName, String surname, String gender, long birthDate){
            this.title = title;
            this.foreName = foreName;
            this.middleName = middleName;
            this.surname = surname;
            this.gender = gender;
            this.birthDate = birthDate;
        }
    }

    public  class AddressDetails {
        public  CurrentAddress currentAddress;

        public AddressDetails(CurrentAddress currentAddress){
            this.currentAddress = currentAddress;
        }

        public  class CurrentAddress {
            public  String premise;
            public  String building;
            public  String subBuilding;
            public  String streetName;
            public  String streetType;
            public  String suburb;
            public  String city;
            public  String stateDistrict;
           
            public  String zipPostalCode;
            public  String country;
    
            public CurrentAddress(String premise, String building, String subBuilding, String streetName, String streetType, String suburb, String city, String stateDistrict,  String zipPostalCode, String country){
                this.premise = premise;
                this.building = building;
                this.subBuilding = subBuilding;
                this.streetName = streetName;
                this.streetType = streetType;
                this.suburb = suburb;
                this.city = city;
                this.stateDistrict = stateDistrict;
               
                this.zipPostalCode = zipPostalCode;
                this.country = country;
            }
        }
    }
    /*
    public  class IdentityDocuments {
        public  IdentityCard identityCard;

        public IdentityDocuments(IdentityCard identityCard){
            this.identityCard = identityCard;
        }

        public  class IdentityCard {
            public  String number;
            public  String country;
    
            public IdentityCard(String number, String country){
                this.number = number;
                this.country = country;
            }
        }
    }
    */
}