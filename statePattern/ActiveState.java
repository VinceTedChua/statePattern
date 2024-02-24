public class ActiveState implements AccountState {
//Active State enables deposits and withdrawals.
    public void deposit(Double depositAmount, Account account)
{
    account.setBalance(account.getBalance() + depositAmount);
    System.out.println("\nAmount will be deposited:$" + depositAmount + account.toString());
}
    public void withdraw(Double withdrawAmount, Account account)
    {
        //takes away current balance to the withdrawn amount.
        account.setBalance(account.getBalance() - withdrawAmount);
        System.out.println("\nAmount will be withdrawn:$" + withdrawAmount  + account.toString());
    }
    //Terminates account.
    public void suspend(Account account)
    {
    System.out.print("Account is suspended! ");
    }
    //Opt for activation
    public void activate(Account account)
    {
      System.out.println("\nAccount is already activated! ");
    }
    //Opt for closing a bank
    public void close(Account account)
        {
            account.setAccountState(new ClosedState());
            System.out.println("\nAccount is Closed!" + account.toString());

        }

}
