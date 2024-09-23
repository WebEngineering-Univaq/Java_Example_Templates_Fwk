/*
 * DataModelFiller_Context.java
 * 
 * Questa classe rappresenta un semplice DataModelFiller (vedi) che carica le proprietà
 * di sistema Java in tutti i template. Si noti che la classe deve essere registrata come parametro di
 * contesto view.data.filler.X per funzionare.
 * 
 * This class is a simple DataModelFiller (see) that loads Java system properties  
 * in all the templates. Note that this class must be registered a the context
 * parameter view.data.filler.X to work.
 * 
 */
package it.univaq.f4i.iw.examples;

import it.univaq.f4i.iw.framework.result.DataModelFiller;
import java.util.Map;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;


public class DataModelFiller_Context implements DataModelFiller {

    @Override
    public void fillDataModel(Map datamodel, HttpServletRequest request, ServletContext context) {
        for(Map.Entry<Object, Object> p : System.getProperties().entrySet())
        datamodel.put(p.getKey().toString().replace(".", "_"),p.getValue());
    }    
}
