public class SuspendedState implements AccountState
{
    //Close State disables most of the features..
    public void deposit(Double depositAmount, Account account)
    {
        System.out.println("You cannot deposit on a suspended account!: " + depositAmount
                + account.toString() + "\n");
    }
    public void withdraw(Double withdrawAmount, Account account)
    {
        System.out.println("You cannot withdraw on a suspended account: " + withdrawAmount +
                account.toString() + "\n");
    }

    public void suspend(Account account)
    {
        System.out.print("Account is already suspended! ");
    }

    public void activate(Account account)
    {
        System.out.println("Account is activated");
    }

    public void close(Account account)
    {
        System.out.println("Account is closed! ");
    }

}
