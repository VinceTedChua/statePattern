public class Account {
    //initialized the data sets
    private String accountNumber;
    private Double balance;
    private AccountState accountState;

    //sets the composized attributes
    public Account (String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState();
    }
        //setters and getters
        //get/set AccNumber get/set AccBalance
        //get/set AccState //deposit, withdraw, activate suspend and close
        // to string
        //with sys out.
        //suspend and active (this)
        //deposit and witthdraw has withdraw/Deposit , this)


        //setters
        public void setAccountNumber (String accountNumber)
        {
            this.accountNumber = accountNumber;
        }
        public void setBalance (Double balance)
        {
            this.balance = balance;
        }
        public void setAccountState(AccountState accountState)
        {
            this.accountState = accountState;
        }

         //getters
        public String getAccountNumber()
        {
        return accountNumber;
        }
        public Double getBalance()
        {
        return balance;
        }
        public AccountState getAccountState() {
        return accountState;
        }

    //modes of banking
        public void deposit(Double depositAmount)
        {
            accountState.deposit(depositAmount,this);
        }
        public void withdraw(Double withdrawAmount)
        {
            accountState.withdraw(withdrawAmount,this);
        }
         public void suspend()
         {
        accountState.suspend(this);
         }
        public void activate()
         {
        accountState.activate(this);
         }
        public void close()
        {
        accountState.close(this);
        }
        public String toString()
        {
            String acc = new String();
            acc = "\nThe Account Number: " + accountNumber +
                    "\nCurrent Balance: $" + balance;
            return acc;
        }
}
