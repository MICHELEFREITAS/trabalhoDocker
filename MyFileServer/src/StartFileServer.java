import java.rmi.Naming;

public class StartFileServer {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try{

            java.rmi.registry.LocateRegistry.createRegistry(1098);

            FileServer fs=new FileServer();
            fs.setFile("serverdata.txt");
            Naming.rebind("rmi://localhost/TrabalhoDocker", fs);
            System.out.println("Servidor de arquivos está pronto!");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}