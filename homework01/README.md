
# Residence Analysis Application

This application provides functionalities to analyze residences including houses, villas, and summer cottages.

## Features

- Calculate the total price of houses, villas, and summer cottages.
- Calculate the total price of all residences.
- Calculate the average square meter of houses, villas, and summer cottages.
- Calculate the average square meter of all residences.
- Filter residences by the number of rooms and living rooms.

Certainly! Here's an explanation of each class for your README file:

---

## Classes Overview

### 1. Residence

- **Description**: This class serves as the base class representing a generic residence. It encapsulates properties common to all types of residences such as ID, price, square meter, number of rooms, number of living rooms, and residence type.
- **Functionality**:
    - Provides getter methods to access the properties of a residence.
    - Overrides the `toString()` method to provide a custom string representation of a residence.

### 2. House

- **Description**: `House` is a subclass of `Residence` representing a house. It extends the `Residence` class and sets the residence type to `ResidenceType.House` in its constructor.
- **Functionality**: Inherits all properties and methods from the `Residence` class.

### 3. Villa

- **Description**: Similar to `House`, `Villa` is a subclass of `Residence` representing a villa. It sets the residence type to `ResidenceType.Villa` in its constructor.
- **Functionality**: Inherits all properties and methods from the `Residence` class.

### 4. SummerCottage

- **Description**: `SummerCottage` is a subclass of `Residence` representing a summer cottage. It sets the residence type to `ResidenceType.SummerCottage` in its constructor.
- **Functionality**: Inherits all properties and methods from the `Residence` class.

### 5. ResidenceService

- **Description**: This class provides various services related to residences, such as calculating total prices, average square meters, and filtering residences based on specific criteria.
- **Functionality**:
    - Takes a list of `Residence` objects as input and performs operations on them.
    - Provides methods to calculate total prices and average square meters for different types of residences.
    - Offers a method to filter residences based on criteria like the number of rooms and living rooms.

### 6. Homework01Application

- **Description**: This is the main class that contains the `main()` method to run the application.
- **Functionality**:
    - Creates sample `Residence` objects (houses, villas, and summer cottages).
    - Initializes a `ResidenceService` instance with these objects.
    - Demonstrates the functionality of the `ResidenceService` class by calling its methods to calculate total prices, average square meters, and filter residences.

---
## How to Use

1. Clone the repository to your local machine:

``` bash
  git clone https://github.com/mehmetgencv/n11-talentHub-backend-bootcamp/tree/main/homework01
```

2. Open the project in your preferred IDE.

3. Run the `Homework01Application` class located in the `com.mehmetgenc.homework01` package.

4. View the output in the console. You will see the results of various analyses such as total prices, average square meters, and filtered residences.

## Example Usage

Here is an example of how to use the application:

``` java
    // Create a list of example residences
    List<Residence> exampleResidenceList = new ArrayList<>();
    // Add residences to the list...
    exampleResidenceList.add(new House(1, 1200.0, 100.0, 1, 1));
 
    exampleResidenceList.add(new Villa(1, 1080.0, 1200.0, 5, 1));

    exampleResidenceList.add(new SummerCottage(1, 15500.0, 1700.0, 1, 1));

    // Initialize the ResidenceService with the example residence list
    ResidenceService residenceService = new ResidenceService(exampleResidenceList);
    
    // Perform analyses and filtering...
```

## Dependencies

This project uses Spring Boot for dependency injection.

## Contributors

- Mehmet Genc

## License

