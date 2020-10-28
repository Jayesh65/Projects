Specter Bank

Classes:
1. Account.java
2. Customer.java
3. AccountController.java
4. CustomerController.java
5. AccountService.java
6. CustomerService.java
7. AccountRepository.java
8. CustomerRepository.java
9. CapstoneProjectSpecterBankApplication.java

Endpoints:
1. @PostMapping("/customer") = To Add a New Customer
2. @GetMapping("/customers") = To Get List of All the Customers
3. @GetMapping("/customer/{custID}") = To Get the Customer Details of a Customer with specific CustomerID
4. @PutMapping("/customer") = To Update a Customer
5. @DeleteMapping("/customer/{custID}") = To Delete a Customer with specific CustomerID
6. @PostMapping("/account") = To Add a New Account
7. @GetMapping("/accounts") = To Get List of All the Accounts
8. @GetMapping("/account/accountID}") = To Get the Account Details of an Account with specific AccountID
9. @PutMapping("/account") = To Update an Account
10. @DeleteMapping("/account/{accountID}") = To Delete an Account with specific AccountID
11. @PutMapping("/transfer/{accountid1}/{accountid2}/{transamount}") = To Transfer an Amount(transamount) of Money from One Account(accountid1) to Other Account(accountid2).

Note: 1. Account Type is either Individual or Joint
      2. SavOrCur is whether the account is Savings or Current


ADID: JA20127154
Batch: 22
Name: Jayesh Jagtap  