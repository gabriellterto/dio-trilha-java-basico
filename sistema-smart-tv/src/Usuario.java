public class Usuario {
    public static void main(String[] args) {

       SmartTv smartTv = new SmartTv();

       System.out.println("TV ligada? " + smartTv.ligada);
       System.out.println("Canal: " + smartTv.canal);
       System.out.println("Volume Atual: " + smartTv.volume);

       smartTv.ligar();
       System.out.println("TV ligada? " + smartTv.ligada);

       smartTv.mudarCanal(13);
       System.out.println("Canal: " + smartTv.canal);
       smartTv.aumentarCanal();
       System.out.println("Canal: " + smartTv.canal);
       smartTv.diminuirCanal();
       System.out.println("Canal: " + smartTv.canal);

       smartTv.aumentarVolume();
       System.out.println("Volume Atual: " + smartTv.volume);
       smartTv.diminuirVolume();
       System.out.println("Volume Atual: " + smartTv.volume);

       smartTv.desligar();
       System.out.println("TV ligada? " + smartTv.ligada);


    }
}