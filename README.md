# statePattern

# Definition

The state design pattern is a behavioral pattern that allows an object to change its behavior when its internal state changes. Instead of having multiple conditional statements within the object's code, each state becomes a separate object responsible for handling its specific behavior. This makes the code more maintainable, extensible, and easier to understand.

# Benefits

The state design pattern offers several valuable benefits:

# Improved Readability and Maintainability:
By encapsulating state-specific behavior in separate classes, the code becomes more modular and easier to   understand. Each state object is responsible for its own behavior, making it easier to reason about the code and identify potential issues.
Changes to a specific state's behavior only affect that class, reducing the risk of unintended side effects in other parts of the code.

# Reduced Complexity:
Eliminates long chains of conditional statements (like if-else or switch) within the context object. This can significantly improve code readability and reduce complexity, especially when dealing with multiple states and complex state transitions.
Easier to Add New States:
Introducing new states requires creating a new concrete state class and implementing its specific behavior. This doesn't affect existing code, making it relatively simple to adapt the system to new requirements without modifying existing logic.

# Enhanced Flexibility:
The state design pattern can be effectively combined with other patterns like strategy, making it even more flexible. You can easily swap different state implementations dynamically, allowing for more adaptable and configurable systems.

# Clearer State Tracking:
By explicitly representing and managing state as objects, the code becomes more self-documenting. It's clear which state the context is currently in, and how it transitions between states. This can be helpful for debugging and understanding the overall system behavior.

# Better Testability:
Each state object can be tested independently, simplifying unit testing and ensuring the correctness of each state's behavior.

Components:

# Context: 
The object whose behavior changes based on its state. It holds a reference to the current state object and delegates state-specific operations to it.

# State Interface: 
Defines the operations that all concrete state objects must implement. This ensures a consistent way of interacting with different states.

# Concrete State Classes: 
Implement the State interface and encapsulate the behavior specific to their respective states. They represent different states the Context object can be in.

# 1. Problem Scenario

A bank needs to manage different states of customer accounts, including active, suspended, and closed. Each state has specific rules and restrictions regarding allowed operations, and accounts have associated attributes like account number and balance.

● Active accounts: Allow deposits and withdrawals.

● Suspended accounts: Disallow deposits and withdrawals transactions, but allow viewing account information.

● Closed accounts: Disallow all transactions and viewing of account information.

Currently, the system relies on conditional statements within the Account class to check the account state and determine valid actions. This approach becomes cumbersome and error-prone as the number of states and their associated logic grows.

Implement the State pattern to improve code maintainability and flexibility:

Define Account States: Create separate classes representing different account states: ActiveState, SuspendedState, and ClosedState.

Implement State Interface: Define an interface AccountState with methods for common actions like deposit, withdraw, activate, suspend, and close.

Implement State Behaviors: Each concrete state class implements the AccountState interface, providing specific behavior for its respective state. For example, the ActiveState class would allow deposits and withdrawals, while the ClosedState wouldn't allow any transactions.

Update Account Class:

○ Include attributes for accountNumber and balance.

○ Remove state-specific logic from the Account class.

○ Introduce a reference to the current AccountState object.

○ Delegate actions like deposit, withdraw, activate, suspend, and close to the current state object through its corresponding methods.
Logic:

If the account is active
    You can either suspend it or close it.
If the account is suspended
    You can either activate or close it.
     No deposits and withdrawals allowed.
If the account is closed
     You can neither suspend nor activate it.
      No deposits and withdrawals allowed.


Composition of Account:
attributes:
accountNumber : String
balance:  Double
accountState:  AccountState

Methods:
Setter and getter methods
deposit(Double depositAmount): void
withdraw(Double withdrawAmount): void
suspend(): void
activate(): void
close() : void
toString()   // displays account number and balance

Note:  No if-else, switch will be used

Create AccountTest() class to test the Account:


public class AccountTest()
{
  public static void main (String[] args)
  {
  
    Account myAccount = new Account("1234", 10000.0); //set acct to active state
    
    myAccount.activate(); // displays "Account is already activated!"

    //Suspend the account
    myAccount.suspend(); //displays "Account is suspended!"

    //Activate the account
    myAccount.activate() //displays "Account is activated!"

    //Deposit to the account
    myAccount.deposit(1000.0);// update balance and displays account number and // current balance. Call the toString() method in deposit().

    //Withdraw to the account
    myAccount.withdraw(100.0);// update balance and displays account number and // current balance. Call the toString() method in withdraw().

    //Close the account()
    myAccount.close() //displays "Account is already closed!"

    //Activate the account
    myAccount.activate() // Displays "You cannot activate a closed account!"

    //Suspend the account
    my.Account.activate() // Displays " You cannot suspend a closed account!"

    //Withdraw to the account
    myAccount.withdraw(500.0);// Show message "You cannot withdraw on a closed account!". Call the toString() to show current balance and account number.

    //Deposit to the account
    myAccount.deposit(1000.0);// Show message "You cannot deposit on closed //account!". Call the toString() to show current balance and account number.

       }
    }



# 2. UML Diagram





# 3. Java Source codes (Solution)

![CSL322-18_WK5-6_STATE_PATTERN_CHUA_VINCE](https://github.com/VinceTedChua/statePattern/assets/142372312/f7e006e5-c58f-4a49-99b6-c00d4049049a)
 1) From the AccountTest Java can encapsulate the series of steps need to acquire.. In this step shows the sequence of what is to be done.


![S1_CSL322-18_WK5-6_STATE_PATTERN_CHUA_VINCE](https://github.com/VinceTedChua/statePattern/assets/142372312/46bc2520-86ab-4f30-9cd4-e36f1502b103)
 2) These first series of steps shows how Activate, Suspend, Activate, Deposit and Withdraw was accomplished.


![S2_CSL322-18_WK5-6_STATE_PATTERN_CHUA_VINCE](https://github.com/VinceTedChua/statePattern/assets/142372312/c50d658e-f6f2-4774-b325-a32018a40cd7)
 3) Next, it was followed by the Close, Activate, Suspend, Withdraw and Deposit sequence.

