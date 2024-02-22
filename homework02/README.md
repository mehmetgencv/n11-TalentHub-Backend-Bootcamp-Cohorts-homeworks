
# Customer Invoice Management System

## Description
This Java application manages customer data and their invoices. It provides functionality to create customers, add invoices to customers, and perform various operations such as listing customers, filtering customers by name, calculating total invoice amounts, and more.

## Features
- **List all customers**: Displays the details of all customers in the system.
- **Filter customers by name**: Lists customers whose names contain a specific character or string.
- **Total invoice amount for customers registered in a specific month**: Calculates the total invoice amount for customers registered in a given month.
- **List all invoices**: Displays details of all invoices in the system.
- **Filter invoices by amount**: Lists invoices with amounts above a certain threshold.
- **Calculate average invoice amount above a certain threshold**: Computes the average invoice amount for invoices above a specified amount.
- **List names of customers with invoices below a certain amount**: Displays the names of customers who have invoices below a specified amount.
- **List sectors of companies with average invoice amount below a certain amount in a specific month**: Lists the sectors of companies with an average invoice amount below a specified amount in a given month.

## Requirements
- Java JDK 8 or higher
- Maven

## Usage
1. Clone this repository to your local machine.
2. Open the project in your preferred Java IDE.
3. Run the `Main` class to execute the application.
4. Follow the prompts in the console to interact with the application and view the results of different operations.

## Example
Below is an example output of the application:

```
All Customers:
Mehmet
Hakan
Mert C

Customers Whose Names Contain 'C':
Mert C

Total Invoice Amount for Customers Registered in June:
10200.0

All Invoices:
Invoice{amount=1000.0, date=2023-01-15}
Invoice{amount=2000.0, date=2024-06-15}
Invoice{amount=3000.0, date=2024-06-20}
Invoice{amount=4000.0, date=2024-06-25}
Invoice{amount=100.0, date=2024-07-05}
Invoice{amount=100.0, date=2024-07-10}

Invoices Above 1500TL:
Invoice{amount=2000.0, date=2024-06-15}
Invoice{amount=3000.0, date=2024-06-20}
Invoice{amount=4000.0, date=2024-06-25}

Average of Invoices Above 1500TL:
3000.0

Names of Customers with Invoices Below 500TL:
Mert C

Sectors of Companies with Average Invoice Amount Below 750 in June:
Retail
```

## Contributors
- Mehmet Genc

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
