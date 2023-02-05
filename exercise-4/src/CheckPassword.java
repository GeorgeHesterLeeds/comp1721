public class CheckPassword
{
    public static boolean longEnough(String password)
    {
        return password.length() >= 12;
    };

    public static boolean atLeastTwoDigits(String password)
    {
        int numberOfDigits = 0;

        for (int i = 0; i < password.length(); i++)
        {
            int character = (int) password.charAt(i);

            if (character >= 48 && character <= 57)
                numberOfDigits++;
        }

        return numberOfDigits >= 2;
    };

    public static void main(String[] args)
    {
        if (args.length == 0)
        {
            System.err.println("Usage: java CheckPassword <password>");
            System.exit(0);
        }

        boolean validLength = longEnough(args[0]);
        boolean validNumberOfDigits = atLeastTwoDigits(args[0]);

        if (validLength && validNumberOfDigits)
        {
            System.out.println("Password is valid");
        }
        else
        {
            System.out.println("Password is not valid");
        }

        System.exit(0);
    };
}
