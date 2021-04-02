Feature: Quotation form

  Background: 
    Given Start driver and browser
    And Nagivate to application

  Scenario: Send information for Automobile insurance quote
    Given Access "Automobile" menu
    When I fill in all fields on the VehicleData tab for Automobile
      | Make               | Audi       |
      | Performance        |        240 |
      | DateManufacture    | 10/10/2020 |
      | NumberofSeats      |          1 |
      | FuelType           | Gas        |
      | ListPrice          |        500 |
      | LicensePlateNumber | 123OEP     |
      | AnnualMileage      |        100 |
    And I check if any fields are missing to be filled for VehicleData
    And I click Next button to "Enter Insurant Data"
    And I fill in all fields on the Insurant Data tab for "Automobile"
      | First Name     | Thiago      |
      | Last Name      | Oliveira    |
      | Date of Birth  | 10/06/1994  |
      | Street Address | Rua Itatiba |
      | Country        | Brazil      |
      | Zip Code       |    13050545 |
      | City           | Campinas    |
      | Occupation     | Farmer      |
    And I check if any fields are missing to be filled for Insurant Data
    And I click Next button to "Enter Product Data"
    And I fill in all fields on the Product Data tab for Automobile
      | Start Date       | 09/01/2100   |
      | Insurance Sum    | 3.000.000,00 |
      | Merit Rating     | Bonus 1      |
      | Damage Insurance | No Coverage  |
      | Courtesy Car     | No           |
    And I check if any fields are missing to be filled for Product Data
    And I click Next button to "Select Price Option"
    And I choose and check a quote
      | Silver   |   173.00 |
      | Gold     |   510.00 |
      | Platinum | 1,001.00 |
      | Ultimate | 1,907.00 |
    And I fill in all fields on the Send Quote tab
      | Email            | jennifer.lucio@gmail.com |
      | Phone            |                423335544 |
      | Username         | Lopes                    |
      | Password         | Thiago10                 |
      | Confirm Password | Thiago10                 |
    And I check if any fields are missing to be filled for Send Quote
    Then I click Send button
    And I check the success message

  Scenario: Send information for Truck insurance quote
    Given Access "Truck" menu
    When I fill in all fields on the VehicleData tab
      | Make               | Audi       |
      | Performance        |        240 |
      | DateManufacture    | 10/10/2020 |
      | NumberofSeats      |          2 |
      | FuelType           | Petrol     |
      | Payload            |        540 |
      | Weight             |      50000 |
      | ListPrice          |        500 |
      | LicensePlateNumber | 321OEP     |
      | AnnualMileage      |        200 |
    And I check if any fields are missing to be filled for VehicleData
    And I click Next button to "Enter Insurant Data"
    And I fill in all fields on the Insurant Data tab for "Truck"
      | First Name     | Thiago      |
      | Last Name      | Oliveira    |
      | Date of Birth  | 10/06/1994  |
      | Street Address | Rua Itatiba |
      | Country        | Brazil      |
      | Zip Code       |    13050545 |
      | City           | São Paulo   |
      | Occupation     | Farmer      |
    And I check if any fields are missing to be filled for Insurant Data
    And I click Next button to "Enter Product Data"
    And I fill in all fields on the Product Data tab
      | Start Date       | 10/02/2050   |
      | Insurance Sum    | 5.000.000,00 |
      | Damage Insurance | No Coverage  |
    And I check if any fields are missing to be filled for Product Data
    And I click Next button to "Select Price Option"
    And I choose and check a quote
      | Silver   |   256.00 |
      | Gold     |   754.00 |
      | Platinum | 1,480.00 |
      | Ultimate | 2,819.00 |
    And I fill in all fields on the Send Quote tab
      | Email            | jennifer.lucio@gmail.com |
      | Phone            |                423335544 |
      | Username         | Lopes                    |
      | Password         | Thiago10                 |
      | Confirm Password | Thiago10                 |
    And I check if any fields are missing to be filled for Send Quote
    Then I click Send button
    And I check the success message

  Scenario: Send information for Motorcycle insurance quote
    Given Access "Motorcycle" menu
    When I fill in all fields on the VehicleData tab for Motorcycle
      | Make            | Audi       |
      | Model           | Scooter    |
      | Performance     |        240 |
      | Cylinder        |        160 |
      | DateManufacture | 10/10/2020 |
      | NumberofSeats   |          2 |
      | ListPrice       |        500 |
      | AnnualMileage   |        200 |
    And I check if any fields are missing to be filled for VehicleData
    And I click Next button to "Enter Insurant Data"
    And I fill in all fields on the Insurant Data tab for "Motorcycle"
      | First Name     | Thiago      |
      | Last Name      | Oliveira    |
      | Date of Birth  | 10/06/1994  |
      | Street Address | Rua Itatiba |
      | Country        | Brazil      |
      | Zip Code       |    13050545 |
      | City           | São Paulo   |
      | Occupation     | Farmer      |
    And I check if any fields are missing to be filled for Insurant Data
    And I click Next button to "Enter Product Data"
    And I fill in all fields on the Product Data tab
      | Start Date       | 10/02/2050   |
      | Insurance Sum    | 5.000.000,00 |
      | Damage Insurance | No Coverage  |
    And I check if any fields are missing to be filled for Product Data
    And I click Next button to "Select Price Option"
    And I choose and check a quote
      | Silver   |   174.00 |
      | Gold     |   513.00 |
      | Platinum | 1,008.00 |
      | Ultimate | 1,921.00 |
    And I fill in all fields on the Send Quote tab
      | Email            | jennifer.lucio@gmail.com |
      | Phone            |                423335544 |
      | Username         | Lopes                    |
      | Password         | Thiago10                 |
      | Confirm Password | Thiago10                 |
    And I check if any fields are missing to be filled for Send Quote
    Then I click Send button
    And I check the success message

  Scenario: Send information for Camper insurance quote
    Given Access "Camper" menu
    When I fill in all fields on the VehicleData tab
      | Make               | Audi       |
      | Performance        |        240 |
      | DateManufacture    | 10/10/2020 |
      | NumberofSeats      |          2 |
      | FuelType           | Petrol     |
      | Payload            |        540 |
      | Weight             |      50000 |
      | ListPrice          |        500 |
      | LicensePlateNumber | 321OEP     |
      | AnnualMileage      |        200 |
    And I check if any fields are missing to be filled for VehicleData
    And I click Next button to "Enter Insurant Data"
    And I fill in all fields on the Insurant Data tab for "Camper"
      | First Name     | Thiago      |
      | Last Name      | Oliveira    |
      | Date of Birth  | 10/06/1994  |
      | Street Address | Rua Itatiba |
      | Country        | Brazil      |
      | Zip Code       |    13050545 |
      | City           | São Paulo   |
      | Occupation     | Farmer      |
    And I check if any fields are missing to be filled for Insurant Data
    And I click Next button to "Enter Product Data"
    And I fill in all fields on the Product Data tab
      | Start Date       | 10/02/2050   |
      | Insurance Sum    | 5.000.000,00 |
      | Damage Insurance | No Coverage  |
    And I check if any fields are missing to be filled for Product Data
    And I click Next button to "Select Price Option"
    And I choose and check a quote
      | Silver   |   228.00 |
      | Gold     |   674.00 |
      | Platinum | 1,323.00 |
      | Ultimate | 2,520.00 |
    And I fill in all fields on the Send Quote tab
      | Email            | jennifer.lucio@gmail.com |
      | Phone            |                423335544 |
      | Username         | Lopes                    |
      | Password         | Thiago10                 |
      | Confirm Password | Thiago10                 |
    And I check if any fields are missing to be filled for Send Quote
    Then I click Send button
    And I check the success message
