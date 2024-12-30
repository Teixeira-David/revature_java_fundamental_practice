/* 
--1. Challenge: Create a BankAccount class with private fields accountNumber and balance. Provide public getter and setter methods. 
--2. Challenge: Extend the BankAccount class to include:
        A deposit(double amount) method that adds the given amount to the balance.
        A withdraw(double amount) method that subtracts the given amount if the balance is sufficient; otherwise, display an error message.
        Hint: Validate the withdrawal to ensure it doesn’t result in a negative balance.
            Input: Deposit 500, Withdraw 300, Withdraw 300
            Output: Updated balance after each operation
            Error: Insufficient funds for withdrawal
--3. Challenge: Modify the BankAccount class to track transaction history in a list (e.g., List<String>). Store details like deposits, withdrawals, 
    and the resulting balance for each transaction. Add a method printTransactionHistory() to display the history.
        Hint: Update the history in the deposit and withdraw methods.
            Input: Deposit 100, Withdraw 50, Deposit 200
            Output: Transaction History:
                    1. Deposited 100. Balance: 100
                    2. Withdrawn 50. Balance: 50
                    3. Deposited 200. Balance: 250
--4 Challenge: Create a subclass SavingsAccount that extends BankAccount. Add:
        A private field interestRate (percentage).
        A calculateInterest() method that computes and adds interest to the balance.
        Hint: Call the calculateInterest() method periodically or after transactions to update the balance.
            Input: Initial Balance = 1000, Interest Rate = 5%
            Output: Balance after interest: 1050
--5. Challenge: Create a subclass CheckingAccount that extends BankAccount. Add:
        A private field overdraftLimit.
        Override the withdraw(double amount) method to allow withdrawals up to the overdraft limit. If the withdrawal exceeds the overdraft limit, display an error.
        Hint: Check both balance and overdraftLimit during a withdrawal.
            Input: Balance = 100, Overdraft Limit = 200, Withdraw 250
            Output: Successful withdrawal. Remaining Overdraft Limit: 50
            Error: Exceeds overdraft limit for withdrawal of 300
*/