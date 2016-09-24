import java.io.*;
import java.util.*;
public class Cuenta
{ 
     private      String    user;
     private      String pass;
     private      String info;
     private      boolean    admin;   
                  File   DatosCuenta= new File("cuentas.txt");

                 ArrayList<Cuenta> cuentas =new ArrayList<Cuenta>();
                 Cuenta             objeto = null;
    
   public Cuenta(String user, String pass, String info, boolean admin)
    {
         this.user=user;
         this.pass=pass;
         this.info=info; 
         this.admin=admin; 
    }     
    
   public Cuenta(){} 
   
   public  String getUser()
   {
      return this.user;
       
    }
   public  String getPass()
   {
      return this.pass;
       
    }
   public  String getInfo()
   {
      return this.info;
       
    }
   public  boolean getAdmin()
   {
      return this.admin;
       
    }
    
    public  void setUser(String u)
   {
       user=u;
       
    }
   public  void setPass(String p)
   {
       pass=p;
       
    }
   public  void setInfo(String i)
   {
       info=i;
       
    }
   public  void setAdmin(boolean a)
   {
       admin=a;
       
    }
    

   public void agregarCuenta(String user, String pass, String info, boolean admin)
      {
         try
      {  
         setUser(user);
         setPass(pass);
         setInfo(info);
         setAdmin(admin);
 
          BufferedWriter write=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(DatosCuenta,true), "utf-8"));  
 
          write.write(getUser()+"\t"+getPass()+"\t"+getInfo()+"\t"+getAdmin()+"\r\n");  
           System.out.println("La cuenta ha sido agregada exitosamente");          
          write.close();
          
        }
        catch (Exception ex) 
       {  
          //Captura un posible error le imprime en pantalla   
          System.out.println(ex.getMessage());  
       }
      } 
      
   public void txt_array()
     {
        try
        {
         String linea = null;
         BufferedReader read = new BufferedReader (new FileReader(DatosCuenta));    
         while( (linea = read.readLine()) != null)
         {
            System.out.println(linea);
            StringTokenizer split = new StringTokenizer(linea, "|");
            String           userStr =  split.nextToken().trim();
             System.out.println(userStr);
            String  passStr =  split.nextToken().trim();
            System.out.println(passStr);
            String       infoStr =  split.nextToken();
             System.out.println(infoStr);
            String     adminStr =  split.nextToken().trim();
            System.out.println(adminStr);
            
            boolean    admin=Boolean.parseBoolean(adminStr);
            
            objeto= new Cuenta(userStr,passStr,infoStr,admin);
            cuentas.add(objeto);
            
            }
         read.close();
       
       }catch (Exception ex) 
       {   
          System.out.println(ex.getMessage());  
       }
      }     
      
   public void syncArrayList()
   {
      cuentas.clear();
      txt_array(); 
   }
   
      public void mostrarObjetos()
      {
     if( cuentas.size()==0){txt_array();}
     System.out.println("=========================== Cuentas =========================================================================================================================================================================================");     
     for(Cuenta n:cuentas)
     {
      System.out.println("El user es:"+n.getUser()+"\t"+"La password es:"+n.getPass()+"\t"+"Info de usuario:"+n.getInfo()+"\t"+ "Permisos:"+ n.getAdmin());
     }  
     System.out.println("============================FIN==============================================================================================================================================================================================");
   }
   
   public void modificar_txt()
  {
    try{  
       if( cuentas.size()==0){txt_array();}
        Scanner intro =new Scanner(System.in).useDelimiter("\n");            
        int op=10;        
        while(op!=4)
             {
               menuAdmin();
               op=intro.nextInt();
               switch(op)
               {
                    case 1: System.out.println("Introducir el usuario a modificar:");      
                   String    us=intro.nextLine();
                   System.out.println("Introducir nueva contraseña:");
                   String    newPass=intro.nextLine();        
                    for(Cuenta n:cuentas)
                    {
                       
                      if(n.getUser().equals(us)){
                          
                        n.setPass(newPass);     
                        System.out.println("=========================== Cuenta =========================================================================================================================================================================================");
                        System.out.println("El usuario es:"+n.getUser()+"\t"+"y la nueva contraseña es:"+n.getPass());
                        System.out.println("============================FIN==============================================================================================================================================================================================");
                        break;
                      }else{
                          System.out.println("Usuario no encontrado");
                                         }  
                    }
                    break;
                    
                    case 2: System.out.println("Introducir el usuario a modificar:");      
                    String    us2=intro.nextLine();
                    System.out.println("Introducir nueva informacion:");      
                    String newInfo=intro.next();        
                    for(Cuenta n:cuentas)
                    {
                       
                      if(n.getUser().equals(us2)){
                          
                        n.setInfo(newInfo);    
                        System.out.println("=========================== Cuenta =========================================================================================================================================================================================");
                        System.out.println("El usuario es:"+n.getUser()+"\t"+"La nueva informacion es:"+n.getInfo());
                        System.out.println("============================FIN==============================================================================================================================================================================================");
                        break;
                      }else{
                          System.out.println("Usuario no encontrado");
                       }  
                    }
                    break;
                    
                    case 3: System.out.println("Inserte el usuario de la cuenta ha borrar");
                            String us3=intro.nextLine();   
                    try{
                      BufferedWriter write = new BufferedWriter(new FileWriter(DatosCuenta));
                      for(Cuenta n:cuentas)
                      {  
                          if(n.getUser()!=us3){
                           write.write(n.getUser()+ "\t"+n.getPass()+ "\t"+ n.getInfo()+ "\t"+ n.getAdmin()+"\r\n");
                        }else{
                          System.out.println("La cuenta ha sido eliminado");
                                         }
                      }
                      write.close();
                      cuentas.clear();
                      txt_array();
                      
                     }catch (Exception ex) 
                    {  
                      //Captura un posible error le imprime en pantalla   
                      System.out.println(ex.getMessage());  
                    }
                    
                    break;  
                    
                    case 4: System.out.println("Guardando");
                    try{
                      BufferedWriter write = new BufferedWriter(new FileWriter(DatosCuenta));
                      for(Cuenta n:cuentas)
                      {
                          write.write(n.getUser()+ "\t"+n.getPass()+ "\t"+ n.getInfo()+ "\t"+ n.getAdmin()+"\r\n");  
                      }
                      write.close();
                     }catch (Exception ex) 
                    {  
                      //Captura un posible error le imprime en pantalla   
                      System.out.println(ex.getMessage());  
                    }
                    System.exit(0);
                }
            } 
        } catch (Exception ex) 
       {  
          //Captura un posible error le imprime en pantalla   
          System.out.println(ex.getMessage());  
       }     
     }  
  
  private void menuAdmin()
   {
     System.out.println("--------Menu de configuracion-------");
     System.out.println("1. Modificar password");
     System.out.println("2. Modificar informacion de usuario ");
     System.out.println("3. Eliminar Cuenta");
     System.out.println("4. Guardar y Salir");
   }

  public  void inicio() 
   {       
       syncArrayList();
       System.out.println(cuentas.get(0).getUser());
    }
}
