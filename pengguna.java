public class pengguna {
    private int id;
    private String username;
    private String password;
    
    public void login(){
        System.out.println("Ini method untuk Login");

    }
        
    public void lupaPassword(){
        System.out.println("Ini method Lupa Password");

    }
        
    public void daftar(){
        System.out.println("Ini method Daftar user baru");

    }

    public int getId(){
        return this.id;
    }
            
    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }
}
