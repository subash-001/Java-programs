import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPaddress {
    public static void main(String[] args) {
       // String ipreg= "^((25[0-5]| 2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3} (25[0-5]| 2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        String ipreg= "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        Pattern pattern= Pattern.compile(ipreg);
        Matcher matcher= pattern.matcher("192.168.1.1");
        if(matcher.matches()){
            System.out.println("IP address is valid");

        }
        else{
            System.out.println("invalid");
        }
    }


}// (^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$;


// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

// public class IPAddress {
//     public static void main(String[] args) {
//         String ipRegex = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
//         Pattern pattern = Pattern.compile(ipRegex);
//         Matcher matcher = pattern.matcher("192.168.1.1");

//         if (matcher.matches()) {
//             System.out.println("IP address is valid");
//         } else {
//             System.out.println("IP address is invalid");
//         }
//     }
// }

