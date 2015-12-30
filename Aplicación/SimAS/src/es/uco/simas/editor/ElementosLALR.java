//SimAS  / editor
// ElementosLALR

package es.uco.simas.editor;

import es.uco.simas.util.gramatica.Produccion;
import java.util.ArrayList;

/**
 * @author vanesa
 */
public class ElementosLALR {
    
    Produccion produc;
    int posicion;
    ArrayList<String> anticipacion = new ArrayList();
    String pivote;    
    
    public ElementosLALR(Produccion produc, int posicion, String pivote, ArrayList<String> anticipacion){
        this.produc = produc;
        this.posicion = posicion;        
        this.pivote = pivote;
        this.anticipacion = anticipacion;        
    }
    public ElementosLALR(){
        
    }

    public Produccion getProduc() {
        return produc;
    }

    public void setProduc(Produccion produc) {
        this.produc = produc;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public ArrayList<String> getAnticipacion() {
        return anticipacion;
    }

    public void setAnticipacion(ArrayList<String> anticipacion) {
        this.anticipacion = anticipacion;
    }        

    public String getPivote() {
        return pivote;
    }

    public void setPivote(String pivote) {
        this.pivote = pivote;
    }            
}