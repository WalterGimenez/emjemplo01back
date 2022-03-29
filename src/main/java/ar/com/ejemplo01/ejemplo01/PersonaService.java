
package ar.com.ejemplo01.ejemplo01;

import java.util.List;


public interface PersonaService {
    List<Persona>list();
    Persona listId(int id);
    Persona add(Persona p);
    Persona edit(Persona p);
    Persona delete(int id);
    
}
