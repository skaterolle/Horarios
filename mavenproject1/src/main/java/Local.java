
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Local {
 Date fechaAntigua = new Date();
LocalDate fechaNueva = fechaAntigua.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
}
