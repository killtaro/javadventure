
package EDA;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public enum TipoStatus {
    NORMAL(1, "Normal"), SANGRANDO(2, "Sangrando"), ATORDOADO(3, "Atordoado"), MOTIVADO(4, "Motivado");
    
    int id;
    String status;
    
    TipoStatus(int id, String status){
        this.id = id;
        this.status = status;
    }
    
    public String toString(){
        return status;
    }
}
