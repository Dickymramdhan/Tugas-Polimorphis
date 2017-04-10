import java.*;
import java.io.*;
/*class induk dengan nama Bentukwajah*/
class Bentukwajah
{
    /*Membuat sebuah method respons pada class induk dimana mengembalikan
     *sebuah nilai String*/
    public String respons()
    {
        return("Perhatikan reaksi wajah saya\n");    
    }
}
/*Membuat class-class lain dengan turunan dari class Bentukwajah*/
class Senyum extends Bentukwajah
{
    public String respons()
    {
        return("Dicky Senyum karena senang\n");
    }
}
class Tertawa extends Bentukwajah
{
    public String respons()
    {
        return("Dicky Tertawa karena gembira\n");
    }
}
class Marah extends Bentukwajah
{
    public String respons()
    {
        return("kemarahan Dicky disebabkan bertangkar\n");
    }
}    
class Sedih extends Bentukwajah
{
    public String respons()
    {
        return("Dicky Sedih disebabkan cemburu\n");
    }
}