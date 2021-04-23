import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //cliente
        Cliente luis = new Cliente("isa","peres","lopez",4);
        //ciudad
        Ciudad Sucre= new Ciudad(4,"sucre");
        Ciudad SantaCruz=new Ciudad(7,"SantaCruz");
        Ciudad Cochabamba =new Ciudad(6,"Cochabamba");
        //categoria
        Categoria turista = new Categoria(1,"turista");

        //AEROPUERTOS

        Aeropuerto jorgeWistermann = new Aeropuerto("Jorge Wistermann","JM",Sucre);
        Aeropuerto viruviru= new Aeropuerto("viru viru","VV",SantaCruz);
        Aeropuerto OrielLeaPlaza=new Aeropuerto("Oriel Lea Plaza","OLP",Cochabamba);

        //vuelos
        List<Vuelo> vuelos =new  ArrayList<>();
        Vuelo SucreSantaCruz= new Vuelo("BOA-122", Calendar.getInstance().getTime(),jorgeWistermann, viruviru);
        vuelos.add(SucreSantaCruz);
        Vuelo SantaCruzCochabamba=new Vuelo("boa-234",Calendar.getInstance().getTime(),viruviru,OrielLeaPlaza);
        vuelos.add(SantaCruzCochabamba);
        // billetes
        Billete billete=new Billete(1,Calendar.getInstance().getTime(),500.4,luis,Sucre,SantaCruz,turista,vuelos);
        System.out.println("Id: "+ billete.getIdBillete() );
        System.out.println("Fecha: " +billete.getFechaEmision());
        System.out.println("Precio total " + billete.getPrecioTotal());
        System.out.println("Cliente: " + billete.getCliente().getNombre());
        System.out.println("Origen: "+billete.getOrigen().getNombre() );
        System.out.println("Destino: " + billete.getDestino().getNombre());
        System.out.println("Categoria: "+billete.getCategoria().getNombre());
        System.out.println("Vuelos: ");
        for (Vuelo vuelo:billete.getVuelos()) {
            System.out.println("Codigo vuelo: "+vuelo.getCodigoVuelo() + "| Salida: " + vuelo.getSalida() + "| Origen: " + vuelo.getOrigen().getNombre() + "| Destino: "+vuelo.getDestino().getNombre());


        }


    }

}
