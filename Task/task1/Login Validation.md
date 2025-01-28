## Login validation
``` java []
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        // Correct username and password

        String correctUsername = "Sharanya01";
        String correctPassword = "sharanya010605";

        // Input from user

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = sc.nextLine().trim(); // Remove extra spaces

        System.out.print("Enter your password: ");
        String password = sc.nextLine().trim(); // Remove extra spaces

        // Check if username and password are correct using equalsIgnoreCase for username

        if (username.equalsIgnoreCase(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful!");
        } else if (!username.equalsIgnoreCase(correctUsername)) {
            System.out.println("Username is incorrect.");
        } else {
            System.out.println("Password is incorrect.");
        }
    }
}

```
## Output

```java []
"C:\Program Files\Java\jdk-23\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.2\lib\idea_rt.jar=57411:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.2\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\A\IdeaProjects\JavaPlacement\out\production\JavaPlacement Login
Enter your username: Sharanya01
Enter your password: SHARANY010605
Password is incorrect.

Process finished with exit code 0
```

``` java []
"C:\Program Files\Java\jdk-23\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.2\lib\idea_rt.jar=57470:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.2\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\A\IdeaProjects\JavaPlacement\out\production\JavaPlacement Login
Enter your username:    SHARANYA01 
Enter your password: sharanya010605
Login successful!

Process finished with exit code 0

```

```java []
"C:\Program Files\Java\jdk-23\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.2\lib\idea_rt.jar=57484:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.2\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\A\IdeaProjects\JavaPlacement\out\production\JavaPlacement Login
Enter your username: Strjh01
Enter your password: sharanya010605
Username is incorrect.

Process finished with exit code 0

```


