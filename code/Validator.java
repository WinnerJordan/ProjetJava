import java.util.Scanner;
import java.util.List;
import java.util.*;
import java.util.regex.*;

public class Validator {
   //Validations 


   public boolean isNci(String nci)
    {
        boolean verification = nci.startsWith("2") || nci.startsWith("1") && nci.length() == 17;
        return verification;
    }

    public boolean isMail(String email)
    {
        String chars = "^[a-z0-9_.-]+@[a-z0-9_-]+\\.[a-z]+$";
        Pattern pattern = Pattern.compile(chars);
        return pattern.matcher(email).matches();
    }

    public boolean isPhoneNumber(int tel)
    {
        String strTel;
        strTel = Integer.toString(tel);
        boolean verification = strTel.length() == 9 && (strTel.startsWith("33") || strTel.startsWith("77") || strTel.startsWith("78") || strTel.startsWith("76") || strTel.startsWith("70")) ;
        return verification;
    }
    
    public boolean valideDimensions()
    {
        return true;
    };

}

