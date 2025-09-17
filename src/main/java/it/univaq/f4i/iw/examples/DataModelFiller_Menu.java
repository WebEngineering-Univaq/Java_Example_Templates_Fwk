/*
 * DataModelFillerImpl.java
 * 
 * Questa classe rappresenta un semplice DataModelFiller (vedi) che carica i dati di un menu
 * dinamico in tutti i template. Si noti che la classe deve essere registrata come parametro di
 * contesto view.data.filler.X per funzionare.
 * 
 * This class is a simple DataModelFiller (see) that loads the data of a dynamic menu 
 * on all the templates. Note that this class must be registered a the context
 * parameter view.data.filler.X to work.
 * 
 */
package it.univaq.f4i.iw.examples;

import it.univaq.f4i.iw.framework.result.DataModelFiller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;


public class DataModelFiller_Menu implements DataModelFiller {

    @Override
    public void fillDataModel(Map datamodel, HttpServletRequest request, ServletContext context) {
        List<Map> menuitems = new ArrayList();
        datamodel.put("menu", menuitems);
        
        //un bean sarebbe più appropriato
        //a bean would be more appropriate
        Map menuitem = new HashMap();
        menuitem.put("label", "Menuitem 1");
        menuitem.put("link", "http://example.com/page1");
        menuitems.add(menuitem);
        
        menuitem = new HashMap();
        menuitem.put("label", "Menuitem 2");
        menuitem.put("link", "http://example.com/page2");
        menuitems.add(menuitem);
    }
    
}
