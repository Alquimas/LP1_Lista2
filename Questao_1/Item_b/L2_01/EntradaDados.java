package L2_01;

public abstract class EntradaDados
{
    private final static String[] validEmails = 
    {
        "@gmail.com",
        "@hotmail.com",
        "@outlook.com"
    };
    
    public static boolean VerificaMatricula(String matricula)
    {
        int n = matricula.length();
        
        if(n != 5) return false;
        
        for(int i = 0; i < 5; i++)
            if(matricula.charAt(i) > '9' || matricula.charAt(i) < '0')
                return false;
                
        return true;
    }
    
    public static boolean VerificaEmail(String email)
    {
        if(email.indexOf('@') == -1 || email.indexOf('@') != email.lastIndexOf('@'))
            return false;
            
        int n = email.indexOf('@');
            
        if(email.charAt(0) == '-' || email.charAt(0) == '@' || email.charAt(n-1) == '-')
            return false;
        
        for(int i = 0; i < n; i++)
        {
            char c = email.charAt(i);
            if((c < '0' || c > '9') && (c < 'A' || c > 'Z') && (c < 'a' || c > 'z') && (c != '-'))
                return false;
        }
        
        String s = email.substring(n, email.length());
        
        for(int i = 0; i < 3; i++)
        {
            if(s.equals(validEmails[i]))
                return true;
        }
        return false;
    }
    
    public static boolean VerificaTelefone(String telefone)
    {
        if(telefone.length() != 11) return false;
        
        for(int i = 0; i < 11; i++)
        {
            if(telefone.charAt(i) < '0' || telefone.charAt(i) > '9')
                return false;
        }
        
        return true;
    }
    
    public static boolean VerificaEntradaString(String s)
    {
        for(char c: s.toCharArray())
        {
            if(!(c == ' ' || (c >= 'a' && c <= 'z') || 
            (c >= 'A' && c <= 'Z') || c >= 'À' && c <= 'ź'))
            {
                return false;
            }
        }
        return true;
    }
    
    public static boolean VerificaEntradaInt(String s)
    {
        try
        {
            Integer.parseInt(s);
            return true;
        } catch(NumberFormatException error)
        {
            return false;
        }
    }
}