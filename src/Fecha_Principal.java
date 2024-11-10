import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Fecha_Principal {
    /*
    Escriba un programa que obtenga y muestre por pantalla en
    formato de España los siguientes datos:
    1. La fecha actual local.
    2. La fecha actual en Caracas.
    3. Los años transcurridos desde el descubrimiento de América.
    4. La hora actual local.
    5. La hora actual en Caracas.
    6. Las horas de diferencia entre Madrid y Caracas.
    7. La fecha y la hora cuando Neil Armstrong pisó la luna (21 de julio de
    1969 a las 3:56 hora de Madrid). Para realizar este apartado se pide
    crear un objeto LocalDateTime.
     */
    public static void main(String[] args) {
        LocalDateTime Espanna = LocalDateTime.now();
        ZonedDateTime Caracas = ZonedDateTime.now(ZoneId.of("America/Caracas"));
        System.out.println("Fecha actual local: "+ formatoFecha(Espanna));
        System.out.println("Fecha actual en Caracas: "+ formatoFecha(Caracas));
        System.out.println("Años transcurridos desde el descubrimiento de América: "
                +LocalDateTime.now().minusYears(1492).getYear());
        System.out.println("Hora actual local: "+Espanna.toLocalTime());
        System.out.println("Hora actual Caracas: "+Caracas.toLocalTime());
        System.out.println("Horas de diferencia entre Madrid y Caracas: "
                +(Espanna.getHour()-Caracas.getHour()));
        LocalDateTime laLuna = LocalDateTime.of(1969,7,21,3,56);
        System.out.println("Fecha de aterrizaje lunar: "+ formatoFecha(laLuna));
    }
    public static String formatoFecha(LocalDateTime fecha) {
        return fecha.getHour()+":"+fecha.getMinute()+" "+fecha.getDayOfWeek()+" "+fecha.getDayOfMonth()+
                " "+fecha.getMonth()+" "+fecha.getYear();
    }
    public static String formatoFecha(ZonedDateTime fecha) {
        return fecha.getHour()+":"+fecha.getMinute()+" "+fecha.getDayOfWeek()+" "+fecha.getDayOfMonth()+
                " "+fecha.getMonth()+" "+fecha.getYear();
    }
}